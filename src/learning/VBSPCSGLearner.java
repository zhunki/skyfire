package learning;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.TreeMap;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.javascript.CountErrorListener;
import antlr.javascript.JavaScriptLexer;
import antlr.javascript.JavaScriptParser;
import antlr.javascript.JavaScriptParserBaseVisitor;
import antlr.vbs.VisualBasic6BaseVisitor;
import antlr.vbs.VisualBasic6Lexer;
import antlr.vbs.VisualBasic6Parser;


public class VBSPCSGLearner {
	// parent of a production rule
	static Map<String, Integer> parentCount = new TreeMap<String, Integer>();
	// production rule with the form:
	// <c1,c2,c3,c4>parent->TerminalNodeImpl@@@@@part3#####TerminalNodeImpl
	static Map<String, Integer> ruleCount = new TreeMap<String, Integer>();
	public static int maxChildCount = 100;
	public static int maxChildLength = 200;
	//
	public static boolean parsingError = false;

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/pcsg";
	static final String USER = "test";
	static final String PASS = "1234";

	public static void main(String[] args) {
		// 1. traverse a folder with samples,.e.g.xml samples
		String sampleFolderPath = "C:\\Users\\xiang\\Desktop\\vbs\\";
		File dir = new File(sampleFolderPath);
		File[] files = dir.listFiles();
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				String samplePath = files[i].getAbsolutePath();
				System.out.println("processing: " + samplePath);
				try {
					// 2. parse each sample
					parsingError = false;
					VisualBasic6Lexer lexer = new VisualBasic6Lexer(new ANTLRFileStream(samplePath));
					CountErrorListener errorListener = new CountErrorListener();
					lexer.removeErrorListeners();
					lexer.addErrorListener(errorListener);
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					VisualBasic6Parser parser = new VisualBasic6Parser(tokens);
					parser.removeErrorListeners();
					parser.addErrorListener(errorListener);
					ParseTree tree = parser.startRule();
					if (parsingError) {
						System.out.println("--------------");
						continue;
					}

					// System.out.println("---" + tree.toStringTree());
					// 3. traverse the sample and count parent
					VisualBasic6BaseVisitor visitor = new VisualBasic6BaseVisitor();
					visitor.visit(tree);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("--------------");
			}
		}
		for (final String k : parentCount.keySet()) {
			System.out.println(k + ": " + parentCount.get(k));
		}
		System.out.println("=====================================");
		System.out.println("PCSG:");
		System.out.println("=====================================");

		// for (final String k : ruleCount.keySet()) {
		// System.out.println(k + ": "+ (float) ruleCount.get(k) /
		// parentCount.get(k.substring(k.indexOf(">") + 1, k.indexOf("->"))));
		// }
		instorePCSG();
	}

	public static void updateParentCount(String parentID) {
		if (parentCount.containsKey(parentID)) {
			parentCount.put(parentID, parentCount.get(parentID) + 1);
		} else {
			parentCount.put(parentID, 1);
		}
	}

	public static void updateRuleCount(String ruleID) {
		if (ruleCount.containsKey(ruleID)) {
			ruleCount.put(ruleID, ruleCount.get(ruleID) + 1);
		} else {
			ruleCount.put(ruleID, 1);
		}
	}

	public static void instorePCSG() {
		Connection conn = null;
		Statement stmt = null;
		String sql = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("linking to MySQL....");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			sql = "insert into vbspcsg(parent, context, rule, prob) values \n";
			int i = 0;
			for (String k : ruleCount.keySet()) {
				i++;
				sql += "('" + k.substring(k.indexOf(">") + 1, k.indexOf("->")) + "','" + k.substring(1, k.indexOf(">"))
						+ "','" + k.substring(k.indexOf("->")+2).replaceAll("\\\\", "\\\\\\\\").replaceAll("'", "\\\\'") + "',"
						+ (float) ruleCount.get(k) / parentCount.get(k.substring(k.indexOf(">") + 1, k.indexOf("->")))
						+ "),\n";
				if (i % 500 == 0) {
					sql += "('','','',1.0);";
					//System.out.println(sql);
					stmt.executeUpdate(sql);
					stmt.close();
					stmt = conn.createStatement();
					sql = "insert into vbspcsg(parent, context, rule, prob) values \n";
				}
			}
			sql += "('','','',1.0);";
			// System.out.println(sql);
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			System.out.println(sql);
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}

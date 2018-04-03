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

import antlr.xml.CountErrorListener;
import antlr.xml.XMLLexer;
import antlr.xml.XMLParser;
import antlr.xml.XMLParserBaseVisitor;

public class PCSGLearner {
	// parent of a production rule
	static Map<String, Integer> parentCount = new TreeMap<String, Integer>();
	// production rule with the form:
	// parent->TerminalNodeImpl@@@@@part3#####TerminalNodeImpl
	static Map<String, Integer> ruleCount = new TreeMap<String, Integer>();
	//
	public static boolean parsingError = false;

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/pcsg";
	static final String USER = "test";
	static final String PASS = "1234";

	public static void main(String[] args) {
		// 1. traverse a folder with samples,.e.g.xml samples
		String sampleFolderPath = "E:\\xsl1";
		File dir = new File(sampleFolderPath);
		File[] files = dir.listFiles();
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				String samplePath = files[i].getAbsolutePath();
				System.out.println("processing: " + samplePath);
				try {
					// 2. parse each sample
					parsingError = false;
					XMLLexer lexer = new XMLLexer(new ANTLRFileStream(samplePath));
					CountErrorListener errorListener = new CountErrorListener();
					lexer.removeErrorListeners();
					lexer.addErrorListener(errorListener);
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					XMLParser parser = new XMLParser(tokens);
					parser.removeErrorListeners();
					parser.addErrorListener(errorListener);
					ParseTree tree = parser.document();
					if (parsingError) {
						System.out.println("--------------");
						continue;
					}

					// System.out.println("---" + tree.toStringTree());
					// 3. traverse the sample and count parent
					XMLParserBaseVisitor visitor = new XMLParserBaseVisitor();
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
		for (final String k : ruleCount.keySet()) {
			System.out.println(k + ": " + (float) ruleCount.get(k) / parentCount.get(k.substring(0, k.indexOf("->"))));
		}
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
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("linking to MySQL....");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			String sql = "insert into pcsg(parent, context, rule, prob) values \n";
			for (String k : ruleCount.keySet()) {
				sql += "('" + k.substring(0, k.indexOf("->")) + "','context','" + k.replaceAll("'", "\\\\'") + "',"
						+ (float) ruleCount.get(k) / parentCount.get(k.substring(0, k.indexOf("->"))) + "),\n";

			}
			sql += "('','',',1.0);";
			System.out.println(sql);
			stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (SQLException se) {
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

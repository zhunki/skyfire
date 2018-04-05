# skyfire

1. to generate Lexer, Parser, Visitor automatically, take xml as example

add antlr-4.7-complete.jar to classpath
>java org.antlr.v4.Tool -o E:\xml\ -visitor -no-listener -Dlanguage=Java E:\xml\XMLLexer.g4
>java org.antlr.v4.Tool -o E:\xml\ -visitor -no-listener -Dlanguage=Java E:\xml\XMLParser.g4

2. install MySQL

download MySQL community version: mysql-installer-community-5.7.21.0.msi
double click and install
create new database pcsg
create new table pcsg

>create table pcsg (
id int auto_increment,
parent varchar(100) not null,
context varchar(500) not null,
rule varchar(4000) not null,
prob float not null,
primary key(id)
);

download mysql-connector-java-5.1.46.tar.gz from http://dev.mysql.com/downloads/connector/j/ and unzip it
add mysql-connector-java-5.1.46-bin.jar to build path

3.change Visitor

change the original visitor function to extract context and rule information

	public T visitDocument(XMLParser.DocumentContext ctx) {
		return visitChildren(ctx);
	}


	public T visitDocument(XMLParser.DocumentContext ctx) {
		String parent = "null", grandparent = "null", greatparent = "null", sibling = "null";
		if (ctx.getParent() != null) {
			parent = ctx.getParent().getClass().getSimpleName();
			if (ctx.getParent().getParent() != null) {
				grandparent = ctx.getParent().getParent().getClass().getSimpleName();
				if (ctx.getParent().getParent().getParent() != null) {
					greatparent = ctx.getParent().getParent().getParent().getClass().getSimpleName();
				}
			}
			if (ctx.getParent().getChild(0) != null) {
				// sibling = ctx.getParent().getChild(0).getClass().getSimpleName();
			}
		}
		String rule = "<" + greatparent + "," + grandparent + "," + parent + "," + sibling + ">";
		rule += ctx.getClass().getSimpleName() + "->";
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < PCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > PCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, PCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		PCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		PCSGLearner.updateRuleCount(rule);
		return visitChildren(ctx);
}
	
4. first run PCSGLearner class to learn from samples

some optimizations for XML:
ChardataContext and MiscContext nodes normally contain a string whose value is useless to grammar. Therefore, we omit those nodes to get a much smaller PCSG.
The non-terminal child of ContentContext contains comment and we omit them to reduce size of PCSG.

5. run Generator class to generate samples

Several parameters affect the seed and complexity of generation and users can change them as their needs.

	static int maxDerivation = 50;			// the max number of derivation
	static int maxDerivationDepth = 8;		// the max iteration depth of derivation
	int numOfSamplesToGenerate = 10; 		// the number of seeds to generate
	String outputPath = "E:\\xml_gen\\";	//the path to save generated seeds
 
 
 
 
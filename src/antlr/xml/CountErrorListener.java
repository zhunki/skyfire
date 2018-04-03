package antlr.xml;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import learning.PCSGLearner;

public class CountErrorListener extends BaseErrorListener {
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		System.out.println("parsingError: line " + line + ":" + charPositionInLine + " " + msg);
		PCSGLearner.parsingError = true;
	}
}

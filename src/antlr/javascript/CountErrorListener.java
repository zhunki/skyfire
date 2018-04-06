package antlr.javascript;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import learning.JSPCSGLearner;

public class CountErrorListener extends BaseErrorListener {
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		System.out.println("parsingError: line " + line + ":" + charPositionInLine + " " + msg);
		JSPCSGLearner.parsingError = true;
	}
}

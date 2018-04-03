package antlr.xml;

// Generated from E:\xml\XMLParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import learning.PCSGLearner;

/**
 * This class provides an empty implementation of {@link XMLParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class XMLParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements XMLParserVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDocument(XMLParser.DocumentContext ctx) {
		String rule = ctx.getClass().getSimpleName() + "->";
		if (ctx.getChildCount() > 0) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "@@@@@";
				}
			}
		}
		PCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		PCSGLearner.updateRuleCount(rule);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitProlog(XMLParser.PrologContext ctx) {
		String rule = ctx.getClass().getSimpleName() + "->";
		if (ctx.getChildCount() > 0) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "@@@@@";
				}
			}
		}
		PCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		PCSGLearner.updateRuleCount(rule);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitContent(XMLParser.ContentContext ctx) {
		String rule = ctx.getClass().getSimpleName() + "->";
		if (ctx.getChildCount() > 0) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "@@@@@";
				}
			}
		}
		PCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		PCSGLearner.updateRuleCount(rule);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitElement(XMLParser.ElementContext ctx) {
		String rule = ctx.getClass().getSimpleName() + "->";
		if (ctx.getChildCount() > 0) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		}
		PCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		PCSGLearner.updateRuleCount(rule);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitReference(XMLParser.ReferenceContext ctx) {
		String rule = ctx.getClass().getSimpleName() + "->";
		if (ctx.getChildCount() > 0) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "@@@@@";
				}
			}
		}
		PCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		PCSGLearner.updateRuleCount(rule);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute(XMLParser.AttributeContext ctx) {
		String rule = ctx.getClass().getSimpleName() + "->";
		if (ctx.getChildCount() > 0) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "@@@@@";
				}
			}
		}
		PCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		PCSGLearner.updateRuleCount(rule);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitChardata(XMLParser.ChardataContext ctx) {
		String rule = ctx.getClass().getSimpleName() + "->";
		if (ctx.getChildCount() > 0) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "@@@@@";
				}
			}
		}
		PCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		PCSGLearner.updateRuleCount(rule);
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMisc(XMLParser.MiscContext ctx) {
		String rule = ctx.getClass().getSimpleName() + "->";
		if (ctx.getChildCount() > 0) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "@@@@@";
				}
			}
		}
		PCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		PCSGLearner.updateRuleCount(rule);
		return visitChildren(ctx);
	}
}
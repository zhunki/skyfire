package antlr.xml;

// Generated from E:\xml\XMLParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import learning.XMLPCSGLearner;

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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < XMLPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > XMLPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, XMLPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		XMLPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		XMLPCSGLearner.updateRuleCount(rule);
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < XMLPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > XMLPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, XMLPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		XMLPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		XMLPCSGLearner.updateRuleCount(rule);
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < XMLPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += "";
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		XMLPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		XMLPCSGLearner.updateRuleCount(rule);
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < XMLPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > XMLPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, XMLPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		XMLPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		XMLPCSGLearner.updateRuleCount(rule);
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < XMLPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > XMLPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, XMLPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		XMLPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		XMLPCSGLearner.updateRuleCount(rule);
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < XMLPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > XMLPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, XMLPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		XMLPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		XMLPCSGLearner.updateRuleCount(rule);
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < XMLPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += " ";
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		XMLPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		XMLPCSGLearner.updateRuleCount(rule);
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < XMLPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += " ";
				} else {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		XMLPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		XMLPCSGLearner.updateRuleCount(rule);
		return visitChildren(ctx);
	}
}
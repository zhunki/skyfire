package antlr.vbs;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import learning.VBSPCSGLearner;

/**
 * This class provides an empty implementation of {@link VisualBasic6Visitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class VisualBasic6BaseVisitor<T> extends AbstractParseTreeVisitor<T> implements VisualBasic6Visitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStartRule(VisualBasic6Parser.StartRuleContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitModule(VisualBasic6Parser.ModuleContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitModuleReferences(VisualBasic6Parser.ModuleReferencesContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitModuleReference(VisualBasic6Parser.ModuleReferenceContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitModuleReferenceValue(VisualBasic6Parser.ModuleReferenceValueContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitModuleReferenceComponent(VisualBasic6Parser.ModuleReferenceComponentContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitModuleHeader(VisualBasic6Parser.ModuleHeaderContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitModuleConfig(VisualBasic6Parser.ModuleConfigContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitModuleConfigElement(VisualBasic6Parser.ModuleConfigElementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitModuleAttributes(VisualBasic6Parser.ModuleAttributesContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitModuleOptions(VisualBasic6Parser.ModuleOptionsContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitOptionBaseStmt(VisualBasic6Parser.OptionBaseStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitOptionCompareStmt(VisualBasic6Parser.OptionCompareStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitOptionExplicitStmt(VisualBasic6Parser.OptionExplicitStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitOptionPrivateModuleStmt(VisualBasic6Parser.OptionPrivateModuleStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitModuleBody(VisualBasic6Parser.ModuleBodyContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitModuleBodyElement(VisualBasic6Parser.ModuleBodyElementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitControlProperties(VisualBasic6Parser.ControlPropertiesContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCp_Properties(VisualBasic6Parser.Cp_PropertiesContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCp_SingleProperty(VisualBasic6Parser.Cp_SinglePropertyContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCp_PropertyName(VisualBasic6Parser.Cp_PropertyNameContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCp_PropertyValue(VisualBasic6Parser.Cp_PropertyValueContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCp_NestedProperty(VisualBasic6Parser.Cp_NestedPropertyContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCp_ControlType(VisualBasic6Parser.Cp_ControlTypeContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCp_ControlIdentifier(VisualBasic6Parser.Cp_ControlIdentifierContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitModuleBlock(VisualBasic6Parser.ModuleBlockContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitAttributeStmt(VisualBasic6Parser.AttributeStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitBlock(VisualBasic6Parser.BlockContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitBlockStmt(VisualBasic6Parser.BlockStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitAppActivateStmt(VisualBasic6Parser.AppActivateStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitBeepStmt(VisualBasic6Parser.BeepStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitChDirStmt(VisualBasic6Parser.ChDirStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitChDriveStmt(VisualBasic6Parser.ChDriveStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCloseStmt(VisualBasic6Parser.CloseStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitConstStmt(VisualBasic6Parser.ConstStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitConstSubStmt(VisualBasic6Parser.ConstSubStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitDateStmt(VisualBasic6Parser.DateStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitDeclareStmt(VisualBasic6Parser.DeclareStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitDeftypeStmt(VisualBasic6Parser.DeftypeStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitDeleteSettingStmt(VisualBasic6Parser.DeleteSettingStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitDoLoopStmt(VisualBasic6Parser.DoLoopStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitEndStmt(VisualBasic6Parser.EndStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitEnumerationStmt(VisualBasic6Parser.EnumerationStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitEnumerationStmt_Constant(VisualBasic6Parser.EnumerationStmt_ConstantContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitEraseStmt(VisualBasic6Parser.EraseStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitErrorStmt(VisualBasic6Parser.ErrorStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitEventStmt(VisualBasic6Parser.EventStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitExitStmt(VisualBasic6Parser.ExitStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitFilecopyStmt(VisualBasic6Parser.FilecopyStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitForEachStmt(VisualBasic6Parser.ForEachStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitForNextStmt(VisualBasic6Parser.ForNextStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitFunctionStmt(VisualBasic6Parser.FunctionStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitGetStmt(VisualBasic6Parser.GetStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitGoSubStmt(VisualBasic6Parser.GoSubStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitGoToStmt(VisualBasic6Parser.GoToStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitInlineIfThenElse(VisualBasic6Parser.InlineIfThenElseContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitBlockIfThenElse(VisualBasic6Parser.BlockIfThenElseContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitIfBlockStmt(VisualBasic6Parser.IfBlockStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitIfConditionStmt(VisualBasic6Parser.IfConditionStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitIfElseIfBlockStmt(VisualBasic6Parser.IfElseIfBlockStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitIfElseBlockStmt(VisualBasic6Parser.IfElseBlockStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitImplementsStmt(VisualBasic6Parser.ImplementsStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitInputStmt(VisualBasic6Parser.InputStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitKillStmt(VisualBasic6Parser.KillStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitLetStmt(VisualBasic6Parser.LetStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitLineInputStmt(VisualBasic6Parser.LineInputStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitLoadStmt(VisualBasic6Parser.LoadStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitLockStmt(VisualBasic6Parser.LockStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitLsetStmt(VisualBasic6Parser.LsetStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitMacroIfThenElseStmt(VisualBasic6Parser.MacroIfThenElseStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitMacroIfBlockStmt(VisualBasic6Parser.MacroIfBlockStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitMacroElseIfBlockStmt(VisualBasic6Parser.MacroElseIfBlockStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitMacroElseBlockStmt(VisualBasic6Parser.MacroElseBlockStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitMidStmt(VisualBasic6Parser.MidStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitMkdirStmt(VisualBasic6Parser.MkdirStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitNameStmt(VisualBasic6Parser.NameStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitOnErrorStmt(VisualBasic6Parser.OnErrorStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitOnGoToStmt(VisualBasic6Parser.OnGoToStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitOnGoSubStmt(VisualBasic6Parser.OnGoSubStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitOpenStmt(VisualBasic6Parser.OpenStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitOutputList(VisualBasic6Parser.OutputListContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitOutputList_Expression(VisualBasic6Parser.OutputList_ExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitPrintStmt(VisualBasic6Parser.PrintStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitPropertyGetStmt(VisualBasic6Parser.PropertyGetStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitPropertySetStmt(VisualBasic6Parser.PropertySetStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitPropertyLetStmt(VisualBasic6Parser.PropertyLetStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitPutStmt(VisualBasic6Parser.PutStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitRaiseEventStmt(VisualBasic6Parser.RaiseEventStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitRandomizeStmt(VisualBasic6Parser.RandomizeStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitRedimStmt(VisualBasic6Parser.RedimStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitRedimSubStmt(VisualBasic6Parser.RedimSubStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitResetStmt(VisualBasic6Parser.ResetStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitResumeStmt(VisualBasic6Parser.ResumeStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitReturnStmt(VisualBasic6Parser.ReturnStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitRmdirStmt(VisualBasic6Parser.RmdirStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitRsetStmt(VisualBasic6Parser.RsetStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitSavepictureStmt(VisualBasic6Parser.SavepictureStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitSaveSettingStmt(VisualBasic6Parser.SaveSettingStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitSeekStmt(VisualBasic6Parser.SeekStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitSelectCaseStmt(VisualBasic6Parser.SelectCaseStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitSC_Case(VisualBasic6Parser.SC_CaseContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCaseCondElse(VisualBasic6Parser.CaseCondElseContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCaseCondExpr(VisualBasic6Parser.CaseCondExprContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCaseCondExprIs(VisualBasic6Parser.CaseCondExprIsContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCaseCondExprValue(VisualBasic6Parser.CaseCondExprValueContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCaseCondExprTo(VisualBasic6Parser.CaseCondExprToContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitSendkeysStmt(VisualBasic6Parser.SendkeysStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitSetattrStmt(VisualBasic6Parser.SetattrStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitSetStmt(VisualBasic6Parser.SetStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitStopStmt(VisualBasic6Parser.StopStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitSubStmt(VisualBasic6Parser.SubStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitTimeStmt(VisualBasic6Parser.TimeStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitTypeStmt(VisualBasic6Parser.TypeStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitTypeStmt_Element(VisualBasic6Parser.TypeStmt_ElementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitTypeOfStmt(VisualBasic6Parser.TypeOfStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitUnloadStmt(VisualBasic6Parser.UnloadStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitUnlockStmt(VisualBasic6Parser.UnlockStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsStruct(VisualBasic6Parser.VsStructContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsAdd(VisualBasic6Parser.VsAddContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsLt(VisualBasic6Parser.VsLtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsAddressOf(VisualBasic6Parser.VsAddressOfContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsNew(VisualBasic6Parser.VsNewContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsMult(VisualBasic6Parser.VsMultContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsNegation(VisualBasic6Parser.VsNegationContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsAssign(VisualBasic6Parser.VsAssignContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsDiv(VisualBasic6Parser.VsDivContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsLike(VisualBasic6Parser.VsLikeContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsPlus(VisualBasic6Parser.VsPlusContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsNot(VisualBasic6Parser.VsNotContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsGeq(VisualBasic6Parser.VsGeqContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsTypeOf(VisualBasic6Parser.VsTypeOfContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsICS(VisualBasic6Parser.VsICSContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsNeq(VisualBasic6Parser.VsNeqContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsXor(VisualBasic6Parser.VsXorContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsAnd(VisualBasic6Parser.VsAndContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsPow(VisualBasic6Parser.VsPowContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsLeq(VisualBasic6Parser.VsLeqContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsIs(VisualBasic6Parser.VsIsContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsMod(VisualBasic6Parser.VsModContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsAmp(VisualBasic6Parser.VsAmpContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsOr(VisualBasic6Parser.VsOrContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsMinus(VisualBasic6Parser.VsMinusContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsLiteral(VisualBasic6Parser.VsLiteralContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsEqv(VisualBasic6Parser.VsEqvContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsImp(VisualBasic6Parser.VsImpContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsGt(VisualBasic6Parser.VsGtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsEq(VisualBasic6Parser.VsEqContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVsMid(VisualBasic6Parser.VsMidContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVariableStmt(VisualBasic6Parser.VariableStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVariableListStmt(VisualBasic6Parser.VariableListStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVariableSubStmt(VisualBasic6Parser.VariableSubStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitWhileWendStmt(VisualBasic6Parser.WhileWendStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitWidthStmt(VisualBasic6Parser.WidthStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitWithStmt(VisualBasic6Parser.WithStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitWriteStmt(VisualBasic6Parser.WriteStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitExplicitCallStmt(VisualBasic6Parser.ExplicitCallStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitECS_ProcedureCall(VisualBasic6Parser.ECS_ProcedureCallContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitECS_MemberProcedureCall(VisualBasic6Parser.ECS_MemberProcedureCallContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitImplicitCallStmt_InBlock(VisualBasic6Parser.ImplicitCallStmt_InBlockContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitICS_B_ProcedureCall(VisualBasic6Parser.ICS_B_ProcedureCallContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitICS_B_MemberProcedureCall(VisualBasic6Parser.ICS_B_MemberProcedureCallContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitImplicitCallStmt_InStmt(VisualBasic6Parser.ImplicitCallStmt_InStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitICS_S_VariableOrProcedureCall(VisualBasic6Parser.ICS_S_VariableOrProcedureCallContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitICS_S_ProcedureOrArrayCall(VisualBasic6Parser.ICS_S_ProcedureOrArrayCallContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitICS_S_NestedProcedureCall(VisualBasic6Parser.ICS_S_NestedProcedureCallContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitICS_S_MembersCall(VisualBasic6Parser.ICS_S_MembersCallContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitICS_S_MemberCall(VisualBasic6Parser.ICS_S_MemberCallContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitICS_S_DictionaryCall(VisualBasic6Parser.ICS_S_DictionaryCallContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitArgsCall(VisualBasic6Parser.ArgsCallContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitArgCall(VisualBasic6Parser.ArgCallContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitDictionaryCallStmt(VisualBasic6Parser.DictionaryCallStmtContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitArgList(VisualBasic6Parser.ArgListContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitArg(VisualBasic6Parser.ArgContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitArgDefaultValue(VisualBasic6Parser.ArgDefaultValueContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitSubscripts(VisualBasic6Parser.SubscriptsContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitSubscript(VisualBasic6Parser.SubscriptContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitAmbiguousIdentifier(VisualBasic6Parser.AmbiguousIdentifierContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitAsTypeClause(VisualBasic6Parser.AsTypeClauseContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitBaseType(VisualBasic6Parser.BaseTypeContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitCertainIdentifier(VisualBasic6Parser.CertainIdentifierContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitComparisonOperator(VisualBasic6Parser.ComparisonOperatorContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitComplexType(VisualBasic6Parser.ComplexTypeContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitFieldLength(VisualBasic6Parser.FieldLengthContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitLetterrange(VisualBasic6Parser.LetterrangeContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitLineLabel(VisualBasic6Parser.LineLabelContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitLiteral(VisualBasic6Parser.LiteralContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitPublicPrivateVisibility(VisualBasic6Parser.PublicPrivateVisibilityContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitPublicPrivateGlobalVisibility(VisualBasic6Parser.PublicPrivateGlobalVisibilityContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitType(VisualBasic6Parser.TypeContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitTypeHint(VisualBasic6Parser.TypeHintContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitVisibility(VisualBasic6Parser.VisibilityContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
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
	public T visitAmbiguousKeyword(VisualBasic6Parser.AmbiguousKeywordContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < VBSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > VBSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, VBSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		VBSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		VBSPCSGLearner.updateRuleCount(rule);
		return visitChildren(ctx);
	}
}
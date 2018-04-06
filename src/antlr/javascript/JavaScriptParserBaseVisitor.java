package antlr.javascript;

// Generated from E:\jsgrammar\JavaScriptParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import learning.JSPCSGLearner;

/**
 * This class provides an empty implementation of
 * {@link JavaScriptParserVisitor}, which can be extended to create a visitor
 * which only needs to handle a subset of the available methods.
 *
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class JavaScriptParserBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements JavaScriptParserVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitProgram(JavaScriptParser.ProgramContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitSourceElement(JavaScriptParser.SourceElementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitStatement(JavaScriptParser.StatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitBlock(JavaScriptParser.BlockContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitStatementList(JavaScriptParser.StatementListContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitVariableStatement(JavaScriptParser.VariableStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		//System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitVariableDeclarationList(JavaScriptParser.VariableDeclarationListContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitEmptyStatement(JavaScriptParser.EmptyStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitExpressionStatement(JavaScriptParser.ExpressionStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitIfStatement(JavaScriptParser.IfStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitDoStatement(JavaScriptParser.DoStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitWhileStatement(JavaScriptParser.WhileStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitForStatement(JavaScriptParser.ForStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitForVarStatement(JavaScriptParser.ForVarStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitForInStatement(JavaScriptParser.ForInStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitForVarInStatement(JavaScriptParser.ForVarInStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitVarModifier(JavaScriptParser.VarModifierContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitContinueStatement(JavaScriptParser.ContinueStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitBreakStatement(JavaScriptParser.BreakStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitReturnStatement(JavaScriptParser.ReturnStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitWithStatement(JavaScriptParser.WithStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")) {
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitSwitchStatement(JavaScriptParser.SwitchStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitCaseBlock(JavaScriptParser.CaseBlockContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitCaseClauses(JavaScriptParser.CaseClausesContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitCaseClause(JavaScriptParser.CaseClauseContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitDefaultClause(JavaScriptParser.DefaultClauseContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitLabelledStatement(JavaScriptParser.LabelledStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitThrowStatement(JavaScriptParser.ThrowStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitTryStatement(JavaScriptParser.TryStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitCatchProduction(JavaScriptParser.CatchProductionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitFinallyProduction(JavaScriptParser.FinallyProductionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitDebuggerStatement(JavaScriptParser.DebuggerStatementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitFunctionDeclaration(JavaScriptParser.FunctionDeclarationContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitClassDeclaration(JavaScriptParser.ClassDeclarationContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitClassTail(JavaScriptParser.ClassTailContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitClassElement(JavaScriptParser.ClassElementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitMethodDefinition(JavaScriptParser.MethodDefinitionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitGeneratorMethod(JavaScriptParser.GeneratorMethodContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitFormalParameterList(JavaScriptParser.FormalParameterListContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitFormalParameterArg(JavaScriptParser.FormalParameterArgContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitLastFormalParameterArg(JavaScriptParser.LastFormalParameterArgContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitFunctionBody(JavaScriptParser.FunctionBodyContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitSourceElements(JavaScriptParser.SourceElementsContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitArrayLiteral(JavaScriptParser.ArrayLiteralContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitElementList(JavaScriptParser.ElementListContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitLastElement(JavaScriptParser.LastElementContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitObjectLiteral(JavaScriptParser.ObjectLiteralContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitPropertyExpressionAssignment(JavaScriptParser.PropertyExpressionAssignmentContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitComputedPropertyExpressionAssignment(
			JavaScriptParser.ComputedPropertyExpressionAssignmentContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitPropertyGetter(JavaScriptParser.PropertyGetterContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitPropertySetter(JavaScriptParser.PropertySetterContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitMethodProperty(JavaScriptParser.MethodPropertyContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitPropertyShorthand(JavaScriptParser.PropertyShorthandContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitPropertyName(JavaScriptParser.PropertyNameContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitArguments(JavaScriptParser.ArgumentsContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitLastArgument(JavaScriptParser.LastArgumentContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitExpressionSequence(JavaScriptParser.ExpressionSequenceContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitTemplateStringExpression(JavaScriptParser.TemplateStringExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitTernaryExpression(JavaScriptParser.TernaryExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitLogicalAndExpression(JavaScriptParser.LogicalAndExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitPreIncrementExpression(JavaScriptParser.PreIncrementExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitObjectLiteralExpression(JavaScriptParser.ObjectLiteralExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitInExpression(JavaScriptParser.InExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitLogicalOrExpression(JavaScriptParser.LogicalOrExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitNotExpression(JavaScriptParser.NotExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitPreDecreaseExpression(JavaScriptParser.PreDecreaseExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitArgumentsExpression(JavaScriptParser.ArgumentsExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitThisExpression(JavaScriptParser.ThisExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitFunctionExpression(JavaScriptParser.FunctionExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitUnaryMinusExpression(JavaScriptParser.UnaryMinusExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitAssignmentExpression(JavaScriptParser.AssignmentExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitPostDecreaseExpression(JavaScriptParser.PostDecreaseExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitTypeofExpression(JavaScriptParser.TypeofExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitInstanceofExpression(JavaScriptParser.InstanceofExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitUnaryPlusExpression(JavaScriptParser.UnaryPlusExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitDeleteExpression(JavaScriptParser.DeleteExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitArrowFunctionExpression(JavaScriptParser.ArrowFunctionExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitEqualityExpression(JavaScriptParser.EqualityExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitBitXOrExpression(JavaScriptParser.BitXOrExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitSuperExpression(JavaScriptParser.SuperExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitMultiplicativeExpression(JavaScriptParser.MultiplicativeExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitBitShiftExpression(JavaScriptParser.BitShiftExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitParenthesizedExpression(JavaScriptParser.ParenthesizedExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitAdditiveExpression(JavaScriptParser.AdditiveExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitRelationalExpression(JavaScriptParser.RelationalExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitPostIncrementExpression(JavaScriptParser.PostIncrementExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitBitNotExpression(JavaScriptParser.BitNotExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitNewExpression(JavaScriptParser.NewExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitLiteralExpression(JavaScriptParser.LiteralExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitArrayLiteralExpression(JavaScriptParser.ArrayLiteralExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitMemberDotExpression(JavaScriptParser.MemberDotExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitClassExpression(JavaScriptParser.ClassExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitMemberIndexExpression(JavaScriptParser.MemberIndexExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitIdentifierExpression(JavaScriptParser.IdentifierExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitBitAndExpression(JavaScriptParser.BitAndExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitBitOrExpression(JavaScriptParser.BitOrExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitAssignmentOperatorExpression(JavaScriptParser.AssignmentOperatorExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitVoidExpression(JavaScriptParser.VoidExpressionContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitArrowFunctionParameters(JavaScriptParser.ArrowFunctionParametersContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitArrowFunctionBody(JavaScriptParser.ArrowFunctionBodyContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitAssignmentOperator(JavaScriptParser.AssignmentOperatorContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitLiteral(JavaScriptParser.LiteralContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitNumericLiteral(JavaScriptParser.NumericLiteralContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitIdentifierName(JavaScriptParser.IdentifierNameContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitReservedWord(JavaScriptParser.ReservedWordContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitKeyword(JavaScriptParser.KeywordContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitGetter(JavaScriptParser.GetterContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitSetter(JavaScriptParser.SetterContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength).trim()
							: ctx.getChild(i).getText().trim();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
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
	public T visitEos(JavaScriptParser.EosContext ctx) {
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
		if (ctx.getChildCount() > 0 && ctx.getChildCount() < JSPCSGLearner.maxChildCount) {
			for (int i = 0; i < ctx.children.size(); i++) {
				if (ctx.getChild(i).getClass().getSimpleName().equals("TerminalNodeImpl")) {
					rule += ctx.getChild(i).getText().length() > JSPCSGLearner.maxChildLength
							? ctx.getChild(i).getText().substring(0, JSPCSGLearner.maxChildLength)
							: ctx.getChild(i).getText();
				} else if (!ctx.getChild(i).getClass().getSimpleName().equals("ErrorNodeImpl")){
					rule += "@@@@@" + ctx.getChild(i).getClass().getSimpleName() + "#####";
				}
			}
		} else {
			return visitChildren(ctx);
		}
		// System.out.println(rule);
		JSPCSGLearner.updateParentCount(ctx.getClass().getSimpleName());
		JSPCSGLearner.updateRuleCount(rule);
		return visitChildren(ctx);
	}
}
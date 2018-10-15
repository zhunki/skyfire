package antlr.vbs;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VisualBasic6Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VisualBasic6Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(VisualBasic6Parser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(VisualBasic6Parser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#moduleReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleReferences(VisualBasic6Parser.ModuleReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#moduleReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleReference(VisualBasic6Parser.ModuleReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#moduleReferenceValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleReferenceValue(VisualBasic6Parser.ModuleReferenceValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#moduleReferenceComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleReferenceComponent(VisualBasic6Parser.ModuleReferenceComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#moduleHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleHeader(VisualBasic6Parser.ModuleHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#moduleConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleConfig(VisualBasic6Parser.ModuleConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#moduleConfigElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleConfigElement(VisualBasic6Parser.ModuleConfigElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#moduleAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleAttributes(VisualBasic6Parser.ModuleAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#moduleOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleOptions(VisualBasic6Parser.ModuleOptionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionBaseStmt}
	 * labeled alternative in {@link VisualBasic6Parser#moduleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionBaseStmt(VisualBasic6Parser.OptionBaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionCompareStmt}
	 * labeled alternative in {@link VisualBasic6Parser#moduleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionCompareStmt(VisualBasic6Parser.OptionCompareStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionExplicitStmt}
	 * labeled alternative in {@link VisualBasic6Parser#moduleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionExplicitStmt(VisualBasic6Parser.OptionExplicitStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optionPrivateModuleStmt}
	 * labeled alternative in {@link VisualBasic6Parser#moduleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionPrivateModuleStmt(VisualBasic6Parser.OptionPrivateModuleStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#moduleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBody(VisualBasic6Parser.ModuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#moduleBodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBodyElement(VisualBasic6Parser.ModuleBodyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#controlProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlProperties(VisualBasic6Parser.ControlPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#cp_Properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_Properties(VisualBasic6Parser.Cp_PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#cp_SingleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_SingleProperty(VisualBasic6Parser.Cp_SinglePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#cp_PropertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_PropertyName(VisualBasic6Parser.Cp_PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#cp_PropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_PropertyValue(VisualBasic6Parser.Cp_PropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#cp_NestedProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_NestedProperty(VisualBasic6Parser.Cp_NestedPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#cp_ControlType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_ControlType(VisualBasic6Parser.Cp_ControlTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#cp_ControlIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCp_ControlIdentifier(VisualBasic6Parser.Cp_ControlIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#moduleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBlock(VisualBasic6Parser.ModuleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#attributeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeStmt(VisualBasic6Parser.AttributeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(VisualBasic6Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#blockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(VisualBasic6Parser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#appActivateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppActivateStmt(VisualBasic6Parser.AppActivateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#beepStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeepStmt(VisualBasic6Parser.BeepStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#chDirStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChDirStmt(VisualBasic6Parser.ChDirStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#chDriveStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChDriveStmt(VisualBasic6Parser.ChDriveStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#closeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseStmt(VisualBasic6Parser.CloseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#constStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstStmt(VisualBasic6Parser.ConstStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#constSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstSubStmt(VisualBasic6Parser.ConstSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#dateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateStmt(VisualBasic6Parser.DateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#declareStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStmt(VisualBasic6Parser.DeclareStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#deftypeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeftypeStmt(VisualBasic6Parser.DeftypeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#deleteSettingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteSettingStmt(VisualBasic6Parser.DeleteSettingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#doLoopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoLoopStmt(VisualBasic6Parser.DoLoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#endStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndStmt(VisualBasic6Parser.EndStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#enumerationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationStmt(VisualBasic6Parser.EnumerationStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#enumerationStmt_Constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationStmt_Constant(VisualBasic6Parser.EnumerationStmt_ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#eraseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEraseStmt(VisualBasic6Parser.EraseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#errorStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorStmt(VisualBasic6Parser.ErrorStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#eventStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventStmt(VisualBasic6Parser.EventStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#exitStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStmt(VisualBasic6Parser.ExitStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#filecopyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilecopyStmt(VisualBasic6Parser.FilecopyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#forEachStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachStmt(VisualBasic6Parser.ForEachStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#forNextStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForNextStmt(VisualBasic6Parser.ForNextStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#functionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStmt(VisualBasic6Parser.FunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#getStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetStmt(VisualBasic6Parser.GetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#goSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoSubStmt(VisualBasic6Parser.GoSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#goToStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToStmt(VisualBasic6Parser.GoToStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineIfThenElse}
	 * labeled alternative in {@link VisualBasic6Parser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineIfThenElse(VisualBasic6Parser.InlineIfThenElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockIfThenElse}
	 * labeled alternative in {@link VisualBasic6Parser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockIfThenElse(VisualBasic6Parser.BlockIfThenElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#ifBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlockStmt(VisualBasic6Parser.IfBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#ifConditionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditionStmt(VisualBasic6Parser.IfConditionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#ifElseIfBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseIfBlockStmt(VisualBasic6Parser.IfElseIfBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#ifElseBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseBlockStmt(VisualBasic6Parser.IfElseBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#implementsStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsStmt(VisualBasic6Parser.ImplementsStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#inputStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStmt(VisualBasic6Parser.InputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#killStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKillStmt(VisualBasic6Parser.KillStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#letStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetStmt(VisualBasic6Parser.LetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#lineInputStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineInputStmt(VisualBasic6Parser.LineInputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#loadStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadStmt(VisualBasic6Parser.LoadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#lockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStmt(VisualBasic6Parser.LockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#lsetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLsetStmt(VisualBasic6Parser.LsetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#macroIfThenElseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroIfThenElseStmt(VisualBasic6Parser.MacroIfThenElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#macroIfBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroIfBlockStmt(VisualBasic6Parser.MacroIfBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#macroElseIfBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroElseIfBlockStmt(VisualBasic6Parser.MacroElseIfBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#macroElseBlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacroElseBlockStmt(VisualBasic6Parser.MacroElseBlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#midStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMidStmt(VisualBasic6Parser.MidStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#mkdirStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMkdirStmt(VisualBasic6Parser.MkdirStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#nameStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameStmt(VisualBasic6Parser.NameStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#onErrorStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnErrorStmt(VisualBasic6Parser.OnErrorStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#onGoToStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnGoToStmt(VisualBasic6Parser.OnGoToStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#onGoSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnGoSubStmt(VisualBasic6Parser.OnGoSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#openStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenStmt(VisualBasic6Parser.OpenStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#outputList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputList(VisualBasic6Parser.OutputListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#outputList_Expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputList_Expression(VisualBasic6Parser.OutputList_ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(VisualBasic6Parser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#propertyGetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyGetStmt(VisualBasic6Parser.PropertyGetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#propertySetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertySetStmt(VisualBasic6Parser.PropertySetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#propertyLetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyLetStmt(VisualBasic6Parser.PropertyLetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#putStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutStmt(VisualBasic6Parser.PutStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#raiseEventStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseEventStmt(VisualBasic6Parser.RaiseEventStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#randomizeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandomizeStmt(VisualBasic6Parser.RandomizeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#redimStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedimStmt(VisualBasic6Parser.RedimStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#redimSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedimSubStmt(VisualBasic6Parser.RedimSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#resetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetStmt(VisualBasic6Parser.ResetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#resumeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResumeStmt(VisualBasic6Parser.ResumeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(VisualBasic6Parser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#rmdirStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmdirStmt(VisualBasic6Parser.RmdirStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#rsetStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRsetStmt(VisualBasic6Parser.RsetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#savepictureStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepictureStmt(VisualBasic6Parser.SavepictureStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#saveSettingStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaveSettingStmt(VisualBasic6Parser.SaveSettingStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#seekStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeekStmt(VisualBasic6Parser.SeekStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#selectCaseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectCaseStmt(VisualBasic6Parser.SelectCaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#sC_Case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSC_Case(VisualBasic6Parser.SC_CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseCondElse}
	 * labeled alternative in {@link VisualBasic6Parser#sC_Cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCondElse(VisualBasic6Parser.CaseCondElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseCondExpr}
	 * labeled alternative in {@link VisualBasic6Parser#sC_Cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCondExpr(VisualBasic6Parser.CaseCondExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseCondExprIs}
	 * labeled alternative in {@link VisualBasic6Parser#sC_CondExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCondExprIs(VisualBasic6Parser.CaseCondExprIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseCondExprValue}
	 * labeled alternative in {@link VisualBasic6Parser#sC_CondExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCondExprValue(VisualBasic6Parser.CaseCondExprValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseCondExprTo}
	 * labeled alternative in {@link VisualBasic6Parser#sC_CondExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseCondExprTo(VisualBasic6Parser.CaseCondExprToContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#sendkeysStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSendkeysStmt(VisualBasic6Parser.SendkeysStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#setattrStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetattrStmt(VisualBasic6Parser.SetattrStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#setStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStmt(VisualBasic6Parser.SetStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#stopStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopStmt(VisualBasic6Parser.StopStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#subStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubStmt(VisualBasic6Parser.SubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#timeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeStmt(VisualBasic6Parser.TimeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#typeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStmt(VisualBasic6Parser.TypeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#typeStmt_Element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStmt_Element(VisualBasic6Parser.TypeStmt_ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#typeOfStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOfStmt(VisualBasic6Parser.TypeOfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#unloadStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnloadStmt(VisualBasic6Parser.UnloadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#unlockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlockStmt(VisualBasic6Parser.UnlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsStruct}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsStruct(VisualBasic6Parser.VsStructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsAdd}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsAdd(VisualBasic6Parser.VsAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsLt}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsLt(VisualBasic6Parser.VsLtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsAddressOf}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsAddressOf(VisualBasic6Parser.VsAddressOfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsNew}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsNew(VisualBasic6Parser.VsNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsMult}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsMult(VisualBasic6Parser.VsMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsNegation}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsNegation(VisualBasic6Parser.VsNegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsAssign}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsAssign(VisualBasic6Parser.VsAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsDiv}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsDiv(VisualBasic6Parser.VsDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsLike}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsLike(VisualBasic6Parser.VsLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsPlus}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsPlus(VisualBasic6Parser.VsPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsNot}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsNot(VisualBasic6Parser.VsNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsGeq}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsGeq(VisualBasic6Parser.VsGeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsTypeOf}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsTypeOf(VisualBasic6Parser.VsTypeOfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsICS}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsICS(VisualBasic6Parser.VsICSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsNeq}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsNeq(VisualBasic6Parser.VsNeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsXor}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsXor(VisualBasic6Parser.VsXorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsAnd}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsAnd(VisualBasic6Parser.VsAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsPow}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsPow(VisualBasic6Parser.VsPowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsLeq}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsLeq(VisualBasic6Parser.VsLeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsIs}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsIs(VisualBasic6Parser.VsIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsMod}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsMod(VisualBasic6Parser.VsModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsAmp}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsAmp(VisualBasic6Parser.VsAmpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsOr}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsOr(VisualBasic6Parser.VsOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsMinus}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsMinus(VisualBasic6Parser.VsMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsLiteral}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsLiteral(VisualBasic6Parser.VsLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsEqv}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsEqv(VisualBasic6Parser.VsEqvContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsImp}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsImp(VisualBasic6Parser.VsImpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsGt}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsGt(VisualBasic6Parser.VsGtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsEq}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsEq(VisualBasic6Parser.VsEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vsMid}
	 * labeled alternative in {@link VisualBasic6Parser#valueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVsMid(VisualBasic6Parser.VsMidContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#variableStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStmt(VisualBasic6Parser.VariableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#variableListStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableListStmt(VisualBasic6Parser.VariableListStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#variableSubStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableSubStmt(VisualBasic6Parser.VariableSubStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#whileWendStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileWendStmt(VisualBasic6Parser.WhileWendStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#widthStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthStmt(VisualBasic6Parser.WidthStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#withStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStmt(VisualBasic6Parser.WithStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(VisualBasic6Parser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#explicitCallStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitCallStmt(VisualBasic6Parser.ExplicitCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#eCS_ProcedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitECS_ProcedureCall(VisualBasic6Parser.ECS_ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#eCS_MemberProcedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitECS_MemberProcedureCall(VisualBasic6Parser.ECS_MemberProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#implicitCallStmt_InBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitCallStmt_InBlock(VisualBasic6Parser.ImplicitCallStmt_InBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#iCS_B_ProcedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_B_ProcedureCall(VisualBasic6Parser.ICS_B_ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#iCS_B_MemberProcedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_B_MemberProcedureCall(VisualBasic6Parser.ICS_B_MemberProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#implicitCallStmt_InStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitCallStmt_InStmt(VisualBasic6Parser.ImplicitCallStmt_InStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#iCS_S_VariableOrProcedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_S_VariableOrProcedureCall(VisualBasic6Parser.ICS_S_VariableOrProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#iCS_S_ProcedureOrArrayCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_S_ProcedureOrArrayCall(VisualBasic6Parser.ICS_S_ProcedureOrArrayCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#iCS_S_NestedProcedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_S_NestedProcedureCall(VisualBasic6Parser.ICS_S_NestedProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#iCS_S_MembersCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_S_MembersCall(VisualBasic6Parser.ICS_S_MembersCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#iCS_S_MemberCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_S_MemberCall(VisualBasic6Parser.ICS_S_MemberCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#iCS_S_DictionaryCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitICS_S_DictionaryCall(VisualBasic6Parser.ICS_S_DictionaryCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#argsCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsCall(VisualBasic6Parser.ArgsCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#argCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgCall(VisualBasic6Parser.ArgCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#dictionaryCallStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryCallStmt(VisualBasic6Parser.DictionaryCallStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(VisualBasic6Parser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(VisualBasic6Parser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#argDefaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgDefaultValue(VisualBasic6Parser.ArgDefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#subscripts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscripts(VisualBasic6Parser.SubscriptsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(VisualBasic6Parser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#ambiguousIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousIdentifier(VisualBasic6Parser.AmbiguousIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#asTypeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsTypeClause(VisualBasic6Parser.AsTypeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(VisualBasic6Parser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#certainIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCertainIdentifier(VisualBasic6Parser.CertainIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(VisualBasic6Parser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#complexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexType(VisualBasic6Parser.ComplexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#fieldLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldLength(VisualBasic6Parser.FieldLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#letterrange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetterrange(VisualBasic6Parser.LetterrangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#lineLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineLabel(VisualBasic6Parser.LineLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(VisualBasic6Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#publicPrivateVisibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicPrivateVisibility(VisualBasic6Parser.PublicPrivateVisibilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#publicPrivateGlobalVisibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicPrivateGlobalVisibility(VisualBasic6Parser.PublicPrivateGlobalVisibilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(VisualBasic6Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#typeHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeHint(VisualBasic6Parser.TypeHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#visibility}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility(VisualBasic6Parser.VisibilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link VisualBasic6Parser#ambiguousKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousKeyword(VisualBasic6Parser.AmbiguousKeywordContext ctx);
}
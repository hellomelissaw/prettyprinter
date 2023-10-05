// Generated from hdl.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hdlParser}.
 */
public interface hdlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hdlParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(hdlParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link hdlParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(hdlParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link hdlParser#latchSection}.
	 * @param ctx the parse tree
	 */
	void enterLatchSection(hdlParser.LatchSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hdlParser#latchSection}.
	 * @param ctx the parse tree
	 */
	void exitLatchSection(hdlParser.LatchSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hdlParser#latches}.
	 * @param ctx the parse tree
	 */
	void enterLatches(hdlParser.LatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link hdlParser#latches}.
	 * @param ctx the parse tree
	 */
	void exitLatches(hdlParser.LatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link hdlParser#updateSection}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSection(hdlParser.UpdateSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hdlParser#updateSection}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSection(hdlParser.UpdateSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hdlParser#updates}.
	 * @param ctx the parse tree
	 */
	void enterUpdates(hdlParser.UpdatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link hdlParser#updates}.
	 * @param ctx the parse tree
	 */
	void exitUpdates(hdlParser.UpdatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link hdlParser#simulateSection}.
	 * @param ctx the parse tree
	 */
	void enterSimulateSection(hdlParser.SimulateSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hdlParser#simulateSection}.
	 * @param ctx the parse tree
	 */
	void exitSimulateSection(hdlParser.SimulateSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(hdlParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(hdlParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(hdlParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(hdlParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(hdlParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(hdlParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(hdlParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(hdlParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(hdlParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(hdlParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(hdlParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(hdlParser.ParenContext ctx);
}
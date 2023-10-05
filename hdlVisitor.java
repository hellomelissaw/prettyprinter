// Generated from hdl.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link hdlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface hdlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link hdlParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(hdlParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link hdlParser#latchSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatchSection(hdlParser.LatchSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hdlParser#latches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatches(hdlParser.LatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link hdlParser#updateSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSection(hdlParser.UpdateSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hdlParser#updates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdates(hdlParser.UpdatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link hdlParser#simulateSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulateSection(hdlParser.SimulateSectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(hdlParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(hdlParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(hdlParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(hdlParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(hdlParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link hdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(hdlParser.ParenContext ctx);
}
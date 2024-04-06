// Generated from /home/gus/www/ufla/tc/tc-parser-antlr/src/ArithmeticExpression.g4 by ANTLR 4.13.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArithmeticExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArithmeticExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ArithmeticExpressionParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#sumSubExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumSubExpr(ArithmeticExpressionParser.SumSubExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#multDivExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivExpr(ArithmeticExpressionParser.MultDivExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#finalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalExpr(ArithmeticExpressionParser.FinalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#digitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitExpr(ArithmeticExpressionParser.DigitExprContext ctx);
}
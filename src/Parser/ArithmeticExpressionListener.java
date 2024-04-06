// Generated from /home/gus/www/ufla/tc/tc-parser-antlr/src/ArithmeticExpression.g4 by ANTLR 4.13.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticExpressionParser}.
 */
public interface ArithmeticExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ArithmeticExpressionParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ArithmeticExpressionParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#sumSubExpr}.
	 * @param ctx the parse tree
	 */
	void enterSumSubExpr(ArithmeticExpressionParser.SumSubExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#sumSubExpr}.
	 * @param ctx the parse tree
	 */
	void exitSumSubExpr(ArithmeticExpressionParser.SumSubExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#multDivExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivExpr(ArithmeticExpressionParser.MultDivExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#multDivExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivExpr(ArithmeticExpressionParser.MultDivExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#finalExpr}.
	 * @param ctx the parse tree
	 */
	void enterFinalExpr(ArithmeticExpressionParser.FinalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#finalExpr}.
	 * @param ctx the parse tree
	 */
	void exitFinalExpr(ArithmeticExpressionParser.FinalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#digitExpr}.
	 * @param ctx the parse tree
	 */
	void enterDigitExpr(ArithmeticExpressionParser.DigitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#digitExpr}.
	 * @param ctx the parse tree
	 */
	void exitDigitExpr(ArithmeticExpressionParser.DigitExprContext ctx);
}
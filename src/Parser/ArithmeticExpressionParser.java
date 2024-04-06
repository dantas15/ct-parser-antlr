// Generated from /home/gus/www/ufla/tc/tc-parser-antlr/src/ArithmeticExpression.g4 by ANTLR 4.13.1
package Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArithmeticExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SumOperators=1, MultOperators=2, AtrOperator=3, OP=4, CP=5, WS=6, Letter=7, 
		Digit=8;
	public static final int
		RULE_start = 0, RULE_sumSubExpr = 1, RULE_multDivExpr = 2, RULE_finalExpr = 3, 
		RULE_digitExpr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "sumSubExpr", "multDivExpr", "finalExpr", "digitExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SumOperators", "MultOperators", "AtrOperator", "OP", "CP", "WS", 
			"Letter", "Digit"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ArithmeticExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithmeticExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode Letter() { return getToken(ArithmeticExpressionParser.Letter, 0); }
		public TerminalNode AtrOperator() { return getToken(ArithmeticExpressionParser.AtrOperator, 0); }
		public SumSubExprContext sumSubExpr() {
			return getRuleContext(SumSubExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionVisitor ) return ((ArithmeticExpressionVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(Letter);
			setState(11);
			match(AtrOperator);
			setState(12);
			sumSubExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SumSubExprContext extends ParserRuleContext {
		public List<MultDivExprContext> multDivExpr() {
			return getRuleContexts(MultDivExprContext.class);
		}
		public MultDivExprContext multDivExpr(int i) {
			return getRuleContext(MultDivExprContext.class,i);
		}
		public List<TerminalNode> SumOperators() { return getTokens(ArithmeticExpressionParser.SumOperators); }
		public TerminalNode SumOperators(int i) {
			return getToken(ArithmeticExpressionParser.SumOperators, i);
		}
		public SumSubExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumSubExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterSumSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitSumSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionVisitor ) return ((ArithmeticExpressionVisitor<? extends T>)visitor).visitSumSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumSubExprContext sumSubExpr() throws RecognitionException {
		SumSubExprContext _localctx = new SumSubExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sumSubExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			multDivExpr();
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SumOperators) {
				{
				{
				setState(15);
				match(SumOperators);
				setState(16);
				multDivExpr();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultDivExprContext extends ParserRuleContext {
		public List<FinalExprContext> finalExpr() {
			return getRuleContexts(FinalExprContext.class);
		}
		public FinalExprContext finalExpr(int i) {
			return getRuleContext(FinalExprContext.class,i);
		}
		public List<TerminalNode> MultOperators() { return getTokens(ArithmeticExpressionParser.MultOperators); }
		public TerminalNode MultOperators(int i) {
			return getToken(ArithmeticExpressionParser.MultOperators, i);
		}
		public MultDivExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterMultDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitMultDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionVisitor ) return ((ArithmeticExpressionVisitor<? extends T>)visitor).visitMultDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultDivExprContext multDivExpr() throws RecognitionException {
		MultDivExprContext _localctx = new MultDivExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multDivExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			finalExpr();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MultOperators) {
				{
				{
				setState(23);
				match(MultOperators);
				setState(24);
				finalExpr();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinalExprContext extends ParserRuleContext {
		public DigitExprContext digitExpr() {
			return getRuleContext(DigitExprContext.class,0);
		}
		public TerminalNode Letter() { return getToken(ArithmeticExpressionParser.Letter, 0); }
		public TerminalNode OP() { return getToken(ArithmeticExpressionParser.OP, 0); }
		public SumSubExprContext sumSubExpr() {
			return getRuleContext(SumSubExprContext.class,0);
		}
		public TerminalNode CP() { return getToken(ArithmeticExpressionParser.CP, 0); }
		public FinalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterFinalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitFinalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionVisitor ) return ((ArithmeticExpressionVisitor<? extends T>)visitor).visitFinalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalExprContext finalExpr() throws RecognitionException {
		FinalExprContext _localctx = new FinalExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_finalExpr);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				digitExpr();
				}
				break;
			case Letter:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(Letter);
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(OP);
				setState(33);
				sumSubExpr();
				setState(34);
				match(CP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DigitExprContext extends ParserRuleContext {
		public List<TerminalNode> Digit() { return getTokens(ArithmeticExpressionParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(ArithmeticExpressionParser.Digit, i);
		}
		public DigitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).enterDigitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArithmeticExpressionListener ) ((ArithmeticExpressionListener)listener).exitDigitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArithmeticExpressionVisitor ) return ((ArithmeticExpressionVisitor<? extends T>)visitor).visitDigitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitExprContext digitExpr() throws RecognitionException {
		DigitExprContext _localctx = new DigitExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_digitExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(Digit);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Digit) {
				{
				{
				setState(39);
				match(Digit);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\b.\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u0012\b\u0001\n\u0001\f\u0001\u0015\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002\u001a\b\u0002\n\u0002\f\u0002\u001d"+
		"\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003%\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004)\b\u0004"+
		"\n\u0004\f\u0004,\t\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004"+
		"\u0006\b\u0000\u0000-\u0000\n\u0001\u0000\u0000\u0000\u0002\u000e\u0001"+
		"\u0000\u0000\u0000\u0004\u0016\u0001\u0000\u0000\u0000\u0006$\u0001\u0000"+
		"\u0000\u0000\b&\u0001\u0000\u0000\u0000\n\u000b\u0005\u0007\u0000\u0000"+
		"\u000b\f\u0005\u0003\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r\u0001\u0001"+
		"\u0000\u0000\u0000\u000e\u0013\u0003\u0004\u0002\u0000\u000f\u0010\u0005"+
		"\u0001\u0000\u0000\u0010\u0012\u0003\u0004\u0002\u0000\u0011\u000f\u0001"+
		"\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0003\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u001b\u0003"+
		"\u0006\u0003\u0000\u0017\u0018\u0005\u0002\u0000\u0000\u0018\u001a\u0003"+
		"\u0006\u0003\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u0005\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001e%\u0003\b\u0004\u0000\u001f%\u0005\u0007\u0000"+
		"\u0000 !\u0005\u0004\u0000\u0000!\"\u0003\u0002\u0001\u0000\"#\u0005\u0005"+
		"\u0000\u0000#%\u0001\u0000\u0000\u0000$\u001e\u0001\u0000\u0000\u0000"+
		"$\u001f\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000%\u0007\u0001"+
		"\u0000\u0000\u0000&*\u0005\b\u0000\u0000\')\u0005\b\u0000\u0000(\'\u0001"+
		"\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"*+\u0001\u0000\u0000\u0000+\t\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000\u0004\u0013\u001b$*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
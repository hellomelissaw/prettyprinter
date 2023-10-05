// Generated from hdl.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class hdlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, IDENTIFIER=14, NUMERIC=15, WS=16, 
		LINECOMMENT=17, BLOCKCOMMENT=18;
	public static final int
		RULE_start = 0, RULE_latchSection = 1, RULE_latches = 2, RULE_updateSection = 3, 
		RULE_updates = 4, RULE_simulateSection = 5, RULE_expr = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "latchSection", "latches", "updateSection", "updates", "simulateSection", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.latches'", "'.update'", 
			"'.simulate'", "'->'", "'='", "'!'", "'&&'", "'||'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "IDENTIFIER", "NUMERIC", "WS", "LINECOMMENT", "BLOCKCOMMENT"
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
	public String getGrammarFileName() { return "hdl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public hdlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(hdlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(hdlParser.IDENTIFIER, i);
		}
		public LatchSectionContext latchSection() {
			return getRuleContext(LatchSectionContext.class,0);
		}
		public UpdateSectionContext updateSection() {
			return getRuleContext(UpdateSectionContext.class,0);
		}
		public SimulateSectionContext simulateSection() {
			return getRuleContext(SimulateSectionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(hdlParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hdlVisitor ) return ((hdlVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(15);
			match(IDENTIFIER);
			setState(16);
			match(T__1);
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				match(IDENTIFIER);
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(22);
			match(T__2);
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				match(IDENTIFIER);
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(28);
			match(T__3);
			setState(29);
			latchSection();
			setState(30);
			match(T__4);
			setState(31);
			updateSection();
			setState(32);
			match(T__5);
			setState(33);
			simulateSection();
			setState(34);
			match(EOF);
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
	public static class LatchSectionContext extends ParserRuleContext {
		public List<LatchesContext> latches() {
			return getRuleContexts(LatchesContext.class);
		}
		public LatchesContext latches(int i) {
			return getRuleContext(LatchesContext.class,i);
		}
		public LatchSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latchSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).enterLatchSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).exitLatchSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hdlVisitor ) return ((hdlVisitor<? extends T>)visitor).visitLatchSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchSectionContext latchSection() throws RecognitionException {
		LatchSectionContext _localctx = new LatchSectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_latchSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				latches();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
	public static class LatchesContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(hdlParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(hdlParser.IDENTIFIER, i);
		}
		public LatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).enterLatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).exitLatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hdlVisitor ) return ((hdlVisitor<? extends T>)visitor).visitLatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchesContext latches() throws RecognitionException {
		LatchesContext _localctx = new LatchesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_latches);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(IDENTIFIER);
			setState(42);
			match(T__6);
			setState(43);
			match(IDENTIFIER);
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
	public static class UpdateSectionContext extends ParserRuleContext {
		public List<UpdatesContext> updates() {
			return getRuleContexts(UpdatesContext.class);
		}
		public UpdatesContext updates(int i) {
			return getRuleContext(UpdatesContext.class,i);
		}
		public UpdateSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).enterUpdateSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).exitUpdateSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hdlVisitor ) return ((hdlVisitor<? extends T>)visitor).visitUpdateSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateSectionContext updateSection() throws RecognitionException {
		UpdateSectionContext _localctx = new UpdateSectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_updateSection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				updates();
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
	public static class UpdatesContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(hdlParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UpdatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).enterUpdates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).exitUpdates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hdlVisitor ) return ((hdlVisitor<? extends T>)visitor).visitUpdates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdatesContext updates() throws RecognitionException {
		UpdatesContext _localctx = new UpdatesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_updates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(IDENTIFIER);
			setState(51);
			match(T__7);
			setState(52);
			expr(0);
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
	public static class SimulateSectionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(hdlParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SimulateSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulateSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).enterSimulateSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).exitSimulateSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hdlVisitor ) return ((hdlVisitor<? extends T>)visitor).visitSimulateSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimulateSectionContext simulateSection() throws RecognitionException {
		SimulateSectionContext _localctx = new SimulateSectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simulateSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(IDENTIFIER);
			setState(55);
			match(T__7);
			setState(56);
			expr(0);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExprContext {
		public Token op;
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hdlVisitor ) return ((hdlVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hdlVisitor ) return ((hdlVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExprContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(hdlParser.IDENTIFIER, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hdlVisitor ) return ((hdlVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hdlVisitor ) return ((hdlVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ExprContext {
		public Token n;
		public TerminalNode NUMERIC() { return getToken(hdlParser.NUMERIC, 0); }
		public NumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hdlVisitor ) return ((hdlVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hdlListener ) ((hdlListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hdlVisitor ) return ((hdlVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(59);
				((VarContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			case NUMERIC:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				((NumContext)_localctx).n = match(NUMERIC);
				}
				break;
			case T__8:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				((NotContext)_localctx).op = match(T__8);
				setState(62);
				((NotContext)_localctx).e = expr(4);
				}
				break;
			case T__11:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(T__11);
				setState(64);
				((ParenContext)_localctx).e = expr(0);
				setState(65);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						((AndContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(70);
						((AndContext)_localctx).op = match(T__9);
						setState(71);
						((AndContext)_localctx).e2 = expr(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						((OrContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(72);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(73);
						((OrContext)_localctx).op = match(T__10);
						setState(74);
						((OrContext)_localctx).e2 = expr(3);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012Q\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0004\u0000\u0013\b\u0000\u000b\u0000\f\u0000\u0014"+
		"\u0001\u0000\u0001\u0000\u0004\u0000\u0019\b\u0000\u000b\u0000\f\u0000"+
		"\u001a\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001&\b\u0001\u000b"+
		"\u0001\f\u0001\'\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0004\u0003/\b\u0003\u000b\u0003\f\u00030\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006D\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"L\b\u0006\n\u0006\f\u0006O\t\u0006\u0001\u0006\u0000\u0001\f\u0007\u0000"+
		"\u0002\u0004\u0006\b\n\f\u0000\u0000R\u0000\u000e\u0001\u0000\u0000\u0000"+
		"\u0002%\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006."+
		"\u0001\u0000\u0000\u0000\b2\u0001\u0000\u0000\u0000\n6\u0001\u0000\u0000"+
		"\u0000\fC\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0001\u0000\u0000"+
		"\u000f\u0010\u0005\u000e\u0000\u0000\u0010\u0012\u0005\u0002\u0000\u0000"+
		"\u0011\u0013\u0005\u000e\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000"+
		"\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000"+
		"\u0016\u0018\u0005\u0003\u0000\u0000\u0017\u0019\u0005\u000e\u0000\u0000"+
		"\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000"+
		"\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0004\u0000\u0000"+
		"\u001d\u001e\u0003\u0002\u0001\u0000\u001e\u001f\u0005\u0005\u0000\u0000"+
		"\u001f \u0003\u0006\u0003\u0000 !\u0005\u0006\u0000\u0000!\"\u0003\n\u0005"+
		"\u0000\"#\u0005\u0000\u0000\u0001#\u0001\u0001\u0000\u0000\u0000$&\u0003"+
		"\u0004\u0002\u0000%$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0003\u0001\u0000"+
		"\u0000\u0000)*\u0005\u000e\u0000\u0000*+\u0005\u0007\u0000\u0000+,\u0005"+
		"\u000e\u0000\u0000,\u0005\u0001\u0000\u0000\u0000-/\u0003\b\u0004\u0000"+
		".-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001\u0007\u0001\u0000\u0000\u000023\u0005"+
		"\u000e\u0000\u000034\u0005\b\u0000\u000045\u0003\f\u0006\u00005\t\u0001"+
		"\u0000\u0000\u000067\u0005\u000e\u0000\u000078\u0005\b\u0000\u000089\u0003"+
		"\f\u0006\u00009\u000b\u0001\u0000\u0000\u0000:;\u0006\u0006\uffff\uffff"+
		"\u0000;D\u0005\u000e\u0000\u0000<D\u0005\u000f\u0000\u0000=>\u0005\t\u0000"+
		"\u0000>D\u0003\f\u0006\u0004?@\u0005\f\u0000\u0000@A\u0003\f\u0006\u0000"+
		"AB\u0005\r\u0000\u0000BD\u0001\u0000\u0000\u0000C:\u0001\u0000\u0000\u0000"+
		"C<\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000C?\u0001\u0000\u0000"+
		"\u0000DM\u0001\u0000\u0000\u0000EF\n\u0003\u0000\u0000FG\u0005\n\u0000"+
		"\u0000GL\u0003\f\u0006\u0004HI\n\u0002\u0000\u0000IJ\u0005\u000b\u0000"+
		"\u0000JL\u0003\f\u0006\u0003KE\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000"+
		"\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000N\r\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000\u0007"+
		"\u0014\u001a\'0CKM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
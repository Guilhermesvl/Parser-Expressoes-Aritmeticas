// Generated from /home/guilherme/Parser-Expressoes-Aritmeticas/src/gramatica/ParserLinguagem.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParserLinguagem extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFICADOR=1, IGUAL=2, MAIS=3, MENOS=4, MULTIPLICACAO=5, DIVISAO=6, 
		ABRE_PARENTESES=7, FECHA_PARENTESES=8, ESPACO=9;
	public static final int
		RULE_atribuicao = 0, RULE_expressao = 1, RULE_termo = 2, RULE_fator = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"atribuicao", "expressao", "termo", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFICADOR", "IGUAL", "MAIS", "MENOS", "MULTIPLICACAO", "DIVISAO", 
			"ABRE_PARENTESES", "FECHA_PARENTESES", "ESPACO"
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
	public String getGrammarFileName() { return "ParserLinguagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserLinguagem(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(ParserLinguagem.IDENTIFICADOR, 0); }
		public TerminalNode IGUAL() { return getToken(ParserLinguagem.IGUAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserLinguagemVisitor ) return ((ParserLinguagemVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(IDENTIFICADOR);
			setState(9);
			match(IGUAL);
			setState(10);
			expressao(0);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode MAIS() { return getToken(ParserLinguagem.MAIS, 0); }
		public TerminalNode MENOS() { return getToken(ParserLinguagem.MENOS, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserLinguagemVisitor ) return ((ParserLinguagemVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expressao, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(13);
			termo(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(21);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(15);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(16);
						match(MAIS);
						setState(17);
						termo(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(18);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(19);
						match(MENOS);
						setState(20);
						termo(0);
						}
						break;
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode MULTIPLICACAO() { return getToken(ParserLinguagem.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(ParserLinguagem.DIVISAO, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserLinguagemVisitor ) return ((ParserLinguagemVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		return termo(0);
	}

	private TermoContext termo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermoContext _localctx = new TermoContext(_ctx, _parentState);
		TermoContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_termo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(27);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(35);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(29);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(30);
						match(MULTIPLICACAO);
						setState(31);
						fator();
						}
						break;
					case 2:
						{
						_localctx = new TermoContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_termo);
						setState(32);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(33);
						match(DIVISAO);
						setState(34);
						fator();
						}
						break;
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(ParserLinguagem.ABRE_PARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(ParserLinguagem.FECHA_PARENTESES, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(ParserLinguagem.IDENTIFICADOR, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserLinguagemVisitor ) return ((ParserLinguagemVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fator);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PARENTESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(ABRE_PARENTESES);
				setState(41);
				expressao(0);
				setState(42);
				match(FECHA_PARENTESES);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(IDENTIFICADOR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 2:
			return termo_sempred((TermoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termo_sempred(TermoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\t0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0016"+
		"\b\u0001\n\u0001\f\u0001\u0019\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002$\b\u0002\n\u0002\f\u0002\'\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003.\b\u0003\u0001\u0003"+
		"\u0000\u0002\u0002\u0004\u0004\u0000\u0002\u0004\u0006\u0000\u00000\u0000"+
		"\b\u0001\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004\u001a"+
		"\u0001\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\b\t\u0005\u0001"+
		"\u0000\u0000\t\n\u0005\u0002\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000"+
		"\u000b\u0001\u0001\u0000\u0000\u0000\f\r\u0006\u0001\uffff\uffff\u0000"+
		"\r\u000e\u0003\u0004\u0002\u0000\u000e\u0017\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\n\u0003\u0000\u0000\u0010\u0011\u0005\u0003\u0000\u0000\u0011\u0016"+
		"\u0003\u0004\u0002\u0000\u0012\u0013\n\u0002\u0000\u0000\u0013\u0014\u0005"+
		"\u0004\u0000\u0000\u0014\u0016\u0003\u0004\u0002\u0000\u0015\u000f\u0001"+
		"\u0000\u0000\u0000\u0015\u0012\u0001\u0000\u0000\u0000\u0016\u0019\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0006\u0002\uffff\uffff\u0000\u001b\u001c"+
		"\u0003\u0006\u0003\u0000\u001c%\u0001\u0000\u0000\u0000\u001d\u001e\n"+
		"\u0003\u0000\u0000\u001e\u001f\u0005\u0005\u0000\u0000\u001f$\u0003\u0006"+
		"\u0003\u0000 !\n\u0002\u0000\u0000!\"\u0005\u0006\u0000\u0000\"$\u0003"+
		"\u0006\u0003\u0000#\u001d\u0001\u0000\u0000\u0000# \u0001\u0000\u0000"+
		"\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&\u0005\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"()\u0005\u0007\u0000\u0000)*\u0003\u0002\u0001\u0000*+\u0005\b\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,.\u0005\u0001\u0000\u0000-(\u0001\u0000\u0000"+
		"\u0000-,\u0001\u0000\u0000\u0000.\u0007\u0001\u0000\u0000\u0000\u0005"+
		"\u0015\u0017#%-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
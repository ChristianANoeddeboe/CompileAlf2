// Generated from C:/Users/Christian/IdeaProjects/CompileAlf2/src/main/java\coco.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cocoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, STRINGTOKEN=9, 
		ID=10, WHITESPACE=11, COMMENT=12, ANTLRCODE=13;
	public static final int
		RULE_start = 0, RULE_tokenDef = 1, RULE_dataTypeDef = 2, RULE_alternatives = 3, 
		RULE_alternative = 4, RULE_arguments = 5, RULE_argument = 6, RULE_token = 7;
	public static final String[] ruleNames = {
		"start", "tokenDef", "dataTypeDef", "alternatives", "alternative", "arguments", 
		"argument", "token"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'data'", "'='", "';'", "'|'", "'('", "')'", "':'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "STRINGTOKEN", "ID", 
		"WHITESPACE", "COMMENT", "ANTLRCODE"
	};
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
	public String getGrammarFileName() { return "coco.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cocoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(cocoParser.EOF, 0); }
		public List<TokenDefContext> tokenDef() {
			return getRuleContexts(TokenDefContext.class);
		}
		public TokenDefContext tokenDef(int i) {
			return getRuleContext(TokenDefContext.class,i);
		}
		public List<DataTypeDefContext> dataTypeDef() {
			return getRuleContexts(DataTypeDefContext.class);
		}
		public DataTypeDefContext dataTypeDef(int i) {
			return getRuleContext(DataTypeDefContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitStart(this);
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
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(16);
				tokenDef();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(22);
				dataTypeDef();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
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

	public static class TokenDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cocoParser.ID, 0); }
		public TerminalNode ANTLRCODE() { return getToken(cocoParser.ANTLRCODE, 0); }
		public TokenDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterTokenDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitTokenDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitTokenDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenDefContext tokenDef() throws RecognitionException {
		TokenDefContext _localctx = new TokenDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tokenDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(ID);
			setState(31);
			match(ANTLRCODE);
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

	public static class DataTypeDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cocoParser.ID, 0); }
		public AlternativesContext alternatives() {
			return getRuleContext(AlternativesContext.class,0);
		}
		public DataTypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterDataTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitDataTypeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitDataTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeDefContext dataTypeDef() throws RecognitionException {
		DataTypeDefContext _localctx = new DataTypeDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dataTypeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__0);
			setState(34);
			match(ID);
			setState(35);
			match(T__1);
			setState(36);
			alternatives();
			setState(37);
			match(T__2);
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

	public static class AlternativesContext extends ParserRuleContext {
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public AlternativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternatives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterAlternatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitAlternatives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitAlternatives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativesContext alternatives() throws RecognitionException {
		AlternativesContext _localctx = new AlternativesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alternatives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			alternative();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(40);
				match(T__3);
				setState(41);
				alternative();
				}
				}
				setState(46);
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

	public static class AlternativeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(cocoParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(ID);
			setState(48);
			match(T__4);
			setState(49);
			arguments();
			setState(50);
			match(T__5);
			setState(51);
			match(T__6);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRINGTOKEN || _la==ID) {
				{
				{
				setState(52);
				token();
				}
				}
				setState(57);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			argument();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(59);
				match(T__7);
				setState(60);
				argument();
				}
				}
				setState(65);
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

	public static class ArgumentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(cocoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(cocoParser.ID, i);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
			setState(67);
			match(ID);
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

	public static class TokenContext extends ParserRuleContext {
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
	 
		public TokenContext() { }
		public void copyFrom(TokenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NonterminalContext extends TokenContext {
		public TerminalNode ID() { return getToken(cocoParser.ID, 0); }
		public NonterminalContext(TokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterNonterminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitNonterminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitNonterminal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TerminalContext extends TokenContext {
		public TerminalNode STRINGTOKEN() { return getToken(cocoParser.STRINGTOKEN, 0); }
		public TerminalContext(TokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cocoListener ) ((cocoListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cocoVisitor ) return ((cocoVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_token);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new NonterminalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(ID);
				}
				break;
			case STRINGTOKEN:
				_localctx = new TerminalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(STRINGTOKEN);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17L\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\68\n\6\f\6\16\6;\13\6\3\7\3\7\3\7\7\7@\n\7\f\7\16\7C\13"+
		"\7\3\b\3\b\3\b\3\t\3\t\5\tJ\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2I\2\25"+
		"\3\2\2\2\4 \3\2\2\2\6#\3\2\2\2\b)\3\2\2\2\n\61\3\2\2\2\f<\3\2\2\2\16D"+
		"\3\2\2\2\20I\3\2\2\2\22\24\5\4\3\2\23\22\3\2\2\2\24\27\3\2\2\2\25\23\3"+
		"\2\2\2\25\26\3\2\2\2\26\33\3\2\2\2\27\25\3\2\2\2\30\32\5\6\4\2\31\30\3"+
		"\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\33\3"+
		"\2\2\2\36\37\7\2\2\3\37\3\3\2\2\2 !\7\f\2\2!\"\7\17\2\2\"\5\3\2\2\2#$"+
		"\7\3\2\2$%\7\f\2\2%&\7\4\2\2&\'\5\b\5\2\'(\7\5\2\2(\7\3\2\2\2).\5\n\6"+
		"\2*+\7\6\2\2+-\5\n\6\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\t\3"+
		"\2\2\2\60.\3\2\2\2\61\62\7\f\2\2\62\63\7\7\2\2\63\64\5\f\7\2\64\65\7\b"+
		"\2\2\659\7\t\2\2\668\5\20\t\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3"+
		"\2\2\2:\13\3\2\2\2;9\3\2\2\2<A\5\16\b\2=>\7\n\2\2>@\5\16\b\2?=\3\2\2\2"+
		"@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\r\3\2\2\2CA\3\2\2\2DE\7\f\2\2EF\7\f\2"+
		"\2F\17\3\2\2\2GJ\7\f\2\2HJ\7\13\2\2IG\3\2\2\2IH\3\2\2\2J\21\3\2\2\2\b"+
		"\25\33.9AI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from C:/Users/Christian/IdeaProjects/CompileAlf2/src/main/java\coco.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cocoParser}.
 */
public interface cocoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cocoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(cocoParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link cocoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(cocoParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link cocoParser#tokenDef}.
	 * @param ctx the parse tree
	 */
	void enterTokenDef(cocoParser.TokenDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link cocoParser#tokenDef}.
	 * @param ctx the parse tree
	 */
	void exitTokenDef(cocoParser.TokenDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link cocoParser#dataTypeDef}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeDef(cocoParser.DataTypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link cocoParser#dataTypeDef}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeDef(cocoParser.DataTypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link cocoParser#alternatives}.
	 * @param ctx the parse tree
	 */
	void enterAlternatives(cocoParser.AlternativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link cocoParser#alternatives}.
	 * @param ctx the parse tree
	 */
	void exitAlternatives(cocoParser.AlternativesContext ctx);
	/**
	 * Enter a parse tree produced by {@link cocoParser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(cocoParser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cocoParser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(cocoParser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cocoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(cocoParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cocoParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(cocoParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link cocoParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(cocoParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link cocoParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(cocoParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nonterminal}
	 * labeled alternative in {@link cocoParser#token}.
	 * @param ctx the parse tree
	 */
	void enterNonterminal(cocoParser.NonterminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nonterminal}
	 * labeled alternative in {@link cocoParser#token}.
	 * @param ctx the parse tree
	 */
	void exitNonterminal(cocoParser.NonterminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Terminal}
	 * labeled alternative in {@link cocoParser#token}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(cocoParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Terminal}
	 * labeled alternative in {@link cocoParser#token}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(cocoParser.TerminalContext ctx);
}
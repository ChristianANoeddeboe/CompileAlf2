// Generated from C:/Users/Christian/IdeaProjects/CompileAlf2/src/main/java\coco.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cocoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cocoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cocoParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(cocoParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link cocoParser#tokenDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenDef(cocoParser.TokenDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link cocoParser#dataTypeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeDef(cocoParser.DataTypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link cocoParser#alternatives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternatives(cocoParser.AlternativesContext ctx);
	/**
	 * Visit a parse tree produced by {@link cocoParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(cocoParser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cocoParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(cocoParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link cocoParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(cocoParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Nonterminal}
	 * labeled alternative in {@link cocoParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonterminal(cocoParser.NonterminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Terminal}
	 * labeled alternative in {@link cocoParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(cocoParser.TerminalContext ctx);
}
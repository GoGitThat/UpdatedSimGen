/*
 * generated by Xtext 2.18.0.M3
 */
package cs.queensu.ca.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UnityAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("cs/queensu/ca/parser/antlr/internal/InternalUnity.tokens");
	}
}

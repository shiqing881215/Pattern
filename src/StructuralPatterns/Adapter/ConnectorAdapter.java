package StructuralPatterns.Adapter;

/**
 * The Adapter pattern is used so that two unrelated interfaces can work together. 
 * 
 * http://www.allapplabs.com/java_design_patterns/adapter_pattern.htm
 * @author qshi
 *
 */
public class ConnectorAdapter implements Socket{

	@Override
	public String getOutput() {
		Plug plug = new Plug();
		return plug.getInput();
	}

}

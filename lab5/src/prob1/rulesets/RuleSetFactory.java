package prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import prob1.gui.BookWindow;
import prob1.gui.CDWindow;


final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();

	static {
		map.put(BookWindow.class, new BookRuleSet());
		map.put(CDWindow.class, new CDRuleSet());
	}
	public static RuleSet getRuleSet(Component component) {
		Class<? extends Component> clazz = component.getClass();
		if(!map.containsKey(clazz)) {
			throw new RuntimeException("No RuleSet for " + clazz);
		}
		return map.get(clazz);
	}
	
}

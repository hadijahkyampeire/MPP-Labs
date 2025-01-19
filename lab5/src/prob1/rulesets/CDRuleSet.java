package prob1.rulesets;

import java.awt.Component;

import prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {
	private CDWindow cdWindow;

	@Override
	public void applyRules(Component ob) throws RuleException {
		cdWindow = (CDWindow) ob;
		nonemptyRule();
		isPrice2DecimalFloatingRule();
		isPriceGreaterThan();
	}

	private void nonemptyRule() throws RuleException {
		String artist = cdWindow.getArtistValue().trim();
		String title = cdWindow.getTitleValue().trim();
		String price = cdWindow.getPriceValue().trim();
		if(artist.isEmpty() || title.isEmpty() || price.isEmpty()) {
			throw new RuleException("All CD fields must not be empty");
		}
	}

	private void isPrice2DecimalFloatingRule() throws RuleException {
		String price = cdWindow.getPriceValue().trim();
		try {
			double parsedPrice = Double.parseDouble(price);
			// Multiply by 100 and check if it's an integer
			if ((parsedPrice * 100) % 1 != 0) {
				throw new RuleException("Price must be a floating point number with two decimal places.");
			}
		} catch (RuleException e) {
			throw new RuleException(e.getMessage());
		}
	}

	private void isPriceGreaterThan() throws RuleException{
		String price = cdWindow.getPriceValue().trim();
		if(Double.parseDouble(price) <= 0.49) {
			throw new RuleException("Price must be greater than 0.49");
		}
	}
}

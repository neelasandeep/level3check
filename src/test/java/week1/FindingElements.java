package week1;

import org.testng.Assert;
import org.testng.annotations.Test;

import allpages.day1.pages.AxesFindings;
import allpages.day1.pages.ShadowDompages;
import utilities.BaseClass;
import utilities.BrowserFactory;

public class FindingElements extends BaseClass {
	AxesFindings page;
	ShadowDompages shadowpage;

	public FindingElements() {
		BrowserFactory browser = new utilities.BrowserFactory();
		driver = browser.startBrowser();
		page = new AxesFindings(driver);
		shadowpage = new ShadowDompages(driver);

	}

// Xpath Axes techniques
	// @Test
	public void xpathAxesfollowingsibling() {
		open(config.getDataFromConfig("xpathaxesurl"));
		page.checkfollowingsiblingbyemailExample();
	}

	// @Test
	public void xpathAxeschildExample() {
		open(config.getDataFromConfig("xpathaxesurl"));
		Assert.assertEquals(page.labelscountusingchildMethod(), 4);
	}

	// @Test
	public void xpathAxesprecedingelement() {
		open(config.getDataFromConfig("xpathaxesurl"));
		page.precedingsiblingcheckbox();
	}

//	@Test
	public void descendantexample() {
		open(config.getDataFromConfig("xpathaxesurl"));
		page.descendantchildExample();
	}

//shadowdom example
	//@Test
	public void shadowmelementselection() {
		open(config.getDataFromConfig("shadowdomurl"));
		shadowpage.findshadowelemet();

	}
	@Test
	public void multipleshadowelements() {
		open(config.getDataFromConfig("multipleshadowdoms"));
		shadowpage.multipleshadowElements();

	}
	

}

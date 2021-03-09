package week1;

import org.testng.annotations.Test;

import allpages.day1.pages.ShadowDompages;
import utilities.ParallelBase;
//run testng.xml
public class Day2JunitTestNg extends ParallelBase {
	@Test
	public void multipleshadowelements2() {
		ShadowDompages shadowpage = new ShadowDompages(driver.get());
		open(config.getDataFromConfig("multipleshadowdoms"));
		shadowpage.multipleshadowElements();
		System.out.println("second-->"+Thread.currentThread().getId());

	}
	@Test
	public void multipleshadowelements3() {
		ShadowDompages shadowpage = new ShadowDompages(driver.get());
		open(config.getDataFromConfig("multipleshadowdoms"));
		shadowpage.multipleshadowElements();
		System.out.println("three-->"+Thread.currentThread().getId());

	}
	@Test
	public void multipleshadowelements4() {
		ShadowDompages shadowpage = new ShadowDompages(driver.get());
		open(config.getDataFromConfig("multipleshadowdoms"));
		shadowpage.multipleshadowElements();
		System.out.println("fourth-->"+Thread.currentThread().getId());

	}
	@Test
	public void multipleshadowelements5() {
		ShadowDompages shadowpage = new ShadowDompages(driver.get());
		open(config.getDataFromConfig("multipleshadowdoms"));
		shadowpage.multipleshadowElements();
		System.out.println("fifth-->"+Thread.currentThread().getId());

	}

}

/**
 * 
 */
package org.spring.demo.design_patterns.creational.builder;

/**
 * @author veturi
 *
 */
public class LunchOrderTelescope {
	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	public LunchOrderTelescope (String bread) {
		this.bread = bread;	
	}
	
	public LunchOrderTelescope (String bread, String condiments) {
		this(bread);
		this.condiments = condiments;
	}
	
	public LunchOrderTelescope (String bread, String condiments, String dressing) {
		this(bread, condiments);
		this.dressing = dressing;
	}
	
	public LunchOrderTelescope (String bread, String condiments, String dressing, String meat) {
		this(bread, condiments, dressing);
		this.meat = meat;
	}

	public String getBread() {
		return bread;
	}
	
	public String getCondiments() {
		return condiments;
	}

	public String getDressing() {
		return dressing;
	}

	public String getMeat() {
		return meat;
	}
}

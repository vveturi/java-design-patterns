package org.spring.demo.design_patterns.creational.builder;

public class LunchOrderTelescopeDemo {

	public static void main(String args[]) {

		LunchOrderTelescope lunchOrderTele = new LunchOrderTelescope("Wheat", "Lettuce", "Mustard", "Ham");

		// lunchOrderTele.setBread("Wheat");
		// lunchOrderTele.setCondiments("Lettuce");
		// lunchOrderTele.setDressing("Mustard");
		// lunchOrderTele.setMeat("Ham");

		System.out.println(lunchOrderTele.getBread());
		System.out.println(lunchOrderTele.getCondiments());
		System.out.println(lunchOrderTele.getDressing());
		System.out.println(lunchOrderTele.getMeat());
	}

}

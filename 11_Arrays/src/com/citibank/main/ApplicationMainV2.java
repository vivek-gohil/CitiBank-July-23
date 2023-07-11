package com.citibank.main;

import com.citibank.domain.ApplicationV2;

public class ApplicationMainV2 {
	public static void main(String[] args) {
		String[] cars = new String[5];

		cars[0] = "Nexon";
		cars[1] = "Breeza";
		cars[2] = "Omni";
		cars[3] = "XUV 500";
		cars[4] = "Scorpio";

		ApplicationV2 applicationV2 = new ApplicationV2(cars);
		applicationV2.process();
		applicationV2.display();

	}
}

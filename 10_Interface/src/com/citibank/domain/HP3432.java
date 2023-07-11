package com.citibank.domain; 

public class HP3432 extends PrinterDriver implements UpdateTwo {
	@Override
	public void print() {
		System.out.println("HP3432 is printing");
	}

	@Override
	public void wirelessPrinting() {
		System.out.println("H3432 is printing wireless");
	}
}

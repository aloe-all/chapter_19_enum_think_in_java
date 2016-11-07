package com.crg.constant;

import java.util.EnumSet;


public class TestConstant {
	EnumSet<ConstantSpecificMethod> enumSet = EnumSet.of(ConstantSpecificMethod.CLASSPATH);
	private void addConstant(ConstantSpecificMethod constantSpecificMethod){
		enumSet.add(constantSpecificMethod);
	}
	private void PrinterInfo(){
		for (ConstantSpecificMethod constantSpecificMethod : enumSet) {
			System.out.println(constantSpecificMethod.getInfo());
			constantSpecificMethod.sayHello();
		}
	}
	public static void main(String[] args) {
		TestConstant testConstant = new TestConstant();
		testConstant.addConstant(ConstantSpecificMethod.VERSION);
		testConstant.addConstant(ConstantSpecificMethod.DATE_TIME);
		testConstant.addConstant(ConstantSpecificMethod.CLASSPATH);
		testConstant.addConstant(ConstantSpecificMethod.VERSION);
		testConstant.PrinterInfo();
	}

}

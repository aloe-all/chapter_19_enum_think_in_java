package com.crg.constant;

import java.text.DateFormat;
import java.util.Date;

public enum ConstantSpecificMethod {
	DATE_TIME{

		@Override
		String getInfo() {
			return DateFormat.getDateInstance().format(new Date());
		}
		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			super.sayHello();
			System.out.println("DATE_TIME say hello");
		}
	},
	CLASSPATH{

		@Override
		String getInfo() {
			return System.getenv("CLASSPATH");
		}
			
		},
	VERSION{

		@Override
		String getInfo() {
			return System.getProperty("java.version");
		}
			
		};
	/**
	 *  抽象方法
	 * @return
	 */
	abstract String getInfo();
	
	/**
	 *  一般方法
	 */
	public void sayHello(){
		System.out.println("say hello");
	}
	
	public static void main(String[] args) {
		for (ConstantSpecificMethod constantSpecificMethod : ConstantSpecificMethod.values()) {
			System.out.println(constantSpecificMethod.getInfo());
		}
	}
}

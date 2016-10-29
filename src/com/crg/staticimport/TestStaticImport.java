package com.crg.staticimport;
import static com.crg.staticimport.Fruits.*;

public class TestStaticImport {
	private Fruits fruit;
	private TestStaticImport(Fruits fruit){
		this.fruit = fruit;
	}
	@Override
	public String toString() {
		return fruit.name();
	}
	public static void main(String[] args) {
		System.out.println(new TestStaticImport(APPLE));
		System.out.println(new TestStaticImport(ORANGE));
		System.out.println(new TestStaticImport(PEAR));
		System.out.println(new TestStaticImport(BANANA));
		System.out.println(new TestStaticImport(TOMATO));
	}
}

package com.crg.staticimport;

import java.util.Random;

public enum Fruits implements Generator<Fruits>{
	APPLE, BANANA, PEAR, ORANGE, TOMATO;

	@Override
	public Fruits next() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
	}
	
	/**
	 *  随机产生一个 Enum 的实例
	 * @param ls
	 * @return
	 */
	public static <T extends Enum<T>> T randomEnum(Class<T> ls){
		return random(ls.getEnumConstants());
	}
	/**
	 *  随机产生一个 values 的数组元素
	 * @param values
	 * @return
	 */
	public static <T> T random(T[] values){
		Random random = new Random();
		return values[random.nextInt(values.length)];
	}
	
	/**
	 *  重写该方法
	 */
	@Override
	public String toString() {
		return name() + " || ";
	}
}

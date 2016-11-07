package com.crg.enuminterface;

import java.util.Random;

public enum Menu {
	NOODLE(Food.Noodle.class),
	RICE(Food.Rice.class),
	VEGETABLES(Food.Vegetables.class);
	private Food[] values;
	
	private Menu(Class<? extends Food> kind){
		values = kind.getEnumConstants();
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
	 *  随机点一个食物
	 * @return
	 */
	public Food randomSelect(){
		return random(values);
	}
	
	// 生成5份随机的菜单
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (Menu menu : Menu.values()) {
				System.out.println(menu.randomSelect());
			}
			System.out.println("=================================");
		}
	}
}

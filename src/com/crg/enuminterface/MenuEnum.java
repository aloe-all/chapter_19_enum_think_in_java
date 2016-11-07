package com.crg.enuminterface;

import java.util.Random;

public enum MenuEnum {
	NOODLE(Food.Noodle.class),
	RICE(Food.Rice.class),
	VEGETABLES(Food.Vegetables.class);
	private Food[] values;
	
	private MenuEnum(Class<? extends Food> kind){
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
	
	interface Food {
		// 油泼面,裤袋面,扯面
		enum Noodle implements Food {POUPO_NOODLE, POCKET_NOODLE, PULLED_NOODLE}
		
		// 盖浇饭,黄焖鸡,炒饭
		enum Rice implements Food {GAIJIAO_RICE, BRAISED_CHICKEN_RICE, FRIED_RICE}
		
		// 蔬菜类:西红柿,土豆,西兰花   
		enum Vegetables implements Food {TOMATO, POTATO, BROCCOLI}
	}
	
	// 生成5份随机的菜单
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (MenuEnum menu : MenuEnum.values()) {
				System.out.println(menu.randomSelect());
			}
			System.out.println("=================================");
		}
	}
}

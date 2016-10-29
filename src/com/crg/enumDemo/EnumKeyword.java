package com.crg.enumDemo;

/**
 * 
 * @author aloe
 *	测试枚举类型 
 */
public class EnumKeyword {
	/**
	 *  声明一组常量集 fruits enum 以前这样声明
	 */
	public final static int APPLE = 0;
	public final static int BANANA = 1;
	public final static int PEAR = 2;
	public final static int ORANGE = 3;
	public final static int TOMATO = 4;
	
	/**
	 *  enum 声明
	 * @author aloe
	 *
	 */
	public enum Fruits{
		APPLE, BANANA, PEAR, ORANGE, TOMATO
	}
	
	public static void main(String[] args) {
		// 使用 enum 就类似使用普通的 class,创建一个 enum 类型的引用,并给其赋值
		Fruits oneFruit = Fruits.APPLE;
		System.out.println(oneFruit);
//		int fruitKind = TOMATO;
//		switch (fruitKind) {
//		case APPLE:
//			System.out.println("I want to eat apple");
//			break;
//		case BANANA:
//			System.out.println("I want to eat banana");
//			break;
//		case PEAR:
//			System.out.println("I want to eat pear");
//			break;
//		case ORANGE:
//			System.out.println("I want to eat orange");
//			break;
//		case TOMATO:
//			System.out.println("I want to eat tomato");
//			break;
//		default:
//			System.out.println("there is not any fruit");
//			break;
//		}
		
	}
}

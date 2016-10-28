package com.crg.enumkeyword;

/**
 *  测试枚举类型 
 * @author crg
 *
 */
public class EnumKeywordTest {
	
	/**
	 *  声明一组常量集 fruits
	 */
	public final static int APPLE = 0;
	public final static int BANANA = 1;
	public final static int PEAR = 2;
	public final static int ORANGE = 3;
	public final static int TOMATO = 4;
	
	
	public static void main(String[] args) {
		int fruitKind = TOMATO;
		switch (fruitKind) {
		case APPLE:
			System.out.println("I want to eat apple");
			break;
		case BANANA:
			System.out.println("I want to eat banana");
			break;
		case PEAR:
			System.out.println("I want to eat pear");
			break;
		case ORANGE:
			System.out.println("I want to eat orange");
			break;
		case TOMATO:
			System.out.println("I want to eat tomato");
			break;
		default:
			System.out.println("there is not any fruit");
			break;
		}
	}

}

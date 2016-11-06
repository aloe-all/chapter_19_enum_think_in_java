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
//	public final static int APPLE = 0;
//	public final static int BANANA = 1;
//	public final static int PEAR = 2;
//	public final static int ORANGE = 3;
//	public final static int TOMATO = 4;
	
	/**
	 *  enum 声明
	 * @author aloe
	 *
	 */
	public enum Fruits{
		APPLE, BANANA, PEAR, ORANGE, TOMATO
	}
	private Fruits oneFruit;
	private EnumKeyword(Fruits oneFruit){
		this.oneFruit = oneFruit;
	}
	private void choiceOneFruit(){
		switch (oneFruit) {
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
			return;
		default:
			System.out.println("there is not any fruit");
			break;
		}
	}
	public static void main(String[] args) {
		
		for (Fruits fruit : Fruits.values()) {
			//enum 实例的序列号,从0开始
			System.out.println(fruit + " fruit.ordinal " + fruit.ordinal() + " enum 实例的序列号,从0开始 ");
			
			//enum 的实例名字 和 toString() 返回的一样
			System.out.println(fruit + " fruit.name " + fruit.name() + " enum 的实例名字 和 toString() 返回的一样 ");
			System.out.print(fruit.compareTo(Fruits.PEAR) + " compareTo() 返回序列号的差 ");
			System.out.print("||||");
			
//			public final boolean equals(Object other) {
//	        return this==other;
//	    }
			System.out.print(fruit.equals(Fruits.PEAR) + " equals() 用 == 比较的 ");
			System.out.print("||||");
			System.out.println(fruit == Fruits.PEAR);
			System.out.println(fruit.getDeclaringClass() + " enum声明的类型 ");
			System.out.println("====================================================");
		}
		System.out.println("====================================================");
		System.out.println("====================================================");
		// produce an enum value from a string name
		for (String string : "APPLE BANANA PEAR ORANGE TOMATO".split(" ")) {
			System.out.println(Enum.valueOf(Fruits.class, string));
		}
		//==================================================================
		//==================================================================
		EnumKeyword enumKeyword = new EnumKeyword(Fruits.BANANA);
		enumKeyword.choiceOneFruit();
		}
//		for (Fruits fruit : Fruits.values()) {
//			System.out.println(fruit + ".ordinal " + fruit.ordinal());
//		}
		
		//==================================================================
		//==================================================================
//		// 使用 enum 就类似使用普通的 class,创建一个 enum 类型的引用,并给其赋值
//		Fruits oneFruit = Fruits.APPLE;
//		System.out.println(oneFruit);
//		System.out.println(oneFruit.toString());
		
		//==================================================================
		//==================================================================
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

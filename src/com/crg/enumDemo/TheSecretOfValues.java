package com.crg.enumDemo;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

import com.crg.staticimport.Fruits;
import com.crg.staticimport.Generator;

public class TheSecretOfValues {
	public static Set<String> analyze(Class<?> enumClass){
		System.out.println("-----------analyzing " + enumClass.getSimpleName() +" ----------------");
		
		//打印该类的接口
		System.out.print(enumClass.getSimpleName() + "'s interfaces: ");
		for (Type type : enumClass.getGenericInterfaces()) {
			System.out.print(type + "; ");
		}
		System.out.println();
		
		//打印该类的父类
		System.out.println("Base: " + enumClass.getSuperclass());
		
		//打印该类的所有方法名
		System.out.println("Methods: ");
		Set<String> methods = new TreeSet<>();
		for (Method method : enumClass.getMethods()) {
			methods.add(method.getName());
		}
		
		System.out.println(methods);
		return methods;
	}
	
	public static <T> void PrintNext(Generator<T> generator){
		System.out.print(generator.next() + " ");
	}
	public static void main(String[] args) {
		
		for (int i = 0; i < 15; i++) {
			System.out.print(Fruits.randomEnum(Fruits.class));
		}
//		Fruits generator = Fruits.BANANA;
//		for (int i = 0; i < 10; i++) {
//			PrintNext(generator);
//		}
		
//		// 获得 Enum.class 的所有方法
//		Set<String> enumMethods = analyze(Enum.class);
//		
//		// 获得 Fruits.class 的所有方法
//		Set<String> fruitMethods = analyze(Fruits.class);
//		System.out.println("----------------------------------------------------");
//		System.out.println("fruitMethods.containsAll(enumMethods) ? : " + fruitMethods.containsAll(enumMethods));
//		System.out.println("fruitMethods.removeAll(enumMethods) >>>>>>>>>>>>>>>>>>");
//		fruitMethods.removeAll(enumMethods);
//		System.out.println("fruitMethods 移除enumMethods后的方法为: ");
//		
//		//fruitMethods 移除enumMethods后的方法为:
//		System.out.println(fruitMethods);
		
//		===========================================================================================================
//		===========================================================================================================
		
//		Fruits[] fruits = Fruits.values();
//		
//		// Upcast 向上转型
//		Enum fruit = Fruits.APPLE;
//		for (Enum enumFruit : fruit.getClass().getEnumConstants()) {
//			System.out.println(enumFruit);
//		}
		
//		===========================================================================================================
//		===========================================================================================================
		
//		Class<Integer> integerClass = Integer.class;
//		for (Object obj : integerClass.getEnumConstants()) {
//			System.out.println(obj);
//		}
	} 

}

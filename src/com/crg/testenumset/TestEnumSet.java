package com.crg.testenumset;

import java.util.EnumSet;
import static com.crg.testenumset.TestEnumSet.AlarmPoints.*;
public class TestEnumSet {
	enum AlarmPoints{classroom1, classroom2, classroom3, classroom4, classroom5, classroom6}
	public static void main(String[] args) {
		// 创建一个空的 EnumSet
		EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
		points.add(classroom1);
		System.out.println(points);
		
		// 添加多个元素
		points.addAll(EnumSet.of(classroom2, classroom3, classroom4));
		System.out.println(points);
		
		// 添加所有元素
		points = EnumSet.allOf(AlarmPoints.class);
		System.out.println(points);
		
		// 移除指定所有元素
		points.removeAll(EnumSet.of(classroom1, classroom2, classroom3));
		System.out.println(points);
		
		//添加单个元素
		points.add(classroom1);
		points.add(classroom2);
		System.out.println(points);
		
		// 保留指定范围内的所有元素
		points.retainAll(EnumSet.range(classroom1, classroom4));
		System.out.println(points);
		
		// 移除指定范围内的所有元素
		points.removeAll(EnumSet.range(classroom1, classroom4));
		System.out.println(points);
		
		// 产生一个新的EnumSet 包含所有元素,去处指定的元素
		points = EnumSet.complementOf(EnumSet.of(classroom1));
		System.out.println(points);
		
	}
}

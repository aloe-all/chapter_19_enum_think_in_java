package com.crg.enuminterface;

public interface Food {
	// 油泼面,裤袋面,扯面
	enum Noodle implements Food {POUPO_NOODLE, POCKET_NOODLE, PULLED_NOODLE}
	
	// 盖浇饭,黄焖鸡,炒饭
	enum Rice implements Food {GAIJIAO_RICE, BRAISED_CHICKEN_RICE, FRIED_RICE}
	
	// 蔬菜类:西红柿,土豆,西兰花   
	enum Vegetables implements Food {TOMATO, POTATO, BROCCOLI}
}

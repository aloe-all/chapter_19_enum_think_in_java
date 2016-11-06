package com.crg.staticimport;

public enum FruitsAddAdditonalInfo {
	
	/**
	 *  枚举实例 必须被定义在方法的前面
	 */
	APPLE("这是苹果"), 
	BANANA("这是香蕉"), 
	PEAR("这是梨子"), 
	ORANGE("这是橘子"), 
	
	// 最后一个枚举实例后面必须添加一个";"
	TOMATO("这是西红柿");
	private String description;
	
	/**
	 *  构造器的访问权限必须是 private 或者 package
	 * @param description
	 */
	private FruitsAddAdditonalInfo(String description){
		this.description = description;
	}
	public String getDescription(){
		return description;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name() + " : " + getDescription();
	}
	public static void main(String[] args) {
		for (FruitsAddAdditonalInfo fruit : FruitsAddAdditonalInfo.values()) {
			System.out.println(fruit + " : " + fruit.getDescription());
		}
	}

}

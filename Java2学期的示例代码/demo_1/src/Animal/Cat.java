package Animal;

import java.util.Queue;


//import java.util.Queue;
//import java.util.Stack;
//import java.util.*;

public class Cat extends Animal{
	//猫独特的属性，可以继续添加
	private String catType;
	private final String catType2 = "a";
	public static void main(String[] args) {
		
	}
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, String cateType) {
		super(name);
		this.catType = cateType;
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override
	public void makeSound() {
		// 根据实际需要你可以调用父类的叫法
//		super.makeSound();
//		简化实现,现实实现会以发声来体现
//		因为 anminalName 是父类的private,所以在子类里要通过调用get函数来获取
		System.out.println(getAnmimalName()+"  喵喵喵");
		
	}
	
	
	
	@Override
	public void sleep() {
		Queue<Integer> q;
//		父类 private 数据的访问
//		this.getCategory();
		
//		父类 protected 数据的访问
		this.category;
		
		// TODO Auto-generated method stub
//		父类的sleep功能也是需要的。
		super.sleep();
//		然后再描述猫睡觉的独特部分
	}

	//猫独特的方法，可以继续添加
	/**
	 * 假设 从高处跳下还能活 是猫独特的功能
	 */
	public void jumpFromHighAndSurvive() {
		System.out.println(" 猫能从高处跳下且不死");
		int[] arr= new int[5];
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String infoString="catType :"+catType;
		return infoString;
	}
//	
//	public String toString() {
//		System.out.println("catType :"+catType);
//		return catType;
//	};
}

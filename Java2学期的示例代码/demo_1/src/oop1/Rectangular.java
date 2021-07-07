package oop1;

import java.util.Stack;

/**
 * 
 * @author ianye
 * 一个矩形
 * 属性：长和宽
 * 行为/功能  求矩形的面积，周长，以及设置或者获取 矩形的长和宽
 */
public class Rectangular {
	
//	静态常量， 加不加public 都一样。 一个类的标签，和其他类做区别,若改为 private ，则对象外不能直接访问，方法的用法也类似
	static String TAG = "Rectangular";
	
// 统计创建对象次数的静态常量
	static int  createTimes = 0;

//  没有参数的构造函数，在new Rectangular()的时候使用
	public Rectangular() {
		// TODO Auto-generated constructor stub
		length =0;
		width = 0;
		plusCreateTimes();
		
		Integer integer = new Integer(99);
		Integer integer2 = new Integer("99");
		I
	}
	
//	Rectangular rect = new Rectangular(10,20);
	Rectangular(double l,double d){
		length = l;
		width = d;
		plusCreateTimes();
	}
	
	Rectangular(double l){
		length = l;
		width = 0;
		plusCreateTimes();
	}
	
	
//	静态方法, 加不加public 都一样。
	static void showTag() {
		System.out.println("Tag : "+TAG); 
	}
	
	static void plusCreateTimes() {
		++createTimes;
	}
	
	static void resetCreateTimes() {
		createTimes = 0;
	}
	
	
	static void showHowMayObjectsCreated() {
		System.out.println("You have created "+createTimes+" Rectangular objects");
	}
	
//	数据成员(属性)
	private double length;
	private double width;
	
	private double abc;
	
public double getAbc() {
		return abc;
	}

	public void setAbc(double abc) {
		this.abc = abc;
	}
//	不允许 Obj.abc

	//	public 可以不加，表示他们能在其他类里面用 当前类(Rectangular)的对象.名字的方式访问
	private double testData;
	void testMethod() {
		Stack<Integer> stack = new Stack<Integer>();
//		stack.remove(index)
	
	}


public double getTestData() {
		return testData;
	}

	public void setTestData(double testData) {
		this.testData = testData; //1
		this.testData = testData;  //2
	}

	//	方法成员(行为)
	public double getArea() {
		return length*width;
		
	}
	
	public double getCircumference() {
		return 2*(length+width);
	}
	
	public void showAreaInfo() {
		System.out.println("长 = "+getLength() + " 宽 = "+getWidth() +" 面积 = "+getArea());
	}
	
	public void showCircumferenceInfo() {
		System.out.println("长 = "+getLength() + " 宽 = "+getWidth() +" 周长 = "+getCircumference());
	}
	

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}
	
	private void privateMethod() {
		
	}

	public void setWidth(double width) {
		this.width = width;
		
	}
	
//	右击 -> source -> Generate。。。
	
//包含main的是主类，否则就是普通的类
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

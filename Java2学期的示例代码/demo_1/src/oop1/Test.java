package oop1;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		constructorExample();
//		
//		staticVisitExample();
		
//		staticDataExample();
//		
		visibilityExample();
//		
//		passReferenceExample();
		
		


	}
	
	static void  constructorExample() {
//		无参数构造函数
		Rectangular rect1 = new Rectangular();
		rect1.showAreaInfo();
		rect1.showCircumferenceInfo();
		
		
//		有参数构造函数
		double length = 10;
		double width = 20;
		Rectangular rect2 = new Rectangular(length,width);
		rect2.showAreaInfo();
		rect2.showCircumferenceInfo();
		
//		可以用set类函数修改对象里面的属性，比如长度
		rect2.setLength(1);
		rect2.showAreaInfo();
		rect2.showCircumferenceInfo();
	}
	
	static void  staticVisitExample() {
//		静态数据在对象外的访问格式: 类名.静态数据 
		System.out.println(Rectangular.TAG);
		
//		静态方法在对象外的 访问格式: 类名.方法
		Rectangular.showTag();
	}
	
//	静态变量在每个对象之间是共有的
	static void staticDataExample() {
//		可能会因为之前有过创建对象而有累加，这里先清零
		Rectangular.resetCreateTimes();
		Rectangular rect1 = new Rectangular();
		Rectangular.showHowMayObjectsCreated();
		
		double length = 10;
		double width = 20;
		Rectangular rect2 = new Rectangular(length,width);
		Rectangular.showHowMayObjectsCreated();
		
		
		Rectangular rect3 = new Rectangular();
		Rectangular rect4 = new Rectangular();
		Rectangular rect5 = new Rectangular();
		Rectangular.showHowMayObjectsCreated();
	}
	
	static void visibilityExample() {
		Rectangular rect = new Rectangular(10,20);
		double value =rect.testData;
		rect.getLength();
		rect.getWidth();
		rect.testMethod();
	}
	
//	按引用作为参数
	static void passReferenceExample() {
		Rectangular rectangular = new Rectangular(10, 20);
		rectangular.showAreaInfo();
		doubleDimensionsInRect(rectangular);
		System.out.println("after double width and length: ");
		rectangular.showAreaInfo();
		
	}
	
	static void doubleDimensionsInRect(Rectangular rectangular) {
		if(rectangular == null) {
			return;
		}
		rectangular.setLength(rectangular.getLength()*2);
		rectangular.setWidth(rectangular.getWidth()*2);
	}
	
	static void encapsulationExample() {
		Student student_1 = new Student("ggmm");
		student_1.askQuestion("面向对象中的封装是什么意思");
		
		Stack stack = new Stack(1000);
		stack.push(2);
		stack.pop();
		
	}

}

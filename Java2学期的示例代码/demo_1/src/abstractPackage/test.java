package abstractPackage;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

//import abstractPackage.AAA.GeometricObject;


public class test {

//	public test() {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		AAA aaa = new AAA();
//		AAA.
//		GeometricObject g = new AAA().GeometricObject();
		// TODO Auto-generated method stub
		
//		abstractExample();
//		
//		testError();
		
//		compareToExample();
		
//		cloneExample();
		
//		interfaceReferenceExample();
		
//		Person person = new Person() {
//			
//			@Override
//			void showMyInfo() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
//		Person person = new Person("hanfeng");
		
//		new Student().compareTo(new Student());
		Student student = new Student("aaa", "hangyi");
		int  string=student.ttt_protected;
		  string=student.moren;
//		String string=student.itIsPublicInDefault
		System.out.println(student.toString());
		
	}
	
	static void abstractExample() {
		Person person1 = new Student("学生","杭医");
		person1.showMyInfo();
		Person person2 = new Teacher("老师");
		person2.showMyInfo();
	}
	
	
//	ppt里面的 Number 类 判断例子
	static void testError() {
		Number x = new Integer(3);
//		Double double1 = (Double)x;
		System.out.println(((Integer)x).compareTo(new Integer(4)));
//		System.out.println(x.compareTo(new Integer(4))); //Number 没有实现compareTo接口方法，所以不能调用
	}
	
	static void compareToExample() {
//		int size = 10;
		ArrayList<Student> students = new ArrayList<Student>();
		double[] heights = {1.6,1.62,1.64,1.66,1.8,1.78,1.76,1.74,1.72,1.7};
		double[] weights = {90,150,95,145,100,140,105,135,130,125};
		for (int i = 0; i < 10; i++) {
			Student student = new Student("No. "+(i+1),"杭医");
			student.setHeight(heights[i]);
			student.setWeight(weights[i]);
			students.add(student);
		}
		
		Student [] arraysStudents = students.toArray(new Student[0]);
		
//		下面是2种方式的排序调用，结果是一样的
		sortOnArray(arraysStudents);
		
		sortOnArrayList(students);
		
	}
	

	/**
	 * 
	 * @param students 数组作为参数输入，调用Arrays.sort排序
	 */
	static void sortOnArray(Student[] students) {
		if(students == null) {
			System.out.println("sort on null array");
		}
//		排序之前
		printSdutentsInfo(students);
		
//		注意这个方法，数组排序，默认增序顺序排列。 思考？ 如何逆序
		Arrays.sort(students);
		
//		排序之后
		System.out.println("after sort");
		printSdutentsInfo(students);
		System.out.println();
	}
	
	/**
	 * 
	 * @param students ArrayList作为参数输入，	调用Collections.sort排序
	 */
	static void sortOnArrayList(ArrayList<Student> students) {
		if(students == null) {
			System.out.println("sort on null arraylist");
		}
//		排序之前
		printSdutentsInfoInArrayList(students);
		
//		注意这个方法 ，是List 排序,默认增序顺序排列。思考，如何逆序？
		Collections.sort(students);
		
	
//		排序之后
		System.out.println("after sort");
		printSdutentsInfoInArrayList(students);
		System.out.println();
	}
	
	static void printSdutentsInfo(Student[] students) {
		if(students == null) {
			System.out.println("empty list");
		}
		for (int i = 0; i < students.length; i++) {
			students[i].demoClassInfo();
		}
	}
	
	static void printSdutentsInfoInArrayList(ArrayList<Student> students) {
		if(students == null) {
			System.out.println("empty list");
		}
		for (int i = 0; i < students.size(); i++) {
			students.get(i).demoClassInfo();
		}
	}
	
	
	/**
	 * 不可变类成员不需要在类中去显式地写clone。比如Integer，不需要在
	 * 包含它的类中的clone函数中，写integer = Integer.clone这类。
	 * String类也一样。克隆体不可变类对象引用的改变不会对母体对应的对象产生影响。
	 */
	static void cloneExample() {
		House house = new House();
		try {
			House house2 = (House) house.clone();
//			来证明：克隆体的不可变对象引用改了，母体不受影响
			house2.integer = Integer.valueOf(99);
			System.out.println("house .integer = "+house.integer);
			System.out.println("house2.integer = "+house2.integer);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String aString= new String("hanfeng");
		String aString2= "hanfeng"; //new String("hanfeng")
		

		
		
		
	}
	
	
	/**
	 * 父类引用变量可以指向子类对象，同理
	 * 接口引用变量可以指向 任何implements这个接口的对象
	 * 这个很多时候用在 函数的参数上
	 */
	static void interfaceReferenceExample() {
//		DemoClassInfo demoClassInfo = new Student();
		Student student = new Student();
		Teacher teacher = new Teacher();
//		DemoClassInfo demoClassInfo2 = new Teacher(); // 这就不可以
		
		
		
		method(student);
//		method(teacher); //出错
		
//		多态的例子，父类引用变量指向子类对象
		Person  person = new Student();
		person.showMyInfo();
		
//		多态的例子2.子类对象可以作为实参传入 父类形参的方法
		ppp(student);
		ppp(teacher);
		
	}
	
	static void ppp(Person person) {
		
	}
	
	
	/**
	 * 参数 是一个接口类型，可以把任何implements了demoClassInfo的类对象传入，
	 * 接口的使用在面向对象中有 “解耦" 作用，方便扩展，减少关联度。在《设计模式》中
	 * 会提及。但设计模式是一门
	 * @param demoClassInfo
	 */
	static void method(DemoClassInfo demoClassInfo) {
		demoClassInfo.demoClassInfo();
	}
	


}

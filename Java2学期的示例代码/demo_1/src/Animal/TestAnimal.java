package Animal;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Scanner;

import abstractPackage.Student;

public class TestAnimal {

	public TestAnimal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
//		polymorphismExample();
		
//		instanceofExample();
		transform(64);
		
		Student student = new Student();
//		student.

	}
	
	/**
	 * 多态例子
	 */
	static void polymorphismExample() {
		Animal baseAnimal = new Animal();
		baseAnimal.makeSound();
		
//		父类引用变量指向子类 Cat，所以在调用方法的时候，优先看子类是否
//		重新实现了父类的方法，如果有，就用子类的实现方式，如果没有，就
//		默认调用父类的。 这就是书中说的 ”动态绑定“：根据应用变量实际指向的
//		类别选择具体选择父类的还是子类的实现。
		Animal animalCat = new Cat("kitty","折耳猫");
		animalCat.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();
		
//		父类引用变量指向子类 Dog
		Animal animalDog = new Dog("刀哥","苏格兰牧羊犬");
		animalDog.makeSound();
		
	}
	
	/**
	 * 类型转换 以及 instance of 的例子 
	 */
	static public void instanceofExample() {
		Animal animal = new Cat();
//		animal虽然是父类Animal变量引用，但指向的是子类Cat
		showAnimalBehavior(animal);
//		animal虽然是父类Animal变量引用，但指向的是子类Dog
		animal = new Dog();
		showAnimalBehavior(animal);
	}

	/**
	 * 
	 * @param animal 以 父类作为参数类型，可以扩大可传入的参数
	 * 比如这里是Animal类型，用户可以传入其子类，比如Cat,Dog
	 * 若里面需要特殊处理某子类的情况，则需要instanceof来判断这个
	 * ”粗略的“Animal 对象是哪个 ”细分的子类“对象，毕竟，Cat,Dog...
	 * 都是Animal。
	 */
	static public void showAnimalBehavior(Animal animal) {
		animal.makeSound();
		if(animal instanceof Dog) {
//			如果在把Animal 转换为 Dog对象之前不进行判断会存在如下问题
//			1.强制换行可能会失败，程序会崩
//			2. 即使强制转换成功，但如果animal不是Dog对象，也就不能调用Dog类
//			特有的方法。
			Dog dog = (Dog)animal;
			dog.watchDoor();
		}else if(animal instanceof Cat) {
			Cat cat = (Cat)animal;
			cat.jumpFromHighAndSurvive();
		}
//		根据其他animal类型可以扩展
		
	}
	
	static void transform(int number) {
		int upBoundary = 512;
//		1. 开头的边界条件判断
		if(number <0 || number >upBoundary-1) {
			System.out.println("out of range");
			return;
		}
//		2. 转换为二进制
		int arraySize =(int) log2(upBoundary);
		int []binaryForm = new int[arraySize];
		for (int i = 0; i < binaryForm.length; i++) {
			binaryForm[i]=0;
		}
//	    以防number被改变，影响后面的使用，用一个拷贝数据进行操作
//		3. 十进制转换为二进制
		int innerNumber= number;
		int index = arraySize-1;
		while(innerNumber >0) {
			binaryForm[index--] = innerNumber%2;
			innerNumber/=2;
		}
//		4. 一维二进制转换为二维二进制
		char [][]result = new char[3][3];
		for (int i = 0; i < binaryForm.length; i++) {
			int row = i/3;
			int column = i%3;
			result[row][column] = binaryForm[i] ==1?'H':'T';
		}
//		5.输出结果
		for(int row =0;row<3;++row) {
			for (int col = 0; col < 3; col++) {
				System.out.print(result[row][col]+" ");
			}
			System.out.println();
		}
	}
	
	public static  double log2(double N) {
		return Math.log(N)/Math.log(2); //Math.log的底为e
	}
}

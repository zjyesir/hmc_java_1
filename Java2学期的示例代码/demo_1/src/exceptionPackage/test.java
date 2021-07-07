package exceptionPackage;

import java.io.IOException;
import java.util.Scanner;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try catch简单的例子
		exceptionTryAndCatchExample();
		
//		Java强迫程序员处理必检异常。如果方法声明了一个异常，就必须采用如下2种之一
//		1. 在 try catch 块中调用它，
//		2. 在调用方法中声明要抛出异常。 
//		对于p2有异常抛出，那么调用它的p1也要处理这个异常
		p1();

//		看异常出错信息的例子，要用给与的错误信息定位出错再哪里，然后改掉
//		outOfBoundaryException();
		
	}
	
	
	/**
	 * 输入一个字符串，如果不符合整数格式，那么抛出异常
	 */
	static void exceptionTryAndCatchExample() {
		Scanner scanner = new Scanner(System.in);
		String praString = scanner.next();
		try {
			int value = Integer.valueOf(praString);
			System.out.println("the value is "+value);
		} catch (Exception e) {
			System.out.println("the string you input is not in valid format");
		}
		scanner.close();
		
	}
	
	//如果不加 try catch,当你输入一个无法转换为int的字符串，会报异常
	static void exceptionTryAndCatchExample2() {
		Scanner scanner = new Scanner(System.in);
		String praString = scanner.next();
//		try 
		{
			int value = Integer.valueOf(praString);
			System.out.println("the value is "+value);
		} 
//		catch (Exception e) {
//			System.out.println("the string you input is not in valid format");
//		}
		scanner.close();
	}
	
	
	static void p1() {
//		下面故意这么写，但编辑器会提示你错误，你可以根据提示做处理
//		1. 用 try{} catch 块围起来
//		2. p1 抛出一个异常。p11方法体现了这种用法
		try {
			p2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			处理
		}

	}
	
	
	static void p11() throws IOException {
//		下面故意这么写，但编辑器会提示你错误，你可以根据提示做处理
//		1. 用 try{} catch 块围起来
//		2. p1 抛出一个异常
		p2(); // 如果不加 try，是
	}
	
//	static void p2() throws IOException{
//		try {
//			Scanner scanner = new Scanner(System.in); // 语句1
//			String praString = scanner.next(); //语句 2
//		} catch (Exception e) {
//			// handle exception 语句3
//		}finally {
//			// 无论是否有异常,都会执行到这里，可以理解为 正常执行和异常执行之后的交汇点
//		}
//	}
	
//	 使用scanner可能会产生异常，但如果有异常，此方法只负责抛出异常，即甩锅
	static void p2() throws IOException {
		Scanner scanner = new Scanner(System.in); // 语句1
		String praString = scanner.next(); // 语句
		scanner.close();
	}

	
//	finally 句式格式
	static void f() throws IOException{
		try {
			// 语句1 可能抛出异常的句子
			// 语句 2
		} catch (Exception e) {
			// 语句3
		}finally {
			// 语句4
		}
			// 语句5		
	}
	
	static void  outOfBoundaryException() {
		int []a = {1,2,3,4,5};
		for (int i = 0; i < a.length+1; i++) {
			System.out.println(""+a[i]);
		}
	}
	
	//再次抛出一个异常
	static void reThrow() throws IOException {
		try {

		} catch (Exception e) {
//			做一些其他处理，然后再抛出一个新的异常
//			1. 卧草，接这个锅我后悔了，还是抛回去，让调用者处理吧。
//			2. 重新包装一个异常，增加一些信息，再抛出，异常转换作用
			throw new IOException("data error : " + e.getMessage());
		}
	}
	
	
//	static void divide(int a,int b) {
//		Integer
//	}

}

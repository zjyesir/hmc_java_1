package example;

import java.util.Scanner;

//import java.util.Scanner;

/**
 * 
 * @author ianye
 *  第一章，第二章，概论和基础的 代码
 */

// 一个标准的 java 程序由 以下组成
//	1.所属包(package)。
//	2.引用(import ...) 
//	3.类(如下Chapter2Example)，
//	4.main函数
//	5.可能需要的子函数

public class Chapter2Example {

//
	public static void main(String[] args) {
		
//	  error
//		int a=b=c=20;
		String name = 1+"hhhhh"+2;
		System.out.println(name);
		
//		correct
		int aa,bb,cc;
		aa = bb = cc =20;
		
		
		
//		addTwoInts();
		//类型转换例子
		// 拓宽类型
//		widenType();
		//缩窄类型
		narrowType();
		int bbb;
	}
	
	
//	scanner 例子分别输入2个整数，然后返回两个数之和
	static void addTwoInts() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("input integer");
        int valueOne = scanner.nextInt();
        System.out.println("input integer");
        int valueTwo  = scanner.nextInt();
        System.out.println(" "+valueOne +" + "+valueTwo+ " = "+(valueOne+valueTwo));
		scanner.close();
	}
	
	static void widenType() {
		int a1 = 5;
		double b1 = a1;
		System.out.println(b1);
	}
	
	static void narrowType() {
		double b2= 3.45678;
		//若把 (int) 去掉，会提示错误，
		int a2 =(int)b2;
		System.out.print(a2);
	}
	

}

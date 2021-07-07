package example;

import java.util.Scanner;

/**
 * 
 * @author ianye
 * 第3章 选择，条件判断章节 if else switch...
 */
public class IfElseSwitchExample {

	public static void main(String[] args) {
		
//		ifElseExample();
//		
		switchExample();
	
//		if易错 之 判断两个浮点数相等
//		errorExample1();
	
////		条件表达式的例子 boolean?expressionOne:expressionTwo;
//		tripleExpression();
//		
////		操作符 ||  && 的例子
//		leapYear();
//		
////		operatorPriority
//		operatorPriority();
		
	}
	
	static void ifElseExample() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入学生成绩");
		int score = scanner.nextInt();
//		第一种 嵌套写法
		if (score > 90) {
			System.out.println("A");
		} else if (score > 75) {
			System.out.println("B");
		} else if (score > 60) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}

//		第二种嵌套写法
		if (score > 90) {
			System.out.println("A");
		} else {
			if (score > 75) {
				System.out.println("B");
			} else {
				if (score > 60) {
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			}
		}
		scanner.close();
	}
	
	/**
	 * switch 适合 离散的数值判断，而不是连续的数值判断，
	 * 比如上面这个例子，如果还要写成switch，程序员的领导看到就要骂娘了，辞职信要写起来了
	 * switch适合 如下例子， 用 0表示女性，1表示男性,其他表示”其他“ 你懂的
	 * */
	static void switchExample() {
		
//		10-20 // 10.000000000000..1 - 19.999999..9
//		10-20 之间的整数 // 10,11,12,
		System.out.println("输入性别，0表示女性，1表示男性,其他用非0，1数字");
		Scanner scanner = new Scanner(System.in);
		int gender= scanner.nextInt();
		switch (gender) {
		case 0: System.out.println("female");break;
		case 1: System.out.println("male"); break;
		default: System.out.println("others"); break;
		}
	}
	
	/**
	 * 条件表达式的例子 boolean?expressionOne:expressionTwo;
	 */
	static void tripleExpression() {
		int aa=9;
		int bb=10;
		
//		下面2个是同个
//		int max = (aa>bb)?aa:bb;
//		
//		int min = ((a+b*c)>(d-8%5))? aa:bb;
//		
//		if(aa>bb) {
//			max = aa;
//		}else {
//			max =bb;
//		}
	}
	
	/**
	 * 操作符 ||  && 的例子 闰年的判断
	 * 如果某年可以被 4 整除而不能被 100 整除，或者可以被 400 整除，那么这一年就是闰年。
	 */
	static void leapYear() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("intput year:");
		int year = scanner.nextInt();
		boolean isLeapYear = ((year%4 == 0) && (year%100 != 0)) || (year%400 == 0);
		System.out.println(isLeapYear?"闰年":"不是闰年");
		scanner.close();
	}
	
	/**
	 * 操作符 优先级的例子
	 * 操作符优先级不用记，最好的方法是加括号。
	 */
	static void operatorPriority() {
		int aaa = 8;
		int bbb = 9;
//		我的本意是 ++aaa, 然后 bbb++, 然后两者相乘。
		int xyz= ++aaa*bbb++;
		System.out.println("xyz = "+xyz);
		int xyz2 = (++aaa)*(bbb++);
	}
	
	/**
	 * if易错 之 判断两个浮点数相等
	 */
	static void errorExample1() {
		double a = 1.0 - 0.1-0.1-0.1-0.1-0.1;
		System.out.println(a);
		//错误的比较会获得不可预期的结果
		System.out.println(a == 0.5?"equal":"not equal");
		//正确的做法
		double DIFF = 1E-5; //1的10的-5次方
		System.out.println(Math.abs(a - 0.5)<DIFF?"equal":"not equal");

	}

	static void errorExample2() {
		
	}

	static void errorExample3() {

	}
	
	

}

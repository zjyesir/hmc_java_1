/**
 * 
 */
package example;

import java.util.Stack;

/**
 * @author ianye
 *
 *二维数组 声明，赋值，访问，作为参数传递等例子
 */
public class TwoDimensionArrayExample {

	/**
	 * 
	 */
	public TwoDimensionArrayExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		simpleUsage();
		
//		newArrayDiffBetweenCandJava();
		arrayAsPrameter();

	}
	
//	二维数组的 定义，赋值，和操作方式
	static void simpleUsage() {
		// 第一种赋值方式，声明后再赋值
		int[][] array = new int[27][5];
		for (int dimOne = 0; dimOne < 27; dimOne++) {
			for (int dimTwo = 0; dimTwo < 5; dimTwo++) {
				array[dimOne][dimTwo] = 100; // 最简单的赋值
			}
		}
//		第二种方式：直接初始化赋值
		int[][] array2 = {   {11,12,13,14,15}   ,{21,22,23,24,25}   ,{31,32,33,34,35}    };

//		https://blog.csdn.net/qq_42606750/article/details/82832985
//		c语言和java在定义二维数组上 不一样，c可以省略行数，但java可以省略列数
//		int array3[][] = {{1,2,3,4,5},{1,2,3,4,5};
//		获取每一行的大小
		System.out.println("the length of first line in array is: "+array[9].length);

	}
	
	/**
	 * c语言每一列的数量必须在定义的时候确定，所以可以省略行数，但不能省略列数，C语言的数组无论维数是多少，他们每一维的内存大小都一样
	 * Java的多维数组其实是每高维存着指向低维度数据的引用(类指针)，即他们下一个数组是独立的，可以独立分配内存大小。
	 */
	static void newArrayDiffBetweenCandJava() {
		// java 中 这种定义是可以的
		int a[][] = new int[2][];
		a[0] = new int[6];
		a[1] = new int[3];
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);

		// java中这种定义会报错
//		 int a[][]=new int [][2];
	}
	
//	二维数组作为函数参数的例子
	static void arrayAsPrameter() {
		int [][]array = {{1,2,3,4,5},{11,12,13,14,15,16,17},{21,22}};
		negativeArray(array);
	}
	
	static void negativeArray(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = -1*a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	static int[][] getArray(){
		return new int[][] {{1,2},{3,4,5,6}};
	}

	

}

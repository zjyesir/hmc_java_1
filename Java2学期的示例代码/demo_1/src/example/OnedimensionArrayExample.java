/**
 * 
 */
package example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ianye
 *
 */
public class OnedimensionArrayExample {

	/**
	 * 
	 */
	public OnedimensionArrayExample() {
		// TODO Auto-generated constructor stub
		
//		int cards[4][13]= { { 梅花 A-}, {},{},{}}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		arrayCopyExample();
		
//		数组作为参数传入
//		arrayAsMethodParamterExample();
		
//		以数组作为返回值
//		returnArrayExample();
		
//		可变长参数函数 用数组作为参数
//		passInArrayToVarLengthMethod();
		
//		二分查找
//		binarySearchExample();
		
//		Arrays 工具类介绍
		arraysPackageExample();
	}
	
	private static void arrayCopyExample() {
		int intArray[] = {1,2,3,4,5,6,7,8,9,10};
		int intArrayTwo[] =  new int[intArray.length];
//		int intArrayTwo[] = {100,200,300,400,500,600,700,800,900,1000};
//		只是简单地赋值，第二个数组会指向第一个数组的位置
		intArrayTwo = intArray;
		
		printArray(intArrayTwo);
		System.out.println();
		
//		验证intArrayTwo和intArray是指向同一个对象，就看其中一个改变，是否能引起其他
//		一个也同时改变
		intArrayTwo[3] = -111;
		System.out.print("验证是 intArray 和 intArrayTwo 是否否指向同个：  ");
		
		printArray(intArray);
		System.out.println();
		
//		用 arraycopy函数拷贝
		int intArrayThree[] = new int[intArray.length];
		System.arraycopy(intArray, 0, intArrayThree, 0, intArray.length);
		System.out.print("用 System 包中的arraycopy 拷贝后的结果：  ");
		
		printArray(intArrayThree);		
		
	}
	
//	数组作为函数参数，1.按值传递；2.按引用传递
	private static void arrayAsMethodParamterExample() {
//		 pass by value
//		method(new int[] {1,2,3,4,5});
//		pass by reference
		int array[]= {10,20,30,40,50};
		method(array);
		printArray(array);
		
	}
	
	private static void method(int array[]) {
//		判空
		if(array == null || array.length == 0) {
			return;
		}
		for (int i = 0; i < array.length; i++) {
			array[i]*= -1;
		}
//		printArray(array);
	}
	
	//返回数组的例子
	private static void returnArrayExample() {
		int result[] = getArray();
		printArray(result);
		
	}
	private static  int []getArray() {
		int result[] = new int[5];
		for (int i = 0; i < result.length; i++) {
			result[i] = i;
		}
		return result;
	}
	
//  可变长函数，可以用数组作为参数传入
	static void passInArrayToVarLengthMethod() {
		int array [] = {10,20,30,40,50};
		varLengthMethod(array);
	}
	static void varLengthMethod(int...values) {
		if(values.length == 0) {
			System.out.println("no argument passed in");
		}
		System.out.println();
		for (int i = 0; i < values.length; i++) {
			System.out.print(" "+values[i]);
		}
	}
	
	static void binarySearchExample() {
		int TEST_NUMBER = 100;
		int testArray[] = new int[TEST_NUMBER];
		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = i+1;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println(" please input number from 1 to 100");
//		int array[] = {5,15,25,35,45,65,75,85,95};
		int target = scanner.nextInt();
		scanner.close();
		int searchCount = binarySearch(testArray, target);
		if(searchCount == -1) {
			System.out.println("not found "+target+ " in this array");
		}else {
			System.out.println("It takes "+searchCount+" loop time to find "+target);
		}
	}
	
	/**
	 * 
	 * @param array
	 * @param target
	 * @return -1 表示没有找到；否则表示查找需要花费的次数
	 */
	static int binarySearch(int []array, int target) {
		if(array == null ||array.length == 0) {
			System.out.println("the array is empty!");
		}
		int lowPosition = 0;
		int highPosition = array.length-1;
		int count =0;
		while(lowPosition < highPosition) {
			int middlePosition = (lowPosition+highPosition)/2;
			count ++;
			int middleValue = array[middlePosition];
			if(middleValue == target) {
				return count;
			}else if (middleValue < target) {
				lowPosition = middlePosition+1;
			}else {
				highPosition = middlePosition-1;
			}
		}
		return -1;
	}
	
	/**
	 * Arrays.类函数有很多，均是对数组的一些处理，比较。大家自己再去探索。
	 */
	static void arraysPackageExample() {
		int array[] = {1,3,5,7,9,8,6,4,2,0};
		Arrays.sort(array);
		printArray(array);
//		System.out.println(" find 5 in index: "+Arrays.binarySearch(array, 5));
	}
	
	private static void printArray(int array[]) {
		if(array == null ) {
			return;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

}

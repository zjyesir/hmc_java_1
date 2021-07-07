package example;

import java.util.ArrayList;



/**
 * 
 * @author ianye
 *  作为方法 的例子代码
 */

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=add(1,2);
		
		int a=10; 
		int b=2;
		swap(a,b);
//		ArrayList<Integer> list
//	 print a,b
	}
	
//	简单的方法
	static int add(int a,int b) {
		return a+b;
	}
	
	static void swap(int a,int b) {
		int temp;
		temp = a;
		a=b;
		b=temp;

	}
	
//	按 值 传入参数例子
	
//	按 引用 传入参数例子，同上，用 ArrayList 类
//	void dealWith(ArrayList<Integer> list) {
//		if(list == null || list.isEmpty()) {
//			return;
//		}
//		list.add(100);
//	}

}

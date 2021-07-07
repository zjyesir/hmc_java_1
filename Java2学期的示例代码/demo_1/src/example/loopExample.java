package example;

/**
 * 
 * @author ianye
 * 第5章 循环语句
 */
// 循环语句的例子  包括  
//while 
//do while 
// for 额外介绍foreach 用法
public class loopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []array = {"杭州","宁波","温州","绍兴","嘉兴","湖州","台州","金华","衢州","丽水","舟山"};
//		foreach的用法 和for的写法不一样哦，
		
//		for（元素类型 变量：数组）{}
		for (String str : array) {
			System.out.println(str);
		}
		
		for (int i = 0; i < array.length; i++) {
//			String string = array[i];
			System.out.println(array[i]);
			
		}

	}

}

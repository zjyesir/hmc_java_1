
package genericity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;




public class test {

	public test() {
//		Entry<K, V>是接口，不能new
//		类似于++中 stl::pair
//		参考 https://stackoverflow.com/questions/3110547/java-how-to-create-new-entry-key-value
//		SimpleEntry<Integer, Integer> aEntry = new SimpleEntry<Integer, Integer>(1,2);

	}
	
	public static void main(String[] args) {

//		泛型类(元组)例子
//		tupleExample();
		
//		泛型方法例子
//		genericityMethod();
		
//		Arrays方法类例子
//		arraysExample();
		
//		collections方法类例子
//		collectionsExample();
		
//		list容器
//		listExample();
		
//		arryList例子
//		arrayListIteratorExample();
		
//		栈容器
//		stackExample();
		
//		集合容器
//		setExample();
		
//		映射容器
		mapExample();
	}
	
	/**
	 * 泛型类--元组例子
	 */
	static void tupleExample() {
		Tuple4<Integer, String, Character, String> studentInfoTuple4 = 
				new Tuple4<Integer, String, Character, String>(33, "帅哥", 'M', "2001/1/1");
		
		System.out.println(studentInfoTuple4.toString());
	}
	
	/**
	 * 泛型方法例子
	 */
	static void genericityMethod(){
		int index1 = 0;
		int index2 = 4;
		
//		int类型
		Integer []intArray = {1,2,3,4,5};
		swap(intArray, index1, index2);
		System.out.println("after swap");
		print(intArray);
		
		
//		double 类型
		Double []doubleArray= {1.1,2.2,3.3,4.4,5.5};
		swap(doubleArray, index1, index2);
		System.out.println("after swap");
		print(doubleArray);
		
	}
	
	/**
	 * 调整数组arr中，下标a，和下标b两个元素的数值
	 * @param <T>
	 * @param arr 所属数组
	 * @param a 要换的元素1的下标
	 * @param b 要换的元素2的下标
	 */
	static <T> void swap(T[] arr,int a,int b){
//		按道理这里应该处理a,b是否超过arr数组长度，我为了简便省略了，
//		但不代表你以后可以这么写
		T temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	static <T> void findTheMaxAndMin(T[] arr) {
		if(arr == null||arr.length<1) {
			
		}
		T max = arr[0];
		T min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]> max) {
				max = arr[i];
			}else if(arr[i]< min) {
				
			}
		}
	}
	
	/**
	 * 打印数组中每个元素
	 * @param <T>
	 * @param arr
	 */
	static <T> void print(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].toString()+" ");
		}
		System.out.println();
	}
	
	
	static void arraysExample() {
		int[] array = {10,20,30,40,50,60,70,80,90,100};
//		打印数组正确方式
		System.out.println(Arrays.toString(array));
//		打印数组错误方式
		System.out.println(array);
		System.out.println("50 在下标: "+Arrays.binarySearch(array, 50));
	}
	
	static void collectionsExample() {
	
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i <10; i++) {
			array.add(new Integer(i+1));
		}
		System.out.println("逆序前");
		System.out.println(array);
		Collections.reverse(array);
		System.out.println("逆序后");
		System.out.println(array);
		
		/* 集合打印，又一个容器打印的例子
		Set<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		System.out.println(set);
		*/
	}
	
	static void listExample() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
//		List<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 0; i <10; i++) {
			linkedList.add(new Integer(i+1));
		}
		System.out.println(linkedList);
//		1. list添加元素
		linkedList.add(99); //注意，99会被自动装箱成 Integer
		linkedList.add(3, 88 );// 在3下标插入数值88
//		2. 删除，注意 当元素是整数的时候，下面2个是有区别的
		linkedList.remove(3);// 删除下标为3的元素
		linkedList.remove(new Integer(10));// 删除 数值为10的元素
//		3. 包含关系
		System.out.println(linkedList.contains(10));
		System.out.println(linkedList.contains(100));
//		4. 查找
		linkedList.indexOf(7);
//		其他方法请自己查询
	}
	
//	用while +显示使用iterator
	static void arrayListIteratorExample() {
		ArrayList<Integer> array = new ArrayList<Integer>();
//		注意下面这样的写法也是正确的，正如我们之前说过的，父类引用变量可以指向子类对象
//		ArrayList是List的子类，同理，之后介绍的容器中，也是这么用
		List<Integer> array2 = new ArrayList<Integer>();
		for (int i = 0; i <10; i++) {
			array.add(Integer.valueOf(i+1));
		}
//		显示使用iterator
		Iterator<Integer> iterator = array.iterator();
		while(iterator.hasNext()) {
			Integer valueInteger = iterator.next();
			System.out.println(valueInteger);
		}
	}
	
//	用for each 隐式使用iterator
	static void arrayListIteratorExampleByForEach() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i <10; i++) {
			array.add(Integer.valueOf(i+1));
		}
//		for each 里面隐式调用了array 的iterator()
		for (Integer integer : array) {
			System.out.println(integer);
		}
	}
	
	static void stackExample() {
		Stack<String> myStack = new Stack<String>();
		myStack.push("111");
		String topElementString = myStack.peek();
		myStack.pop();
		System.out.println(myStack);
	}
	
	/**
	 * set 用的最多的是 contains 这个功能，set里面每个元素具有唯一性
	 */
	static void setExample() {
//		参考 List<Integer> array2 = new ArrayList<Integer>();的写法解释
		Set<String> set = new HashSet<String>();
		set.add("聪明");
		set.add("漂亮");
		set.add("健康");
		set.add("善良");
		set.add("乐观");
		set.add("富有");
		String str = "高兴";
		System.out.println(set.contains(str));
		str= "健康";
		System.out.println(set.contains(str));
		
	}
	
	static void mapExample() {
//		参考 List<Integer> array2 = new ArrayList<Integer>();的写法解释
		Map<String, Integer> tennisGrandSlam = new HashMap<String, Integer>();
		tennisGrandSlam.put("桑普拉斯", 14);
		tennisGrandSlam.put("阿加西", 8);
		tennisGrandSlam.put("费德勒", 20);
		tennisGrandSlam.put("纳达尔", 19);
		tennisGrandSlam.put("德约科维奇", 17);
		tennisGrandSlam.put("穆雷", 3);
		
		if(tennisGrandSlam.containsKey("费德勒")) {
			System.out.println("费德勒有 "+tennisGrandSlam.get("费德勒")+"个大满贯");
		}
//		当这个map里面没有这个 key-> value 映射，会返回null
//		但有时也会抛异常，所以在获取value之前，判断这个key是否包含在map里是一种好习惯
		System.out.println("罗迪克有 "+tennisGrandSlam.get("罗迪克")+"个大满贯");
	}
	
	void iteratorExample() {
		
		//list
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 0; i <10; i++) {
			linkedList.add(new Integer(i+1));
		}
		Iterator<Integer> listIterator = linkedList.iterator();
		while (listIterator.hasNext()) {
			Integer i = listIterator.next();
			System.out.print(i.intValue());
		}
	
		//stack
		Stack<String> myStack = new Stack<String>();
		myStack.push("stack 111");
		myStack.push("stack 222");
		Iterator<String> stackIterator = myStack.iterator();
		while (stackIterator.hasNext()) {
			String i = stackIterator.next();
			System.out.print(i);
		}
		
		//set
		Set<String> set = new HashSet<String>();
		set.add("set 聪明");
		set.add("set 漂亮");
		set.add("set 健康");
		
		Iterator<String> setIterator = set.iterator();
		while (setIterator.hasNext()) {
			String i = stackIterator.next();
			System.out.print(i);
		}
		
//		map
		Map<String, String> tennisGrandSlam = new HashMap<String, String>();
		tennisGrandSlam.put("费德勒", "map 20");
		tennisGrandSlam.put("map纳达尔", "map 19");
		tennisGrandSlam.put("map德约科维奇", "map 17");
		Entry<String,String> mapIterator = (Entry<String, String>) tennisGrandSlam.entrySet();
		while (setIterator.hasNext()) {
			String i = stackIterator.next();
			System.out.print(i);
		}
		
	}
	
	/* 顺序查找，a为数组，n为要查找的数组长度，
	   key为要查找的关键字 */
	int Sequential_Search(int[] a, int n, int key)
	{
	    for (int i = 0; i < n; i++)
	    {
	        if (a[i] == key)
	            return i;
	    }
	    return -1;
	}

	/* 有哨兵顺序查找 */
	int Sequential_Search2(int[] a, int n, int key)
	{
	    int i;
	    /* 设置a[0]为关键字值，我们称之为“哨兵” 设置哨兵前，
	     * 先判断这个位置原来的数值是否满足条件*/
	    if (a[0] == key) {
			return  0;
		}
	    a[0] = key;    
	    /* 循环从数组尾部开始 */
	    i = n;         
	    while (a[i] != key)
	    {
	        i--;
	    }
	    /* 返回-1则说明查找失败 */
	    if(i ==0) {
	    	return -1;
	    }
	    return i;      
	}

	
	
}

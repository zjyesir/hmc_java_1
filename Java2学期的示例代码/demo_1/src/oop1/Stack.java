package oop1;

public class Stack {
	
//	
	private final int  DEFAULT_MAX_SIZE = 100;
	private final int ERROR_VALUE = Integer.MAX_VALUE;
	private int userSetMaxSize = DEFAULT_MAX_SIZE;
	private int[] array;
	private int top = -1;

//	无参数构造函数
	public Stack() {
		// TODO Auto-generated constructor stub
		//初始化 类似于createStack()
		array = new int[DEFAULT_MAX_SIZE];
	}
	
//	可以自己定义栈大小的 带参数构造函数
	public Stack(int maxSize) {
		this.userSetMaxSize = maxSize;
		array = new int[userSetMaxSize];
	}
	
	/**
	 * 压栈操作
	 * @param 将value压入栈中 
	 */
	public void push(int value) {
		this.top++;
	}
	
	/**
	 * 出栈操作
	 * @return 弹出栈顶元素，并把这个数值返回
	 */
	public int pop() {
		return 0;
	}
	
	/**
	 * 
	 * @return  查看栈顶的元素数值，但不弹出
	 */
	public int peek() {
		if (top > -1) {
			return array[0];
		}
		return ERROR_VALUE;
	}
	
	/**
	 * 
	 * @return 返回一个栈现有元素个数
	 */
	public int getSize() {
		return top;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(2);
		stack.pop();
	}

}

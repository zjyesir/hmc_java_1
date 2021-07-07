package genericity;

import java.util.Iterator;
import java.util.HashMap.HashIterator;

public class MyStack implements ShowInfo<MyStack> ,Iterable<Food>{

	final int  MAX_SIZE = 100;
	Food[] array = new Food[MAX_SIZE];
	
	public MyStack() {
		// TODO Auto-generated constructor stub
	}
	
	void push(Food value) {
//		Pair<Integer, String> pair = new Pair<Integer, String>(1, "yixin");
	
//		Entry<Integer, String> entry = new Entry<Integer, String>();
//		Pair<Integer, String> pair = new com.sun.tools.javac.util.Pair<A, B>(fst, snd)
//		Pair<Integer, Integer> pair = new Pair<T, U>(first, second)
//		Tup
	}
	
	Food pop() {
		return new Food();
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public void show(MyStack t) {
		// 这这里实行MyStack所需的功能
		
	}

	@Override
	public Iterator<Food> iterator() {
		// TODO Auto-generated method stub
//		return iterator()
		return null;
	}
	
	class MyIterator implements Iterator<Food> {

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Food next() {
			// TODO Auto-generated method stub
			return null;
		}
	}

}

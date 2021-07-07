package myUtils;

public class myTools {
	public myTools() {
		// TODO Auto-generated constructor stub
	}
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static void printArray(int array[]) {
		if(array == null ) {
			return;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

}

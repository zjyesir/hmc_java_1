package abstractPackage;

import java.util.ArrayList;

public class Student  extends Person implements DemoClassInfo,Comparable<Student>,Cloneable{
	private String mySchool;
	
	
	
	
	
	protected int ttt_protected;
	private int t_Private;
	
	int moren;
	String aaa;
	
	private String ID;
	private ArrayList<Integer> scores = new ArrayList<Integer>();
	private double DIFF = 1e-6;
	private final int COMPARE_BASED_ON_WEIGHT = 0;
	private final int COMPARE_BASED_ON_HEIGHT = 1;
//	根据这个来决定是以什么标准比较
//	private int compareChoice = COMPARE_BASED_ON_WEIGHT;
	private int compareChoice = COMPARE_BASED_ON_HEIGHT;
	

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name,String scString) {
		super(name);
		this.mySchool = scString;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student Name:"+this.name+" ID: "+this.ID+" height = "+this.height+" weight = "+this.weight;
	}

	
	public static void main(String[] args) {
		Student student = new Student("aaa", "hangyi");
		System.out.println(student.toString());
		
	}

//	@Override
//	void showMyInfo() {
//		// TODO Auto-generated method stub
//		System.out.println("I am a student , my name is: "+name);
//	}
	
//	/**
//	 * 为方便显示排序结果，根据判断标准，只输出判断标准数据
//	 */
	@Override
	public void demoClassInfo() {
		// TODO Auto-generated method stub
		if (compareChoice == COMPARE_BASED_ON_WEIGHT) {
			System.out.println(name + " weight: = "+ weight);
		}else if (compareChoice == COMPARE_BASED_ON_HEIGHT) {
			System.out.println(name + " height: = " + height);
		}
	}

	/**
	 * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     *  this < 小于 o(注意不是0，是英文字母o) :返回 -1；
     *  this ==  o:   返回 0；
     *  this > o:     返回 1.
     *  比较的逻辑由我们自己定义，compareTo 常用于对对象的排序，因为要排序，你要定义你的 大于，小于，等于关系
     *  对于基本数据， int ,double,等都是自带大小关系，但是一个自定义的类，你要自己定义你的大小，等于关系。
     *  这里，我假设
	 */
	@Override
	public int compareTo(Student o) {
		if(compareChoice == COMPARE_BASED_ON_WEIGHT) {
			return compareBasedOnWeight(o);
		}else if (compareChoice == COMPARE_BASED_ON_HEIGHT) {
			return compareBasedOnHeight(o);
		}else {
//			默认以ID为判断标准
			return ID.compareTo(o.ID);
		}
	}
	
	/**
	 * 以身高标准进行判断Student大小关系
	 * @param o
	 * @return 和 coompareTo返回标准一样
	 */
	private int compareBasedOnHeight(Student o) {
//		如果比较对象o是null，则返回 当前对象 > o
		if(o == null) {
			return -1;
		}
		double diff = this.height - o.height;
		if(Math.abs(diff) <= DIFF) {
			return 0;
		}
		return (this.height > o.height)? 1:-1;
	}
	
	/**
	 * 
	 * @param o
	 * @return 以体重标准进行判断Student大小关系
	 */
	private int  compareBasedOnWeight(Student o) {
//		如果比较对象o是null，则返回 当前对象 > o
		if(o == null) {
			return -1;
		}
		double diff = this.weight - o.weight;
		if(Math.abs(diff) <= DIFF) {
			return 0;
		}
		return (this.weight >o.weight)? 1:-1;
	}
	
//	你可以重新clone方法，
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	void showMyInfo() {
		// TODO Auto-generated method stub
		
	}



//	@Override
//	void showMyInfo() {
//		// TODO Auto-generated method stub
//		
//	}
	

}
 class AAA{
	
}

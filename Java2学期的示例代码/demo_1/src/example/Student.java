package example;

import java.util.Scanner;

import oop1.Rectangular;


/**
 * 
 * @author ianye
 *
 */
//           类名
public class Student {

//	            属性
	private int age;
    private String name;
    private String homeTown;
//    没有参数的构造函数，在new Student()的时候使用
    public Student() {
//		Rectangular rectangular = new Rectangular();
	}
//   创建对象的时候，Student s1 = new Student( 20, "Sir","Hangzhou");
    public  Student(int pAge,String pName,String pHomString) {
    	this.age = pAge;
    	this.name = pName;
    	this.homeTown = pHomString;
    }
  
//              行为
    public void showInfo(){
        System.out.println(" name "+name+" age = "+age+" hometown: "+homeTown);
    }
    
    /**
     * 
     * @param homeWork
     */
    public void doHomeWork(String homeWork) {
//    	
		
	}
    
    public void  takeExam() {
		
	}
    
    public void init(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input student's name in string format");
        name = scanner.next();
        System.out.println("input student's homeTown in string format");
        homeTown = scanner.next();
        System.out.println("input student's age in int format");
        age = scanner.nextInt();
        // scanner.close();
    }
    
    public static void main(String[] args) {
//    	测试包间的可见性
		Rectangular rectangular = new Rectangular();
	}

}

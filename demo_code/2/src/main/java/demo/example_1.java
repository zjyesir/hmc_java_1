package src.main.java.demo;

import java.util.ArrayList;
import java.util.Scanner;
// import src.main.java.demo.myUtils;

/**
 * example_1
 */
public class example_1 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("please input  student information following  rules below");
        ArrayList<Student> yixinStudents = new ArrayList<>();
        // for (int i = 0; i < 5; i++) {
        //     Student student = new Student();
        //     student.init();
        //     yixinStudents.add(student);
        //     // yixinStudents.get(i).init();
        // }
        for (int j = 0; j < yixinStudents.size(); j++) {
            // yixinStudents.get(j).showInfo();
        }
        // System.out.println(myUtils.add(2, 3));
        // myUtils utils = new myUtils();
        // utils.add(2, 3);
        Test.add(2, 3);
    }

    

}

/**
 * Innerexample_1
 */
 class Student {

    private int age;
    private String name;
    private String homeTown;
    // Student(int pAge,String pName,String pHomeTown){
    //     this.age = pAge;
    //     this.name = pName;
    //     this.homeTown = pHomeTown;
    // }

    public void showInfo(){
        System.out.println(" name "+name+" age = "+age+" hometown: "+homeTown);
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
    
}
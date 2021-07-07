package oop1;

public class Student {
	
	private String name;

	public Student(String pName) {
		name = pName;
	}
	
	public void askQuestion(String question) {
		Teacher teacher = new Teacher("Hanfeng");
		//这里，我只要调用一个Teacher对象提供的ask方法，就能获取我想要的答案
//		而我不需要在乎 Teacher是怎么思考的，作为学生，只需要答案即可。
		String answerString = teacher.ask(question);
		System.out.println("老师的回答是："+answerString);
		
	}
	
	///省略其他 数据成员和 方法成员

}

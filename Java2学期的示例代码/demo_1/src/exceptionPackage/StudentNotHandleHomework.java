package exceptionPackage;

/**
 * 学生不交作业，要抛个异常，送给班主任处理
 * @author ianye
 */
public class StudentNotHandleHomework  extends HMCStudentException{
	
	private static final long serialVersionUID = 1L;
	String who;
	String classInfoString;
	
	public StudentNotHandleHomework() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentNotHandleHomework(String who, String claString) {
		// TODO Auto-generated constructor stub
		this.who = who;
		classInfoString = claString;
	}

}

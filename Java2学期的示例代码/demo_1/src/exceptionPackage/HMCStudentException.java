package exceptionPackage;

/**
 * 杭医学生所有异常的父类
 * @author ianye
 */
public class HMCStudentException  extends Exception{

	private static final long serialVersionUID = 1L;

	public HMCStudentException() {
		// TODO Auto-generated constructor stub
	}

	public HMCStudentException(String descString) {
		// TODO Auto-generated constructor stub
		super(descString);
	}
}

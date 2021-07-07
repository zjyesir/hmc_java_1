package exceptionPackage;

import java.util.Date;

/**
 * 学生翘课报异常
 * @author ianye
 */
public class StudentSkipClassException  extends HMCStudentException{
	
	private static final long serialVersionUID = 1L;
	String who;
	Date when;
	String whichClass;

	public StudentSkipClassException() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentSkipClassException(String whString,Date date,String whiString) {
		this.who = whString;
		this.when = date;
		whichClass = whiString;
	}
}

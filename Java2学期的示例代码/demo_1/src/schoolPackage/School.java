package schoolPackage;

/**
 * 学校，所有类型学校的父类
 * @author ianye
 *
 */
public class School {
	private String name;
	private String location;
	private int  staffNumber; //教职工人数
	private int studentNumber;

	public School() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 *  构造函数
	 * @param schoolName
	 * @param location
	 */
	public School(String schoolName,String location) {
		this.name = schoolName;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getStaffNumber() {
		return staffNumber;
	}

	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	

}

package abstractPackage;

public class Teacher extends Person{

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		
	}
	

	@Override
	void showMyInfo() {
		// TODO Auto-generated method stub
		System.out.println("I am a teacher , my name is: "+name);
	}
	
}

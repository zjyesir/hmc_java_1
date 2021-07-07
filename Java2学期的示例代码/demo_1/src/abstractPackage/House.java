package abstractPackage;

public class House implements Cloneable{
	private int id;
	private double area;
	private Address address;
	public  Integer integer ;
	
	interface myInterface{
		void show();
	}

	public House() {
		// TODO Auto-generated constructor stub
		integer =new Integer(10);
		address = new Address("浙江省","杭州","滨文路481号");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {	
		// Perform a shallow copy
		House houseclone =(House)super.clone();
		// Deep copy on whenBuilt
		houseclone.address =(Address)(address.clone());
		return houseclone;
	}
	
}

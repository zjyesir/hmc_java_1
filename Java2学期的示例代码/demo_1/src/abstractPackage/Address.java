package abstractPackage;

public class Address implements Cloneable {
	private String province;
	private String city;
	private String streetNo;


	public Address(String prString,String cString,String streetString) {
		// TODO Auto-generated constructor stub
		this.province = prString;
		this.city = cString;
		this.streetNo = streetString;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

package Animal;

public class Dog extends Animal{

	//鐙楃嫭鐗圭殑灞炴�э紝鍙互缁х画娣诲姞
	String dogType; 
	int age;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name,String dogType) {
		// TODO Auto-generated constructor stub
		super(name);
		this.dogType = dogType;
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
//		鍥犱负 anminalName 鏄埗绫荤殑private,鎵�浠ュ湪瀛愮被閲岃閫氳繃璋冪敤get鍑芥暟鏉ヨ幏鍙�
		System.out.println(getAnmimalName()+"  姹豹姹�");
	}
	
	//鐙楃嫭鐗圭殑鏂规硶锛屽彲浠ョ户缁坊鍔�
	/**
	 * 鍋囪鐪嬮棬鏄嫍鐙壒鐨勫姛鑳�
	 */
	public void watchDoor() {
		System.out.println("杩欎釜鏂规硶鍙湁Dog绫绘湁锛氱湅闂�");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	

}

package Animal;


public class Animal {
//	鍔ㄧ墿閫氱敤鐨勫睘鎬�
	private String anmimalName;
	protected String category;

//	public String getCategory() {
//		return category;
//	}
//
//	public void setCategory(String category) {
//		this.category = category;
//	}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String name) {
		anmimalName = name;
	}

	/**
	 * protected 鍙鎬т緥瀛�
	 */
	protected void useOnlyInAnimal() {

	}

	public String getAnmimalName() {
		return anmimalName;
	}

//	涓嬮潰鏄姩鐗╅�氱敤鐨勫姛鑳斤紝鍦ㄥ瓙绫讳腑闇�瑕侀噸鍐欙紝浣撶幇澶氭��

	/**
	 * 鍔ㄧ墿鍙�
	 */
	public void makeSound() {
		System.out.println(getClass().getName() + "鍔ㄧ墿鍩烘湰绫伙紝鍙０鏃犳硶纭畾");
	}

	/**
	 * 鍔ㄧ墿杩涢
	 */
	public void eat() {

	}

	/**
	 * 鍔ㄧ墿鐫＄湢浼戞伅
	 */
	public void sleep() {

	}
	
	public void abc() {
		
	}

}

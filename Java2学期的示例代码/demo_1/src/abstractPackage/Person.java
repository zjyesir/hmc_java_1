package abstractPackage;

public abstract  class Person {
	private String name;

//	protected String name;
//	身高
	protected double height;
//	体重
	protected double weight;

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String nameString) {
		name = nameString;
	}
	
	protected void ddd() {
		
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}

	/**
	 * 抽象方法，没有实现，也就是没有 {} ，
	 * 继承这个类的子类若要具备new对象的能力，就必须实现它。
	 */
	abstract void showMyInfo();
	 
}

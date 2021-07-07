package genericity;


public class Food implements ShowInfo<Food>{

	public Food() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void show(Food t) {
		// TODO Auto-generated method stub
		System.out.println(t.toString());
	}

}

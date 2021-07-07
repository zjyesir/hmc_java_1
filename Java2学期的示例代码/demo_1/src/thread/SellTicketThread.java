package thread;


public class SellTicketThread extends Thread{

	private String name;
	public SellTicketThread() {
		// TODO Auto-generated constructor stub
	}
	
	public SellTicketThread(Runnable runnable,String name){
		super(runnable);
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		System.out.println(name);
		super.run();
	}

}

package thread;


public class SellTicket implements Runnable{

//	private String window; //售票窗口
	private int ticketNumber = 10; //演唱会门票 默认数值
	private Object lockObject = new Object();
	
	public SellTicket() {
		// TODO Auto-generated constructor stub
//		this.window = window;
	}
	
	public SellTicket (int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	

	@Override
	public void run() {
//		主要 synchronized 关键字，它的意思就是，锁定一个变量，用于多个线程访问同个共享变量，
//		如果一个时间点不对一个数值进行加锁，那么这个数值的读写会造成错误。
//		你可以试试把 synchronized块 去掉看看执行效果
		synchronized (lockObject) {
			while(ticketNumber > 0)
	        {
				synchronized (lockObject) {
					if(ticketNumber >0) {
						ticketNumber--;
			            System.out.println( " sell No. " + ticketNumber+ " ticket");
					}
				}
	        }
		}
		
	}

}

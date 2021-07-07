package thread;


public class test {
	
	static private Integer shareData = 10;
	static Object  lock = new Object();

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

//		用thread实现多线程
//	    threadExample();

//		用runnable接口实现多线程
//		runnableExample();
		
//		runnable和thread的区别：
//		1. 一个runnable可以让多个thread 执行，能共享数据。
//		2. runnable 是接口，而thread是类，java是单继承，所以，如果只继承了thread类，就不能继承其他类了。就会对你扩展的类有限制
//		但如果你实现了runnable接口，在满足线程运行的前提下，还能继承其他类，但
//		sellTicketsUsingRunnable();
		
//		模拟多线程访问同个数据，并发编程的最基本模板
		multipleThreadVisitingSameDataExample();
		
	}
	
	static void threadExample(){
		MyThread t1 = new MyThread("A");
		MyThread t2 = new MyThread("B");
		MyThread t3 = new MyThread("C");
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	static void  runnableExample() {
		Thread t1 = new Thread(new FromRunnable("AA"));
		Thread t2 = new Thread(new FromRunnable("BB"));
		Thread t3 = new Thread(new FromRunnable("CC"));
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	//Runnable是可以共享数据的，多个Thread可以同时加载一个Runnable，
//	当各自Thread获得CPU时间片的时候开始运行runnable，runnable里面的资源是被共享的
	static void sellTicketsUsingRunnable() {
		SellTicket sellTicket = new  SellTicket(5);
//		Thread t1 = new SellTicketThread(sellTicket,"售票窗口1");
//		Thread t2 = new SellTicketThread(sellTicket,"售票窗口2");
//		Thread t3 = new SellTicketThread(sellTicket,"售票窗口3");
		
		Thread t1 = new Thread(sellTicket);
		Thread t2 = new Thread(sellTicket);
		Thread t3 = new Thread(sellTicket);
//		Thread t2 = new Thread(new SellTicket("售票窗口2"));
//		Thread t3 = new Thread(new SellTicket("售票窗口3"));
		
		t1.start();
		t2.start();
		t3.start();
	}
	
//	模拟 3个售票窗口，卖一定数量票的 例子，创建了3个线程去处理
	static void multipleThreadVisitingSameDataExample() {
//		窗口1
		Thread t1 = new Thread() {
			@Override
			public void run() {
				while (shareData > 0) {
					synchronized (lock) {
						if (shareData > 0) {
							System.out.println(" 窗口1 卖掉 票： " + (shareData));
							--shareData;
						}
					}
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		};
		
//		窗口2
		Thread t2 = new Thread() {
			@Override
			public void run() {
				while (shareData > 0) {
					synchronized (lock) {
						if (shareData > 0) {
							System.out.println("  窗口2 卖掉 票： " + (shareData));
							--shareData;
						}
					}
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		};
		
//		窗口3
		Thread t3 = new Thread() {
			@Override
			public void run() {
				while (shareData > 0) {
					synchronized (lock) {
						if (shareData > 0) {
							System.out.println("   窗口3 卖掉 票： " + (shareData));
							--shareData;
						}
					}
					try {
						Thread.sleep(500); //模拟线程 暂停，cpu让出
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}

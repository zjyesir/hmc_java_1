package thread;


public class MyThread extends Thread{
	
	//自定义属性
	private String name;
	private int time = 500; 

	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	
	public MyThread(String name) {
		this.name = name;
	}
	
	public MyThread(Runnable runnable,String name){
		super(runnable);
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		for (int i = 0; i < 5; i++) {
            System.out.println(name+" doing  子任务 "+i +" at thread "+getId()+" "+getName());
//            System.out.println(name+" doing task "+i +" at thread "+Thread.currentThread().getName());
            try {
//            	Thread.sleep()方法调用目的是不让当前线程独自霸占该进程所获取的CPU资源，以留出一定时间给其他线程执行的机会。
//            	实际上所有的多线程代码执行顺序都是不确定的，每次执行的结果都是随机的。（要看效果要去除sleep方法，然后加大打印次数）
                sleep(time); //休眠1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}

}

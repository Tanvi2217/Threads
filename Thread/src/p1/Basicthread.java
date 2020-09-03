package p1;

class Mythread extends Thread{

	String threadName;
	
	public Mythread(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(threadName+" \t : "+i);
		}
	}
	
	
}//end of thread

public class Basicthread {

	public static void main(String[] args) {
		
		
		Mythread  t1 = new  Mythread ("task 1");
		t1.start();
	
		Mythread  t2 = new  Mythread ("task 2");
		t2.start();
	
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String threadName = Thread.currentThread().getName();
			
		for (int i = 0; i < 5; i++) {
			System.out.println(threadName+" \t : "+i);
		}
	}

}

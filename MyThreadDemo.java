package multithreading;

public class MyThreadDemo implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i am in thread method");	
		}
		
	}

	public static void main(String[]arg){
		// TODO Auto-generated constructor stub
		MyThreadDemo d1=new MyThreadDemo();
		Thread t1=new Thread(d1);
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println("i am in main method");
			
		}
		
	}

}

package multithreading;

public class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("I am in thread class");	
			
		}
	
	
	}
	

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		t1.start();
		for(int i=0;i<10;i++){
			System.out.println("I am main method");
			// TODO Auto-generated method stub	
		}
		

	}

}

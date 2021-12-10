package multithreading; //in this program implement join , sleep ,yield method.

public class MyThreadEnter extends Thread {
@Override
	public void run() {
	for(int i=0;i<10;i++) {

	System.out.println("i am  Thread");
try {
	//Thread.sleep(2000); //the current thread will be sleep state at second by using sleep method.
       Thread.yield();//to give next thread execute chance & it self hold to execution.
}
catch(Exception e){
	
}
}
	 class  MyThread02 extends Thread{
		public void run() {
	}
}
}
	
		

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		MyThreadEnter e1=new MyThreadEnter();
		MyThreadEnter e2=new MyThreadEnter();
		e1.start();
		e2.start();
		//e2.join();	//in this method current thread will be execute first other thread in wait.
		
		for(int i=0;i<10;i++) {
		System.out.println("i am main Thread");
		}

	}

}

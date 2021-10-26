package thread;

public class TestJoinMethod extends Thread {
	public void run() {
		//System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {System.out.println(e);}
			System.out.println(i+"--"+Thread.currentThread().getName());
			
			}
		
		}
	public static void main(String[] args) {
		TestJoinMethod t1=new TestJoinMethod();
		t1.setName("first Thread");
		TestJoinMethod t2=new TestJoinMethod();
		t2.setName("second Thread");
		
		TestJoinMethod t3=new TestJoinMethod();
		t3.setName("third Thread");
		
		t1.start();
		try {
			t1.join();
		}catch(Exception e) {System.out.println(e);}
		
		t2.start();
		t3.start();
		
	}

}

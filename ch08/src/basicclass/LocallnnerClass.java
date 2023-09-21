package basicclass;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable() {
		int num = 10;
		
		
		class MyRunnable implements Runnable{
			int localNum = 20;

			@Override
			public void run() {
				//num = 20;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(num);
				
			}
			
		}
		MyRunnable myRun = new MyRunnable();
		return myRun;
		
	}
	
	
	
}



public class LocallnnerClass {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable().run();
	}

}

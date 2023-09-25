package threads.name;

public class ThreadA extends Thread {

	public ThreadA() {
		this.setName("ThreadA");
	}
	
	
	@Override
	public void run() {
		for(int i = 0; i<2; i++) {
			System.out.println(getName());
			
		}
	}

	
	
}

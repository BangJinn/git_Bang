package threads.name;

public class ThreadB extends Thread {

	public ThreadB() {
		this.setName("ThreadB");
	}
	
	@Override
	public void run() {
		for(int i = 0; i<2; i++) {
			System.out.println(getName());
			
		}
	}

	
	
}

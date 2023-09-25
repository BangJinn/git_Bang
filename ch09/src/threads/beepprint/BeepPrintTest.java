package threads.beepprint;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args) {

		for(int i=1; i<=5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
				
			}catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1; i<=5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
			
		}
		
		
		
	}

}

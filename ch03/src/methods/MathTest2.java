package methods;

public class MathTest2 {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			int dice = (int)(Math.random()*6) + 1;
			System.out.println(dice);
		}
		String [ ] word = {"나", "너", "우리", "나라", };
		
		int idx = (int)(Math.random()*word.length);
		System.out.println(word[idx]);
			
			
		}
	}


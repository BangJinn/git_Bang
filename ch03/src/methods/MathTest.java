package methods;

public class MathTest {

	public static void main(String[] args) {
		//내장 함수 - 수학(math)
		int v1 = Math.abs(-10);	//절대값
		System.out.println("v1 = " + v1);
		
		long v2 = Math.round(5.67);
		System.out.println("v2 = " + v2);
		
		double v3 = Math.floor(3.31);
		System.out.println("v3 = " + v3);
		
		double rand = Math.random();
		System.out.println(rand);
		
		int dice = (int)(Math.random()*6 + 1);
		System.out.println(dice);
	}

}

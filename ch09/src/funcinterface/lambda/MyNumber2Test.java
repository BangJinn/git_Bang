package funcinterface.lambda;

public class MyNumber2Test {

	public static void main(String[] args) {

		
		MyNumber2 myNum;
		
		myNum = (x, y) -> {
			return (x >= y) ? x : y;
			
		
		};
		System.out.println(myNum.getMax(5, 7));
	}

}

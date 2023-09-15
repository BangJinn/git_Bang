package methods;

public class ReturnMothodTest {
	
	//return이 있는 함수(반환 자료형) -int, String 
	//호출한 곳으로 반환값을 보냄

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		//더하기 함수 호출
		int result = add(10, 20);
		System.out.println("결과값: " + result);
		
		int result2 = square(n1);
		System.out.println("결과값2: " + result2);
		
		String str = message();
		System.out.println(str);
		
		
	}
	//return이 있고 매개변수 2개인 함수. 이름은 add()
	public static int add(int a, int b) {
		return a + b;
		
	}
	//return이 있고 매개변수 1개이 함수
	public static int square(int x) {
		return x * x;
	}
	//return이 있고 매개변수가 없는 함수
	public static String message() {
		return "행운을 빌어요";
		
	}
}

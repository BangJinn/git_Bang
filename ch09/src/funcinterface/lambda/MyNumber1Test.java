package funcinterface.lambda;

public class MyNumber1Test {

	public static void main(String[] args) {
		//인터페이스형 변수 선언
		MyNumber1 number;
		
		//변수 람다식을 저장
		//calculate()를 구현함
		//매게변수가 1개인 경우 소괄호 생략 가능
		//number = (x) -> {
			//x = x + 10;
			//System.out.println(x);
		//};
		
		number = x -> System.out.println(x+10);
		
		number.calculate(1);
		
		number = n -> System.out.println(n * n);
		number.calculate(2);
		
	}

}

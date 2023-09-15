package constant;

public class ConstantTest1 {

	public static void main(String[] args) {
		// 상수 선언 및 사용
		//int maxNum = 100;
		//final int MAX_NUM = 100; //상수
		//MAX_NUM = 100; //상수는 변경할 수 없다.
		
		//System.out.println(MAX_NUM);
		
		//원의 넓이 = 반지름 * 원주율(Pi)
		//변수 - 원의 반지름(radius), 원의 넓이(circleArea)
		//상수 - PI
		int radius = 5; // 
		final double PI = 3.14;
		double circleArea;
		
		//PI = 3.15; //3.15로 선언해도 상수는 변하지않기에 변경 불가능.
		circleArea = radius * radius * PI;
			System.out.println("원의 넓이는 " + circleArea);
		
	}

}

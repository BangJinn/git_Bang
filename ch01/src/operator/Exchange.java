package operator;

public class Exchange {

	public static void main(String[] args) {
		// 변수의 값 교환
		// 변수 선언 - 입력
		int x = 0, y = 1, temp; // temp 임시 변수 선언
		
		//출력
		System.out.println("*******교환 전*******");
		System.out.println("x=" + x +",y="+ y);
		
		//교환 처리 (연산)
		temp = x;
		x = y;
		y = temp;
		
		System.out.println();
		
		//출력
		System.out.println("*******교환 후*******");
		System.out.println("x=" + x +",y="+ y);
	}

}

package arrays;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 실수형 배열의 연산
		// 크기가 5인 실수형 배열 data 선언
		double[] data = new double[5];
		// 총점 - total
		double total = 0.0;
		// 평균 - average
		double average;
		
		//저장
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		//전체 조회(총점계산)
		for(int i=0; i<data.length; i++) {
			total += data[i];
			System.out.println(data[i]);
			
		}
		//평균계산
		average = total / data.length;
		//총점출력
		System.out.println("총점 : "+ total);
		//평균출력
		System.out.println("평균 : " + average);
		
		
		
		
	}

}

package forexample;

public class NestedFor1 {

	public static void main(String[] args) {
		// 중첩 for문
		// 5행5열 '8'을 출력
		/*for(int i=1; i<=5; i++){
			for(int j=1; j<=5; j++) {
				System.out.print('*');
			}
		System.out.println("");
		}*/
		
		//직각삼각형 별 구현
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****

		 */
		for(int i=1; i<=5; i++){	//행
			for(int j=1; j<=i; j++) {	//열
				System.out.print('*');
			}
		System.out.println("");
		}
		//역직각삼각형 별 구현
		System.out.println("---------------------------------------------------------");
		for(int i=1; i<=5; i++){	//행
			for(int j=5; j>=i; j--) {	//열
				System.out.print('*');
			//System.out.println("i = " + i + ", j = " + j);
				
			}
		System.out.println();
		}
		
	}

}
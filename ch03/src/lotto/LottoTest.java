package lotto;

public class LottoTest {

	public static void main(String[] args) {
		// 로또 번호 생성기
		// 1~45 -> 6개 생성
		// 배열의 크기 6개인 lotto 선언
		
		int[] lotto = new int[6];
		
		lotto[0] =(int)(Math.random()*45 + 1);
		//System.out.println(lotto[0]);
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j])
					i--;
			}
			
		}
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
			
		}
	}

}

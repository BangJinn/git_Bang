package algorithm;

public class RankTest {

	public static void main(String[] args) {
		// 순위 정하기
		// rank를 모두 1로 초기화함
		// rank -> 3, 1, 4, 5, 2
		int[] score = {70, 90, 60, 50, 80};
		int[] rank = new int[5];	// 0, 0, 0, 0, 0
		
		//중첩 for(행, 열)
		for(int i = 0; i<score.length; i++) {
			int count = 1;
			for(int j = 0; j<score.length; j++) {
				if(score[i] < score[j]) {
					count++;
				}
			}
			rank [i] = count;
		}
		for(int i=0; i<score.length; i++) {
			System.out.println(rank[i] + " ");
			
		}
		
	}

}

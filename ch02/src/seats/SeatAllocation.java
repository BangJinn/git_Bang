package seats;

import java.util.Scanner;

public class SeatAllocation {

	public static void main(String[] args) {
		// 자리배치도
		// 변수 - customer(고객), column(열), row(행)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입장객 수 : ");
		int customer = scan.nextInt();
		
		System.out.print("좌석 열 수 : ");
		int column = scan.nextInt();
		
		int row;
		
		if(customer % column == 0) {
			row = customer / column;
		}else {
			row = customer / column + 1;
		}
		
		//종합 for
		for(int i = 0; i<row; i++) {
			for(int j = 1; j<=column; j++) {
				int seatnum = column*i+j;
					if(customer<seatnum)
						break;
				System.out.print("좌석" + seatnum + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}

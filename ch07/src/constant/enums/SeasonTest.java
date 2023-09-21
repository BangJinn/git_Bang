package constant.enums;

public class SeasonTest {

	public static void main(String[] args) {

		Season season;
		
		season = Season.여름;
		
		//System.out.println(season);
		
		switch(season) {
		case 봄:
			season =season.봄;
			break;
		case 여름:
			season =season.여름;
			break;
		case 가을:
			season =season.가을;
			break;
		case 겨울:
			season =season.겨울;
			break;	
		default:
			System.out.println("계절없어");
			break;
		}
		System.out.println("현재 계절은 " + season + "입니다");
		
	}

}

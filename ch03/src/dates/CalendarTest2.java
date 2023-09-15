package dates;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		//지나온 시간 측정
		//1970. 1. 1 자정 이후부터 측정 - 밀리초
		//System.out.println(24*60*60*1000);
		long passedTime = cal.getTimeInMillis();
		System.out.println(passedTime);

		//일로 환산
		passedTime = passedTime/(24*60*60*1000);
		System.out.println(passedTime);
		
		Calendar startDay = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		startDay.set(2023, 9, 1);
		today.set(2023, 9, 15);
		
		long betweenTime = today.getTimeInMillis() - startDay.getTimeInMillis();
	
		betweenTime = betweenTime/(24*60*60*1000);
		System.out.println(betweenTime + "일 지났습니다.");
		
		System.out.println(System.currentTimeMillis());
	}

}

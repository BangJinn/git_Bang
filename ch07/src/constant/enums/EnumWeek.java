package constant.enums;

import java.util.Calendar;

public class EnumWeek {

	public static void main(String[] args) {

		Week today = null;
		
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//System.out.println(week);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		}
		System.out.println("Today is " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일은 영화");
		}else {
			System.out.println("일하자");
		}
		
	}

}

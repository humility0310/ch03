package ch03;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		printDate(calendar);

		// calendar.set(Calendar.YEAR,2007);
		// calendar.set(Calendar.MONTH,10);
		// calendar.set(Calendar.DATE,18);

		calendar.set(2016, 2, 10);
		calendar.add(Calendar.DATE, 365);
		printDate(calendar);
		
		calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
	}

	public static void printDate(Calendar calendar) {
		String[] days = { null, "일", "월", "화", "수", "목", "금", "토" };
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);// 0~11
		int date = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		int day = calendar.get(Calendar.DAY_OF_WEEK);// 1~7의 값(일요일~토요일)

		System.out.println(year + "년" + (month + 1) + "월" + (date) + "일" + (hour) + "시" + (min) + "분" + (sec) + "초"
				+ (days[day]) + "요일");
	}
}

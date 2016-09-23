package ch03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();

		// System.out.println(now);
		// 년, 월(0-11), 일
		Date d1 = new Date(2000, 9, 23);// depercated-> 없어질 예정(비추천하는거)
		printDate(d1);

		// 년, 월(0-11), 일, 시간, 분
		Date d2 = new Date(2000, 8, 1, 12, 30);// depercated-> 없어질 예정(비추천하는거)
		// System.out.println(d2);
		printDate(d2);

		// 년, 월(0-11), 일, 시간, 분
		Date d3 = new Date(2000, 8, 1, 12, 30, 30);// depercated-> 없어질
													// 예정(비추천하는거)
		// System.out.println(d3);
		printDate(d3);

		// 1970년 1월1일 00:00:00 기준으로 밀리세컨드값으로 세팅
		// 년, 월(0-11), 일, 시간, 분
		long milliseconds = 1000L * 60 * 60 * 24 * 365 * 40;
		Date d4 = new Date(milliseconds);
		// System.out.println(d4);

		printDate(d4);
		printDate2(d4);

	}

	private static void printDate(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		System.out.println(sdf.format(d));
	}

	private static void printDate2(Date d) {
		//년도 + 1900
		int year = d.getYear();
		
		//월 + 1
		int month = d.getMonth();

		//일
		int date = d.getDate();
		
		//시
		int hour = d.getHours();
		
		//분
		int min= d.getMinutes();
		
		//초
		int sec = d.getSeconds();
		System.out.println((year+1900) + "년" + 
							(month+1)+"월"+
							(date)+"일"+
							(hour)+"시"+
							(min)+"분"+
							(sec)+"초");
	}
}

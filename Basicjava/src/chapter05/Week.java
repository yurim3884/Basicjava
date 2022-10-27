package chapter05;

public enum Week {
	MONDAY("월요일"," "), TUESDAY("화요일"," "), WEDNESDAY("수요일"," "), THURSDAY("목요일"," "), FRIDAY("금요일"," "), SATURDAY("토요일"," "), SUNDAY("일요일"," ");

	String name;
	String chNm;

	Week(String korName, String chName)
		{name=korName; 
		chNm= chName;}
}

//쓸때는 week.monday;

//한글은 쓰지말자! 인코딩에서 불편함 
//enum KorWeek {
//	월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일
//}
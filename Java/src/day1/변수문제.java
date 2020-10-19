package day1;

public class 변수문제 {

	public static void main(String[] args) {
		// 내가 만드는 문제 !!
		// 문제1. 국어 점수를 저장할수있는 변수를 만들어라.
		int langScore;
		// 문제2. 국어 100점 수학80점 영어 75점, 세 과목의 총점과 평균을 구할수있는 변수를 선언하고 값을 출력하라
	    langScore = 100;
		int mathScore = 80;
		int engScore = 75;
		
		int sum = langScore+mathScore+engScore;
		double avr = sum /3.0;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avr);

	}

}

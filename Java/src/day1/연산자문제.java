package day1;

public class 연산자문제 {

	public static void main(String[] args) {
		/* 문제 1. 국어 성적이 100점, 영어 성적이 35점, 수학 성적이 97점 일 때,
		 * 국어, 영어, 수학 세 과목의 총점과 평균을 구하여 콘솔에 출력하세요.
		 */
		int langScore = 100;
		int engScore = 35;
		int mathScore = 97;
		int sum=langScore+engScore+mathScore;
		double avr=sum/3.0;
		System.out.println("총점은 ? : " + sum);
		System.out.println("평균은 ? : " + avr);
		
	}
}

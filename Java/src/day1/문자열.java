package day1;

public class 문자열 {

	public static void main(String[] args) {
		// 문자는 1글자 문자열은 0글자 이상
		// 문자는 유니코드표에 있는 값에 따라 저장된다.
		char ch = 'A';
		System.out.println((int)ch); //A의 유니코드 값
		ch = '가';
		
		System.out.println((int)ch); //가의 유니코드 값
		ch = (char)(66);
		
		System.out.println(ch); //유니코드 값 66을 출력
		System.out.println("------------");
		
		String str = "가 나 다 라"; //문자열 String 클래스 선언시 ""; 쌍따옴표로 선언
		System.out.println("문자열 : " + str);
		str = "안녕하세요 :)";
		System.out.println("문자열 : " + str);
	}

}
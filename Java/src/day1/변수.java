package day1;

public class 변수 {

	public static void main(String[] args) {
		// 주석 //는 한줄주석이다.
		/* 는 여러줄 주석입니다. */
		/* 명명규칙 
		 * 1 대소문자구분
		 * 2 예약어 사용불가 (주황글씨!)
		 * 3 숫자로 시작불가
		 * 4 특문은 _ 와 $만 허용된다.
		 */
		// 변수선언방법**
		// 변수타입 변수명; 변수명은 의미있게 짓기 중복선언 불가
		char ch; // 문자형 변수인 ch를 선언
		int num1; // 정수형 변수인 num1 선언
		long num2; // 정수형 변수인 num2 선언
		float num3; // 실수형 변수인 num3 선언
		double num4; // 실수형 변수인 num4 선언
		boolean bool; // 논리형 변수인 bool 선언
		// 변수 선언 및 초기화 방법
		// 변수타입 변수명 = 값 ;
		// 문자는 앞뒤로 ' ' 를 붙인다. (문자는 한글자를 의미한다.)
		char cha1 = 'A';
		char cha2 = 'C';
		char cha3 = '한';
		char cha4 = '\'';
		char cha5 = '_';
		
		int numb1 = 10; //10진수 10
		int numb2 = 010; //8진수 10
		int numb3 = 0x10; //16진수 10
		// int numb4 = 123456789012; 범위초과
		
		// long numb5 = 123456789012; l 또는 L을 쓰지않으면 에러발생
		// 기본정수값은 int형으로 인식이 된다.
		// int형으로 표현할 수 없는 경우는 에러발생한다.
		long numb5 = 123456789012L; //long은 접미사 L 또는 l 쓸 수 있다. 큰 수를 다룰 때에는 꼭 써야한다.
		
		// 기본 실수값은 double형으로 인식된다.
		// float형의 접미사 f또는 F를 붙여야한다. 무조건!
		float numb6 = 1.234f;
		
		double numb7 = 1.23456;
		
		boolean bool1 = true;
		boolean bool2 = false; //주황글씨 = 예약어
		
		//변수 선언후 초기화2번째 방법
		//변수타입 변수명 = 변수명;
		int kor1 = 100;
		int kor2 = kor1;
		// 여러 변수를 한번에 선언하는 방법. 단! 같은 변수타입만 가능.
		// 정수형 변수 a는 10, b는 20을, c는 30을 저장하도록 선언
		int a = 10, b = 20, c = 30;
		}

}
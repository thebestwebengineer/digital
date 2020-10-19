package day1;

public class 연산자 {

	public static void main(String[] args) {
		// 대입 연산자 : =
		// =을 기준으로 오른쪽에 있는 값을 왼쪽에 저장하는 것. A = B; B를 A에 저장하라 또는 대입하라 라는 의미.
		// 이 때, 좌변은 변수이어야하며 1개여야 한다.
		
		int a = 10;
		System.out.println(a);
		int b = 20;
		a = 30;
		System.out.println(a);
		a = b + a;
		System.out.println(a);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// 산술 연산자 : + - * / %
		// + - *는 알고있는 그대로이며 / % 는 각각 나눗셈 , 나머지이다.
		System.out.println(4+3);
		System.out.println(4-3);
		System.out.println(4*3);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(1.2 + 3.4);
		System.out.println(1.2 - 3.4);
		System.out.println(1.2 * 3.4);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		/* 나누기
		 * 정수 / 정수 => 결과값은 정수
		 * 정수 / 실수 => 실수
		 * 실수 / 정수 => 실수
		 * 실수 / 실수 => 실수
		 * 정수/ 정수 일때 한 변에다가 자료형변환하여 실수 / 정수 또는 정수 / 실수로 만들어 계산하게되면 실수값이 도출된다.
		 */
		System.out.println(3/2);
		System.out.println(3/2.0);
		System.out.println(3.0/2);
		System.out.println(3.0/2.0);
		System.out.println((double)3/2);
		System.out.println(3/(double)2);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ"); 
		
		int num1 = 3;
		int num2 = 2;
		System.out.println((double)num1 / num2);
		System.out.println(num1 / (double)num2);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ"); 
		// 나머지(모드)연산자 : %
		// A % B : A를 B로 나누었을 때 나머지의 값을 구하라.
		// 배수 또는 약수 구할 때 사용
		System.out.println(4 % 3);
		System.out.println(199%17);
		
	}

}

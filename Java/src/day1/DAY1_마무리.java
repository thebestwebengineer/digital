package day1;

public class DAY1_마무리 {

	public static void main(String[] args) {
		// 문자를 유니코드값으로 치환하라 , 문자 A , J , 가
		int ch1 = 'A';
		int ch2 = 'B';
		int ch3 = '가';
		System.out.printf("%d\n%d\n%d\n",ch1,ch2,ch3);
		System.out.println("---------------------------");	
		char ch4 = 'A';
		System.out.println((int)ch4);
		char ch5 = 'B';
		System.out.println((int)ch5);
		char ch6 = '가';
		System.out.println((int)ch6);
		// 여기까지 문자를 유니코드값으로 치환하는 방법을 보았다 , printf 는 변수의 값을 지시자를 통해 여러 가지 형식으로 출력가능하며
		// 줄바꿈이 안됨
		// println 변수와 문자열을 + 로 이어준다 , 저장된 값 그대로 출력해주며 자동으로 줄바꿈 들어가있다.
		System.out.println("---------------------------");
		// 오버플로우 예제만들기
		int num_Max=Integer.MAX_VALUE;
		int num_Min=Integer.MIN_VALUE;
		System.out.printf("최댓값은 ? : %d\n최솟값은 ? : %d\n",num_Max,num_Min);
		System.out.println("최솟값 - 1 : " + (num_Min - 1));
		System.out.println("최댓값 + 1 : " + (num_Max + 1));
		System.out.println("---------------------------");
		// 논리연산자 테스트
		char cha1 = '가';
		boolean bool1 = (cha1 >= 'A') && (cha1 <= 'Z');
		if(bool1==true) {
			System.out.println("영어 입니다");
		}
		else {
			System.out.println("영어가 아닙니다");
		}
		// boolean 과 if문 조합
				 
		}
	}
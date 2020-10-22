package day4;

import java.util.Scanner;

public class 최소공배수 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2를 입력받아 두 정수의 최소 공배수를 출력하는 예제
		 * 공배수는 두 정수의 공통으로 있는 배수
		 * 최소 공배수는 공배수 중 가장 작은 배수
		 * 10의 배수 : 10 20 30 40 50 60 70 80 90...
		 * 15의 배수 : 15 30 45 60 75 90 105 120 135...
		 * 10과 15의 공배수 30 60 90...
		 * 10과 15의 최소공배수 : 30
		 */
		/* 반복횟수 : i는 num1부터 시작하고 i는 num1만큼 증가
		 * 규칙성 : i가 num1의 배수이고 i가 num2의 배수이면 i를 출력 후 반복문 종료
		 *    => i를 num1으로 나누었을 때 나머지가 0과 같고
		 *       i를 num2로 나누었을 때 나머지가 0과 같다면 i출력후 반복문 종료
		 * */
		int i , num1 , num2 ;
		Scanner scan = new Scanner(System.in);
		System.out.print("num1에 들어갈 정수를 입력하세요. :  ");
		num1=scan.nextInt();
		System.out.print("num2에 들어갈 정수를 입력하세요. :  ");
		num2=scan.nextInt();
		
		for(i=num1; ;i+=num1) //i가 num1만큼 증가한다 : i은 num1의 배수다. num1 와 num2를 바꿔도 적용가능하다.
		{
			if(i%num1==0 && i%num2==0) //num1의 배수인 i를 num1으로 나누었을 때 나머지 (%) 가 0일경우와
										//해당 i 를 num2로 나누었을 때 나머지가 0일경우
			{
				System.out.println(num1+"과 "+num2+"의 최소공배수는 ? :  "+i);
				break;
			}
		}
		scan.close();
	}
}

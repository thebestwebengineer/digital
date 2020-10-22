package day4;

import java.util.Scanner;

public class 최대공약수2 {

	public static void main(String[] args) {
		/* 두 정수 num1과 num2를 입력받고 두 정수의 최대 공약수를 출력하는 예제
		 * 공약수 : 두 정수의 공통으로 있는 약수
		 * 최대공약수 : 두 정수의 공약수 중 가장 큰 수
		 * ex) 8과 12의 공약수 : 1 2 4
		 * 	   8과 12의 최대공약수 : 4
		 */
		int i, num1, num2;
		int gdc = 0;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("정수num1 을 입력하세요 :  ");
		num1 = scan.nextInt();
		System.out.print("정수num1 을 입력하세요 :  ");
		num2 = scan.nextInt();
		
		for(i = num1 ;i>=1 ; i--)
		{
			if(num1%i==0 && num2%i==0)
			{
				gdc=i;
				break;
			}
		}
		System.out.println("최대공약수는 ? : "+gdc);
		scan.close();
	}

}

package day4;

import java.util.Scanner;

public class 최대공약수 {
	public static void main(String[] args) {
		/* 두 정수 num1과 num2를 입력받고 두 정수의 최대 공약수를 출력하는 예제
		 * 공약수 : 두 정수의 공통으로 있는 약수
		 * 최대공약수 : 두 정수의 공약수 중 가장 큰 수
		 * ex) 8과 12의 공약수 : 1 2 4
		 * 	   8과 12의 최대공약수 : 4
		 */
		Scanner scan=new Scanner(System.in);
		System.out.print("num1에 들어갈 정수를 입력하시오 :  ");
		int num1=scan.nextInt();
		System.out.print("num2에 들어갈 정수를 입력하시오 :  ");
		int num2=scan.nextInt();
		int i, gcd = 0;
		for(i=1; i<=num1&&i<=num2; i++) {
			if(num1%i==0&&num2%i==0) {
				System.out.print(i+" "); //공약수찾기
				gcd = i; //for문이 끝날때까지 공약수를 gcd 변수에 저장.
			}
		}
		System.out.println();
		System.out.print("최대 공약수는 ?  : " + gcd); //최대공약수 출력
		scan.close();
	}

}
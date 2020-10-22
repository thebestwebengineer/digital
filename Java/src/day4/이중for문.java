package day4;

import java.util.Scanner;

public class 이중for문 {

	public static void main(String[] args) {
		/* for(1.초기화; 2.조건식; 3.증감식) {
		 * 		for(4.초기화; 5.조건식; 6.증감식) {
		 * 		실행문1;
		 * 		}
		 * 	기타실행문;
		 * }
		 * 1,2,3에서 사용하는 변수와 4,5,6에서 사용하는 변수가 일반적으로 다르다.
		 * ex)  *****
		 * 		*****
		 * 		*****
		 */
		int i, j;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* 구구단 7단을 출력하는 코드 작성*/
		for(i = 1; i <= 9; i++) {
			System.out.println("7 * "+i+" = "+7*i);
		}
		/* 구구단 전체 출력하는 코드 작성 2단부터 9단까지*/
		for(i = 2; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
		/* 1을 제외한 num가 소수인지 아닌지 판별하는 예제*/
		int num, cnt=0;
		for(num = 2; num <= 100; num++) {
			for(i = 1, cnt = 0; i <= num; i++) { //cnt 변수 초기화
				if(num % i == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				System.out.print(num+" ");
			}
		}
	}
}
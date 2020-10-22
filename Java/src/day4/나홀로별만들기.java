package day4;

import java.util.Scanner;

public class 나홀로별만들기 {

	public static void main(String[] args) {
		int i,j,num;
		Scanner scan=new Scanner(System.in);
		System.out.print("삼각형 행의 갯수를 정해주세요 . 1-10 : ");
		num=scan.nextInt();
				
		for(i = 1; i <= num; i++) {
			for(j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}
			for(j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
package day5;

import java.util.Scanner;

public class while문예제 {

	public static void main(String[] args) {
		/* 숫자 거꾸로 출력하는 예제*/
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요. : ");
		int num = scan.nextInt();
		int sum = 0;
		int bNum = num;
		System.out.print(bNum+"를 거꾸로 하면? : ");
		while(num != 0) {
			int tmp = num % 10;
			sum = sum + tmp;
			System.out.print(tmp);	
			num = num / 10 ;
		}
		System.out.println();
		System.out.println(bNum+"의 각 자리의 합은? : "+sum);
		scan.close();
	}
}

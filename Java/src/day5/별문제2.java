package day5;

import java.util.Scanner;

public class 별문제2 {

	public static void main(String[] args) {
		/* for(초기화;조건식;증감식){
		 * 	실행문;
		 * }
		 * 
		 * - 일반변수 vs 참조변수
		 *   일반변수는 변수 타입을 이용한 변수들로 값을 저장(자료형)
		 *     ->int,double,float,char ....
		 *   참조변수는 주소를 저장하는 변수로 객체, 배열 등이 있다.
		 *   
		 *   지역변수는 특정한 지역에서 사용하는 변수이다.(왠만한 변수들이 이에 해당) 
		 *     ->선언 위치의 중괄호 안에서만 사용 가능
		 *   
		 * */
		int i, j;
		for(i = 1; i <= 5; i++) { //for문 에는 세미콜론 ; 작성시 에러는 뜨지않으나 제대로 실행이 되지 않는다.
			if(i % 2 == 0) {
			System.out.println(i);
			}
		}
		for(j = 1; j <= 5; j ++) {
			System.out.println(j);
		}
		// System.out.println(j); 중괄호 밖에서 사용했을경우 에러뜬다.
		if(i % 2 == 0) {
			int k = 1;
			System.out.println(k);
		}
		//System.out.println(k); 중괄호 밖에서 사용했을경우 에러뜬다.
		//for(int i =6; i <= 10; i++) { 변수 중복선언 불가능. 이미 위에 선언되어있음.
			//System.out.println(i); 
		//}
		Scanner scan = new Scanner(System.in);
		System.out.print("num에 들어갈 정수를 기입하세요.  :  ");
		int num = scan.nextInt();
		for(i = 1; i <= num; i++) {
			for(j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}
			for(j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i = 1; i <= num; i++) {
			for(j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}
			for(j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		/* *********
		 *  *******
		 *   *****
		 *    ***
		 *     *
		 *     */
		for(i = 1; i <= num; i++) {
			for(j = 1; j <=i-1; j++) {
				System.out.print(" ");
			}
			for(j = 1; j <=2*(num-i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
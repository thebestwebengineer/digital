package day5;

import java.util.Scanner;

public class Dowhile문 {

	public static void main(String[] args) {
		/* for문과 while문은 조건식에 따라 한번도 실행되지 않을 수 있다.
		 * do{
		 * 		실행문
		 * }
		 * while(조건식); - do-while문은 while끝에 세미콜론 필수!
		 * 				- do-while문은 무조건 1번은 실행된다. (조건식이 거짓이어도 ..!)
		 *  		 
		  int i = 1;
		  for( ; i == 0; ) {
			System.out.println("1");
		  }
		 */
		int i = 1;
		do {
			System.out.println("2");
		}
		while(i == 0); //위 for문과 같은코드 다른결과.
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		do{
			System.out.println("---메 뉴---");
			System.out.println("1.불러오기");
			System.out.println("2.저장하기");
			System.out.println("3.실행하기");
			System.out.println("4.종료하기");
			System.out.println("---------");
			System.out.print("메뉴를 선택해주세요. : ");
			menu = scan.nextInt();
			/*switch(menu) {
				case 1:
					System.out.println("불러오기를 실행합니다.");
					break;
				case 2:
					System.out.println("저장하기를 실행합니다.");
					break;
				case 3:
					System.out.println("실행합니다.");
					break;
			}*/
		}
		while(menu != 4) ;
		System.out.println("프로그램 종료합니다.");
		scan.close();
	}
}
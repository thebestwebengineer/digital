package day5;

import java.util.Scanner;

public class while문 {

	public static void main(String[] args) {
		/* while(조건식){
		 * 		실행문
		 * }
		 * =>
		 * 초기화;
		 * while(조건식){
		 * 		실행문;
		 * 		증감식;
		 * }
		 * for문과 달리 while문은 조건식 생략 불가능
		 * while문에서 continue 를 만나면 조건식으로 점프
		 * */
		for(int i = 1; i <=5; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		int j = 1;
		while(j <= 5) {
			System.out.print(j+" ");
			j++;
		}
		System.out.println();
		/* 짝수 출력 예제만들기 */
		j = 1;
		while(j <= 5) {
			if(j % 2 == 1) {
				j++;
				continue; //무한루프에 빠질수있으니 증감식 추가해주는게 낫다. 또는 코드변경하여야 한다
			}
			else {
				System.out.print(j+" ");
				j++;
			}
		}
		/* for문은 차례대로 증가하는 경우에 자주 사용할 수 있다. ex) 1씩, 2씩증가 ..etc // 증감식이 꼭 필요한 경우 
		 * while문은 입력받은 값을 이용하여 반복문을 유지하는 경우
		 * */
		Scanner scan = new Scanner(System.in);
		int menu = -1;
		while(menu != 4) {
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
		System.out.println("프로그램 종료합니다.");
		scan.close();
	}

}

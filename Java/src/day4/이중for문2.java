package day4;

public class 이중for문2 {

	public static void main(String[] args) {
		/* 이중 반복문을 이용하여 아래와 같이 출력되도록 코드작성
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		int i, j;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* 이중 반복문을 이용하여 별로 이루어진 삼각형 출력
		 * 
		 */
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* 우측정렬된 삼각형만들기 
		 */
		int k;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5-i ; j++) {
				System.out.print(" ");
			}
			for(k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
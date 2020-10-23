package day5;

public class 알파벳문제 {

	public static void main(String[] args) {
		/* a-z 까지 반복문을 이용하여 출력하는 예제 
		 * */
		for(char ch ='A'; ch <= 'Z'; ch++) {
			System.out.print(ch+" ");
		}
		/* 다음과 같이 출력하도록 코드를 작성하세요.
		 * A
		 * AB
		 * ABC
		 * ABCD
		 * ABCDE
		 * ABC.........XYZ*/
		System.out.println();
		for(int i = (int)'A'; i <= (int)'Z'; i++) { //내가한것.
			for(char ch = 'A'; ch <= i; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		for(char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
			for(char ch2 = 'A'; ch2 <=ch1; ch2++) { //선생님이 한것
				System.out.print(ch2);
			}
			System.out.println();
		}
	}
}

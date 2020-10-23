package day5;

import java.util.Scanner;

public class 나홀로예제만들기 {
	public static void main(String[] args) {
		/* while 문을 이용하여 배열 arr1 arr2 복사 및 출력하는 코드만들기*/
		int x=0;
		Scanner scan = new Scanner(System.in);
		int arr1[]=new int[] {1,2,3,4,5};
		int arr2[]=new int[arr1.length*2];
		System.out.print("arr1의 배열은? : ");
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		while(x!=6) {
			System.out.println("arr1을 arr2로 복사하기(arr2의 첫번째자리부터 이동)");
			System.out.println("1.arr1의 1번째자리부터 복사하기");
			System.out.println("2.arr1의 2번째자리부터 복사하기");
			System.out.println("3.arr1의 3번째자리부터 복사하기");
			System.out.println("4.arr1의 4번째자리부터 복사하기");
			System.out.println("5.arr1의 5번째자리부터 복사하기");
			System.out.println("6.프로그램 종료하기");
			System.out.print("항목을 눌러주세요. : ");
			x = scan.nextInt();
			switch(x) {
				case 1:{
					System.arraycopy(arr1, x-1, arr2, 0, arr1.length);
					System.out.println("arr1의 1번째 자리부터 복사하기");
					System.out.print("{");
					for(x=0; x<arr2.length;x++) {
						System.out.print(" "+arr2[x]+" ");
					}
					System.out.println("}");
					for(x=0; x<arr2.length;x++) {
						arr2[x]=0;
					}
					break;
				}
				case 2:{
					System.arraycopy(arr1, x-1, arr2, 0, arr1.length-1);
					System.out.println("arr1의 2번째 자리부터 복사하기");
					System.out.print("{");
					for(x=0; x<arr2.length;x++) {
						System.out.print(" "+arr2[x]+" ");
					}
					System.out.println("}");
					for(x=0; x<arr2.length;x++) {
						arr2[x]=0;
					}
					break;
				}
				case 3:{
					System.arraycopy(arr1, x-1, arr2, 0, arr1.length-2);
					System.out.println("arr1의 3번째 자리부터 복사하기");
					System.out.print("{");
					for(x=0; x<arr2.length;x++) {
						System.out.print(" "+arr2[x]+" ");
					}
					System.out.println("}");
					for(x=0; x<arr2.length;x++) {
						arr2[x]=0;
					}
					break;
				}
				case 4:{
					System.arraycopy(arr1, x-1, arr2, 0, arr1.length-3);
					System.out.println("arr1의 4번째 자리부터 복사하기");
					System.out.print("{");
					for(x=0; x<arr2.length;x++) {
						System.out.print(" "+arr2[x]+" ");
					}
					System.out.println("}");
					for(x=0; x<arr2.length;x++) {
						arr2[x]=0;
					}
					break;
				}
				case 5:{
					System.arraycopy(arr1, x-1, arr2, 0, arr1.length-4);
					System.out.println("arr1의 5번째 자리부터 복사하기");
					System.out.print("{");
					for(x=0; x<arr2.length;x++) {
						System.out.print(" "+arr2[x]+" ");
					}
					System.out.println("}");
					for(x=0; x<arr2.length;x++) {
						arr2[x]=0;
					}
					break;
				}
			}
		}
		System.out.println("6번을 누르셨습니다. 종료합니다.");
		scan.close();
	}
}
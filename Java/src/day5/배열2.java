package day5;

import java.util.Scanner;

public class 배열2 {
	public static void main(String[] args) {
		/* 배열 복사
		ㅡ일반 변수복사
		int num1 = 10, num2;
		num2 = num1 ;
		ㅡ배열 복사 (공유개념이라 복사할때 유의해야할 것)
		int arr1[] = new int[]{1,2,3,4,5};
		int arr2[] = arr1; //이렇게 복사하면 안된다.
		arr2[0] = 100;
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr2[0] : " + arr2[0]); //결과는 arr1[0] : 100 , arr2[0] : 100이 된다.
		*/
		int arr1[] = new int[] {1,2,3,4,5};
		//int arr2[] = arr1; 이렇게 복사하면 안된다.
		int arr2[] = new int[arr1.length];  
		//복사할 배열보다 크거나 같은 길이의 배열 선언하고 반복문을 통해 복사한다.
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		arr2[0]=100;
		System.out.printf("arr1[0] : %d%n",arr1[0]);
		System.out.printf("arr2[0] : %d%n",arr2[0]);
		//System.arraycopy 를 이용한 배열 복사.
		System.out.println();
		
		System.out.println("System.arraycopy를 이용한 배열 복사");
		int arr3[] = new int[arr1.length*2];
		System.arraycopy(arr1, 1, arr3, 0, arr1.length-1);
		 //System.arraycopy(src, srcPos, dest, destPos, length);
		System.out.print("배열 arr1[]  :  "); //arr1 출력코드
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.print("배열 arr3[]  :  "); //arr3 출력코드
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		
		//Scanner 를 통해 배열의 값 저장하고 출력하는 코드
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(i+1+"번째 정수를 입력 : ");
			arr1[i]=scan.nextInt();
		}
		scan.close();
		System.out.print("배열 arr1[]  :  "); 
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		//
		
	}
}

package day5;

public class 배열1 {
	public static void main(String[]args) {
		/* 배열: 같은 타입, 같은 의미의 변수들의 집합
		 * 배열 선언 방법(배열은 참조변수)
		 * 1.타입[]배열이름;
		 * 2.타입 배열이름[];
		 * 배열 선언 및 초기화
		 * 타입[]배열이름 = new 타입[길이]; //가장많이 사용하는 방법! 타입의 초기값으로 초기화
		 * 타입[]배열이름 = new 타입[]{a,b,c,....}
		 * 타입[]배열이름 = {a,b,c,...} //반드시 선언과 동시에 초기화할 때 사용한다.
		 * 배열의 길이는 0이상이어야 한다.
		 * */
		int []arr1, arr2; //arr1 은 배열 , arr2는 배열
		int arr3[] = {1,2,3,4,5}, arr4; //arr3 은 배열 , arr4는 변수 헷갈리지말것..!!
		arr1 = new int[5]; //길이가 5인 배열arr1생성 ...가장 많이쓰이는 방법
		arr2 = new int[] {1,2,3,4,5};
		/* 배열은 반복문을 이용할 수 있기 때문에 편리하다.
		 * 배열의 값을 사용하기 위해서는 다음과 같이 사용한다.
		 * 배열이름[번지] ex) arr1[0] // arr1은 길이가 5인 배열으로 0 1 2 3 4 의 주소를 가지고 있다.
		 * System.out.Print(arr1[0]);
		 * 
			System.out.println("배열 arr1의 1번째 값 ? : "+arr1[0]);
			System.out.println("배열 arr1의 2번째 값 ? : "+arr1[1]);
			System.out.println("배열 arr1의 3번째 값 ? : "+arr1[2]);
			System.out.println("배열 arr1의 4번째 값 ? : "+arr1[3]);
			System.out.println("배열 arr1의 5번째 값 ? : "+arr1[4]);
			System.out.println();
			System.out.println("배열 arr2의 1번째 값 ? : "+arr2[0]);
			System.out.println("배열 arr2의 2번째 값 ? : "+arr2[1]);
			System.out.println("배열 arr2의 3번째 값 ? : "+arr2[2]);
			System.out.println("배열 arr2의 4번째 값 ? : "+arr2[3]);
			System.out.println("배열 arr2의 5번째 값 ? : "+arr2[4]);
			//배열의 번지가 범위를 넘어가는경우 에러메시지 뜸 ArrayIndexOutOfBoundsException
		 * 배열의 길이는 배열이름.length로 알 수 있다.
		*/
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("배열 arr1의"+(i+1)+"번째 값 ? : "+arr1[i]);
		}
		System.out.println();
		arr2[0] = 10;
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("배열 arr2의"+(i+1)+"번째 값 ? : "+arr2[i]);
		}
		System.out.println();
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("배열 arr3의"+(i+1)+"번째 값 ? : "+arr3[i]);
		}
		System.out.println();
		//int []arr5 = null;
		//System.out.println(arr5.length); 길이확인이 안되는 이유는 배열선언만 하고 초기화를 하지 않았기 때문이다.
		
		/* 10개 짜리 정수 배열 arr6를 생성하여 arr6에 1부터10까지 저장하고 출력하는 코드를 작성하시오.
		 * 
		 * */
		int arr6[]= {1,2,3,4,5,6,7,8,9,10}; 
		for(int i = 0; i < arr6.length; i++) {
			System.out.println("배열 arr6의 "+(i+1)+"번째 값은 ?  :  "+arr6[i]);
		}
		System.out.println();
		/* 다른방법으로 배열 선언 및 초기화
		int []arr7 = new int[]{1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i < 10; i++) {
			System.out.println("배열 arr7의 "+(i+1)+"번째 값은 ?  :  "+arr7[i]);
		}*/
		int arr7[] = new int[10]; //배열의 길이 하나씩 정해주기 힘들때 특히 규칙성이 보이면 이렇게 사용한다.
		for(int i = 0; i < arr7.length; i++) {
			arr7[i] = i+1;
			System.out.printf("배열 arr7의 %d번째 값은 ? : %d%n",i+1,arr7[i]); //출력시 코드 간소화
		}
		
	}
}
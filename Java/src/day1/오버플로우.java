package day1;

public class 오버플로우 {

	public static void main(String[] args) {
		// 정수 값이 정해진 범위를 넘어가는 경우
		byte num = 127;
		System.out.println(num); //C언어의 printf , 콘솔에 원하는 값을 출력하는 메소드(기능)이다.
		num = (byte) (num + 1);
		System.out.println(num);
		
		int numb = Integer.MAX_VALUE;
		System.out.println(numb);
		numb = numb + 1; 
		System.out.println(numb);
		System.out.println(Integer.MIN_VALUE);
		
	}

}

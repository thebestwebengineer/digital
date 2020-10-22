package day4;

public class countinue문 {

	public static void main(String[] args) {
		/* continue는 스킵이라고 생각하면 된다
		 * for문과 while문에 따라 건너뛰는 위치가 달라진다.
		 * for문의 실행문에 continue를 만나면 증감연산식으로 이동합니다.
		 * 
		 */
		int i;
		for(i = 1; i <= 10; i++)
		{
			if(i % 5 == 0)
			{
				continue; // for문의 끝으로 이동한 후 증감연산식
			}
			System.out.print(i+" ");			
		}
		System.out.println();
		/* continue를 이용한 10이하의 짝수 출력 예제*/
		for(i = 1; i <= 10; i++)
		{
			if(i % 2 != 0)
			{
				continue;
			}
			System.out.print(i+" ");
		}
		/* continue를 이용한 10이하의 홀수 출력 예제*/
		System.out.println();
		for(i = 1; i <= 10; i++)
		{
			if(i % 2 == 0)
			{
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
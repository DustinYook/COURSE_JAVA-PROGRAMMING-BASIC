// 프로그램 설명: if문과 try,catch 블록을 이용하여 예외처리하는 방법
package p01.basic;

public class ExceptionEx3 // 클래스 
{
	public static void main(String[] args) // main 클래스 메소드 
	{
		int arr[] = { 5, 4, 3, 2, 1, 0 }; // 배열 선언과 동시에 초기화
		for (int i = 0; i < 10; i++) 
		{
			try // 예외 발생 가능성이 있는 경우를 기술
			{
				int result = 100 / arr[i]; 
				System.out.printf("[처리결과] 100 / %d = %d\n", arr[i], result);
			} 
			catch (Exception e) 
			{
				if (i >= 0 && i < arr.length) // 0인 경우 예외처리
					System.out.println("[경고] 0으로 나눌 수 없습니다. 다시 한 번 입력해주십시오.");
				else // 배열의 저장범위를 벗어난 경우 예외처리
					System.out.println("[경고] 배열의 저장값이 존재하지 않아 연산을 수행할 수 없습니다.");
			}
		} System.out.println("\n[시스템 알림] 프로그램을 종료합니다.");
	}
}
// 프로그램 설명: 아까와의 차이점은 Runnable을 구현하여 사용 
package p03.runnable;

public class MultiThreadEx3 
{
	public static void main(String[] args) // 1번.main thread
	{
		Thread t = new Thread(new SmallLetters()); // Thread 객체생성 
		// new SmallLetters(): Runnable인터페이스에는 start가 없음 => 그래서 new Thread(Runnable)을 함
//		Thread(Runnable target)
//		Allocates a new Thread object.
		t.start(); // Thread 실행
		
		char arr[] = {'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ'};
		for(char ch : arr) // 향상된 for문
			System.out.print(ch);
		
//		Runnable r = new Runnable() // 익명 클래스
//		{
//			@Override
//			public void run() 
//			{
//				for(char ch = 'a'; ch <= 'z'; ch++)
//					System.out.print(ch);
//				
//			}
//		};
	}
}
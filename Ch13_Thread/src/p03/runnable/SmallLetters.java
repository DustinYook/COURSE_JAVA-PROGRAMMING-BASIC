package p03.runnable;

// 2번.작업 thread
public class SmallLetters implements Runnable // Runnable이란 인터페이스를 구형
{
	@Override // 추상메소드 run()을 재정의
	public void run() 
	{
		for(char ch = 'a'; ch <= 'z'; ch++)
			System.out.print(ch);
	}
}
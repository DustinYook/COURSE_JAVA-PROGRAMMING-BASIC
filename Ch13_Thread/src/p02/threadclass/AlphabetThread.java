package p02.threadclass;

public class AlphabetThread extends Thread // Thread라는 클래스로부터 상속
{
	@Override // run()을 재정의
	public void run()  
	{
		for(char ch = 'A'; ch <= 'Z'; ch++) // 수행작업
			System.out.print(ch);
		
		try // 예외처리
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage()); 
		}
	}
}
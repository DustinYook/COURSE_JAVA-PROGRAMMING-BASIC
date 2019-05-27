package p01.threadclass;

//2.작업 thread 
public class DigitThread extends Thread // Thread클래스로부터 상속 
{
	@Override // annotation
	public void run() // start()를 호출해야 실행가능
	{
		for(int i = 0; i < 10; i++)
			System.out.print(i);
		System.out.println();
		
		try // 예외처리
		{
			Thread.sleep(2000);// 단위는 ms(밀리세컨드); 1,000ms = 1sec
			// 정지한 시간동안 main thread를 처리함
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		} 
	}
}
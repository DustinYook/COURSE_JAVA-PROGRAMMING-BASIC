package p02.threadclass;

public class MulitThreadEx 
{
	public static void main(String[] args) // main thread가 1개 존재 
	{
		Thread t1 = new DigitThread(); // 다형성: 부모의 눈으로 자식을 봄 
		Thread t2 = new DigitThread(); 
		Thread t3 = new AlphabetThread(); 
		
		// main thread 1개 + 작업 thread 3개 (총 4개의 thread 수행)
		t1.start(); // 부모 클래스로부터 상속받은 메소드
		t2.start();
		t3.start();
		// 주의) 순차적으로 진행되는 것이 아니라 동시에 진행 (mulit_tread의 개념) => 프로그램 상황에 따라 실행순서가 달라질 수 있음
		// 여러 흐름이 동시동작을 한다는 것이 중요!
	}
}
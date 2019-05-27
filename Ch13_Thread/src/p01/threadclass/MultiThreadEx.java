package p01.threadclass;

public class MultiThreadEx 
{
	// 1번.main thread 
	public static void main(String[] args) 
	{
		Thread t = new DigitThread(); // 다형성(polymorphism)
		t.start(); // start()가 호출되어야 run()이 실행됨 // thread를 시작 => run()을 찾아 DigitThread로 감
		// 8번과 9번 라인이 있어야 작업 thread를 실행 함 
		// *13~22번 라인은 동시에 실행됨 (mulit-thread: 작업 thread와 main thread가 동시에 진행) => 어느게 먼저 실행될지는 컴퓨터의 상황에 따라 다름 
		
		for(char ch = 'A'; ch <= 'Z'; ch++) // 자신만의 쓰레드
			System.out.print(ch);
		System.out.println();
		try 
		{
			Thread.sleep(1000); // 1초 동안 일시중지
			// 정지한 시간동안 작업 thread를 처리함
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		} 
	}
}
// 하나의 프로세스 안에서 2개의 thread(main/작업 thread)가 존재
// thread가 중요한 이유: 하나의 프로그램 내에서 여러 개의 thread를 사용하기 때문
// Runnable 인터페이스를 구현한 클래스
// Thread에 우선순위 부여
// start() -> run(): start()가 실행되야 run()을 찾아가서 실행
// sleep(): thread가 일시중지
// @FunctionalInterface: 람다식이 가능함을 표현
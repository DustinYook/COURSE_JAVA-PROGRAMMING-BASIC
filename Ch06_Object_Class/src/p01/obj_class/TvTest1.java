// 프로그램 설명: Television의 객체생성 및 사용방법 #1 (객체 인스턴스화 & 초기화)
package p01.obj_class;

public class TvTest1 
{
	public static void main(String[] args) // main 메소드
	{ // main 메소드 내에서는 순차적으로 실행됨
		// 1-1.객체선언방법 #1: 객체생성 후, 메모리할당 수행 (인스턴스화)
		Television tv1_1;
		tv1_1 = new Television(); // new연산자를 통해 클래스정의부를 복사하여 메모리에 할당
		 
		// 1-2.객체선언방법 #2: 객체생성과 동시에 메모리할당 수행 (인스턴스화)
		// Television tv1_2 = new Television(); 
		// Television: 사용자정의 자료형
		// tv1_1, tv1_2: 참조변수 (클래스 정의부의 시작주소를 저장하는 포인터상수, 배열명과 동일한 역할)
		// ctrl + 클릭: 클래스 정의부로 이동가능 (단, 역으로 돌아올 수는 없음)
		
		// 2. 멤버변수 초기화 및 호출
		tv1_1.channel = 7; // 인스턴스변수의 경우 반드시 객체생성을 해야 도트연산자를 통해 접근가능
		System.out.printf("현재채널: %d\n", tv1_1.channel); // tv1_1이라는 인스턴스 시작주소로 접근
		
		// 3. 멤버메소드 호출
		tv1_1.channelUp(); // 인스턴스메소드의 경우 반드시 객체생성을 해야 도트연산자를 통해 접근가능
		System.out.printf("바뀐채널: %d\n", tv1_1.channel);
		
		tv1_1.channelDown(); 
		System.out.printf("바뀐채널: %d\n", tv1_1.channel);
	}
}
// 프로그램 설명: Television의 클래스 정의부
package p01.obj_class;

public class Television // 클래스명
{
	// 1.멤버변수(field): 클래스 안의 변수는 전역변수 => 초기화할 필요없음
	String color; // String의 디폴트값: null
	boolean power; // boolean의 디폴트값: false
	int channel; // int의 디폴트값: 0
	
	// 2.멤버메소드(method)
	void member_method() // 참고용 메소드
	{
		int a = 0; // 메소드 안에 있는 지역변수는 반드시 초기화를 해주어야 함
		a = a + 10;
	}
	
	void power() // 전원을 ON,OFF하는 메소드
	{
		power = !power; 
	}
	
	void channelUp() // 채널을 올리는 메소드
	{
		channel++; 
	}
	
	void channelDown() // 채널을 내리는 메소드
	{
		channel--;
	}
}
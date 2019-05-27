package p08.interface_ex1;

public class Remote_Anonymous 
{
	private static final int MAX_VOLUME = 0;

	public static void main(String[] args) 
	{
		// 1.인터페이스를 이용한 경우 => 다형성: 부모가 생성된 자식을 가리킴 
		// RemoteControl r = new RemoteControl(); // 문법적 오류: 인터페이스는 객체생성불가 (추상클래스와 추상메소드를 포함하기 떄문)
		RemoteControl rr = new RemoteControlMain(); 
		
		// 중급 이상의 자바문법
		// 2.익명구현 객체를 이용한 경우  => 인터페이스와 동일한 효과 (관련:익명클래스, 8장)  #추가학습
		RemoteControl r = new RemoteControl() // 자식객체의 이름을 생략: 이것을 익명구현객체라는 용어를 씀
		{
			@Override
			public void turnOn() 
			{
				System.out.println("turnOn Overriding");
			}

			@Override
			public void turnOff() 
			{
				System.out.println("turnOff Overriding");
			}

			@Override
			public void setVolume(int volume) 
			{
				System.out.println("setVolume Overriding");
			}
			
			@Override // 디폴트 메소드를 재정의해서 씀
			public void setMute(boolean mute) 
			{
				System.out.println("setMute Overriding");
			}
		};
		r.turnOn(); // 추상메소드를 재정의 #1
		r.turnOff(); // 추상메소드를 재정의 #2
		r.setVolume(RemoteControl.MIN_VOLUME); // 추상메소드를 재정의 #3
		r.setMute(true); // default()
		System.out.println("MIN_VOLUME: " + RemoteControl.MIN_VOLUME); // 고정상수
		RemoteControl.changeBattery(); // static()
	}
}
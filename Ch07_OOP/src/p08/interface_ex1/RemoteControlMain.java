package p08.interface_ex1;

public class RemoteControlMain implements RemoteControl // 인터페이스를 구현
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

	public static void main(String[] args) 
	{
		RemoteControlMain r = new RemoteControlMain(); // 재정의 메소드를 사용하기 위해 객체생성
		r.turnOn(); // 추상메소드를 재정의 #1
		r.turnOff(); // 추상메소드를 재정의 #2
		r.setVolume(MAX_VOLUME); // 추상메소드를 재정의 #3
		r.setMute(false); // default()
		System.out.println("MAX_VOLUME: " + MAX_VOLUME); // 고정상수
		RemoteControl.changeBattery(); // static()
	}
}

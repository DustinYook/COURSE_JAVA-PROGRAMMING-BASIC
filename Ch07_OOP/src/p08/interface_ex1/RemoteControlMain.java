package p08.interface_ex1;

public class RemoteControlMain implements RemoteControl // �������̽��� ����
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
		RemoteControlMain r = new RemoteControlMain(); // ������ �޼ҵ带 ����ϱ� ���� ��ü����
		r.turnOn(); // �߻�޼ҵ带 ������ #1
		r.turnOff(); // �߻�޼ҵ带 ������ #2
		r.setVolume(MAX_VOLUME); // �߻�޼ҵ带 ������ #3
		r.setMute(false); // default()
		System.out.println("MAX_VOLUME: " + MAX_VOLUME); // �������
		RemoteControl.changeBattery(); // static()
	}
}

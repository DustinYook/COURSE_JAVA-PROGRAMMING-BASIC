package p08.interface_ex1;

public class Remote_Anonymous 
{
	private static final int MAX_VOLUME = 0;

	public static void main(String[] args) 
	{
		// 1.�������̽��� �̿��� ��� => ������: �θ� ������ �ڽ��� ����Ŵ 
		// RemoteControl r = new RemoteControl(); // ������ ����: �������̽��� ��ü�����Ұ� (�߻�Ŭ������ �߻�޼ҵ带 �����ϱ� ����)
		RemoteControl rr = new RemoteControlMain(); 
		
		// �߱� �̻��� �ڹٹ���
		// 2.�͸��� ��ü�� �̿��� ���  => �������̽��� ������ ȿ�� (����:�͸�Ŭ����, 8��)  #�߰��н�
		RemoteControl r = new RemoteControl() // �ڽİ�ü�� �̸��� ����: �̰��� �͸�����ü��� �� ��
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
			
			@Override // ����Ʈ �޼ҵ带 �������ؼ� ��
			public void setMute(boolean mute) 
			{
				System.out.println("setMute Overriding");
			}
		};
		r.turnOn(); // �߻�޼ҵ带 ������ #1
		r.turnOff(); // �߻�޼ҵ带 ������ #2
		r.setVolume(RemoteControl.MIN_VOLUME); // �߻�޼ҵ带 ������ #3
		r.setMute(true); // default()
		System.out.println("MIN_VOLUME: " + RemoteControl.MIN_VOLUME); // �������
		RemoteControl.changeBattery(); // static()
	}
}
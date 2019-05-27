package p12.innerclass.anonymous;

public class InnerMainEx1
{
	public static void main(String[] args) 
	{
		class SatelliteSender extends  MessageSender // Local Inner Class: �޼ҵ�(main)���� Ŭ���� (
		// ��øŬ����; Nested Class => �׸� �ٶ����� ���α׷��� ����� �ƴ�, �ֱٿ� Ŭ���� ���ο� Ŭ������ ���� ����
		{ // �޼ҵ� ���� ����: ��������
			@Override
			void send(String msg) 
			{
				System.out.println("�߽���: ���İ�");
				System.out.println("������: ȫ�浿");
				System.out.println("����: " + msg);
			}
		}
		
		SatelliteSender s = new SatelliteSender(); // ��ü����
		s.send("Good Morning!");
		
		EMailSender e = new EMailSender("���İ�", "��Ÿ��");
		e.send("Good Afternoon!");
		
		SMS_Sender sms = new SMS_Sender("010-4034-1075", "032-321-5365");
	}
}
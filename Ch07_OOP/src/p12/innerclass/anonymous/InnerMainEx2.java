package p12.innerclass.anonymous;

public class InnerMainEx2
{
	public static void main(String[] args) 
	{ // Local Inner Class�� �͸�Ŭ������ ����� ���
		MessageSender obj = new MessageSender() // �͸� Ŭ����: Ŭ������ �̸��� ����
		{
			@Override
			void send(String msg) 
			{
				System.out.println("�߽���: ���İ�");
				System.out.println("������: ȫ�浿");
				System.out.println("����: " + msg);
			}
		};
		
		obj.send("Good Night!");
	}
}
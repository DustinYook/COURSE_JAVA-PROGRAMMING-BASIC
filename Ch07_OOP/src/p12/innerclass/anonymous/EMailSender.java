package p12.innerclass.anonymous;

public class EMailSender extends MessageSender 
{
	String sender; // �۽���
	String receiver; // ������

	public EMailSender(String sender, String receiver) 
	{
		this.sender = sender;
		this.receiver = receiver;
	}
	
	@Override
	void send(String msg) // �߻� Ŭ������ �߻� �޼ҵ带 ��ü������ ������: ��� ����
	{
		System.out.println("������ ���: " + sender);
		System.out.println("�޴� ���: " + receiver);
		System.out.println("����: " + msg);
		System.out.println();
	}
}

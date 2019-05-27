package p12.innerclass.anonymous;

public class SMS_Sender extends MessageSender 
{
	String phoneNo;
	String responsePhoneNo;
	
	public SMS_Sender(String phoneNo, String responsePoneNo) 
	{
		this.phoneNo = phoneNo;
		this.responsePhoneNo = responsePhoneNo;
	}

	@Override
	void send(String msg) 
	{
		System.out.println("��ȭ��ȣ: " + phoneNo);
		System.out.println("����: " + msg);
		System.out.println("����: " + responsePhoneNo);
		System.out.println();
	}
}
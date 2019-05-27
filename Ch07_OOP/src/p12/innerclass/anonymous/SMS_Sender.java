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
		System.out.println("전화번호: " + phoneNo);
		System.out.println("내용: " + msg);
		System.out.println("내용: " + responsePhoneNo);
		System.out.println();
	}
}
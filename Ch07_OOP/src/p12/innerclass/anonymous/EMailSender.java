package p12.innerclass.anonymous;

public class EMailSender extends MessageSender 
{
	String sender; // 송신자
	String receiver; // 수신자

	public EMailSender(String sender, String receiver) 
	{
		this.sender = sender;
		this.receiver = receiver;
	}
	
	@Override
	void send(String msg) // 추상 클래스의 추상 메소드를 구체적으로 재정의: 상속 받음
	{
		System.out.println("보내는 사람: " + sender);
		System.out.println("받는 사람: " + receiver);
		System.out.println("내용: " + msg);
		System.out.println();
	}
}

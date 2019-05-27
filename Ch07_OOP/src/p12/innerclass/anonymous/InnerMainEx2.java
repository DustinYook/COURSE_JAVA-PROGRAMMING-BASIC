package p12.innerclass.anonymous;

public class InnerMainEx2
{
	public static void main(String[] args) 
	{ // Local Inner Class를 익명클래스로 만드는 방법
		MessageSender obj = new MessageSender() // 익명 클래스: 클래스의 이름이 없음
		{
			@Override
			void send(String msg) 
			{
				System.out.println("발신자: 알파고");
				System.out.println("수신자: 홍길동");
				System.out.println("내용: " + msg);
			}
		};
		
		obj.send("Good Night!");
	}
}
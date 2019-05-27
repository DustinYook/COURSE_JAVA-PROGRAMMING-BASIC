package p12.innerclass.anonymous;

public class InnerMainEx1
{
	public static void main(String[] args) 
	{
		class SatelliteSender extends  MessageSender // Local Inner Class: 메소드(main)안의 클래스 (
		// 중첩클래스; Nested Class => 그리 바람직한 프로그래밍 기법은 아님, 최근엔 클래스 내부에 클래스를 쓰지 않음
		{ // 메소드 안의 변수: 지역변수
			@Override
			void send(String msg) 
			{
				System.out.println("발신자: 알파고");
				System.out.println("수신자: 홍길동");
				System.out.println("내용: " + msg);
			}
		}
		
		SatelliteSender s = new SatelliteSender(); // 객체생성
		s.send("Good Morning!");
		
		EMailSender e = new EMailSender("알파고", "베타고");
		e.send("Good Afternoon!");
		
		SMS_Sender sms = new SMS_Sender("010-4034-1075", "032-321-5365");
	}
}
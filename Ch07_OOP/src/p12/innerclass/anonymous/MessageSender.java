package p12.innerclass.anonymous;

public abstract class MessageSender // 추상 클래스: 반드시 하나 이상의 추상메소드를 포함해야 함
{
	abstract void send(String msg); // 추상 메소드: 상속을 받아서 사용가능
}
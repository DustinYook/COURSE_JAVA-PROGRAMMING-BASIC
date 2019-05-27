package p06.static_instance_method;

public class CounterMain 
{
	public static void main(String[] args) 
	{
		// 개발자가 디폴트 생성자를 정의하지 않으면 컴파일러가 스스로 디폴트 생성자를 생성함
		System.out.println("객체생성횟수: " + Counter.getCount()); // 클래스 메소드 접근
		Counter c = new Counter(); // 디폴트 생성자
		System.out.println("객체생성횟수: " + Counter.getCount());
		System.out.println("객체생성횟수: " + c.num);
		
		Counter c2 = new Counter();
		System.out.println("객체생성횟수: " + Counter.count); // 클래스변수는 "클래스명.클래스변수명"의 형식으로 사용
		System.out.println("객체생성횟수: " + c2.count); // 위의 방법이 더 바람직함
		// 중요) 클래스변수 count는 객체생성 시마다 증가함
	}
}
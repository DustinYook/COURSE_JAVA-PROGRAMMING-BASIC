package p07.instance_static_initialize;

public class Good2 
{	
	// 2.초기화 블록: 생성자보다 먼저 수행할 것이 있을 때 사용 => 변수의 초기화 방법 #2
	// 1)클래스 초기화블록(class/static initial block): 객체가 처음 한 번 생성 될 때 실행됨 (한 번) => 메모리에 있음
	static
	{
		System.out.println("1.클래스 초기화블록"); // 처음 객체 생성될 때만 사용 (끝까지 메모리에 남아 있음)
	}
	// 2)인스턴스 초기화블록(instance initial block): 객체가 생성될 때마다 실행됨 (매번) => 메모리에 없음 
	{
		System.out.println("2.인스턴스 초기화 블록"); // 객체 실행 종료시 사라짐
	}
	
	// 3.생성자  => 변수의 초기화 방법 #3
	public Good2() 
	{
		System.out.println("3.생성자");
	}
	
	public static void main(String[] args) // 메소드 내부에 필드가 올 수 있음 => 여기에 선언하면 지역변수
	{
		Good2 g1 = new Good2(); // 첫번째 객체생성
		Good2 g2 = new Good2(); // 두번째 객체생성
		Good2 g3 = new Good2(); // 세번째 객체생성
		System.out.println("4.main()"); // 실행되는 순서가 매우 중요!
	}
}
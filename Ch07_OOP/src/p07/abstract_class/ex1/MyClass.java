package p07.abstract_class.ex1;

// 추상메소드가 있으면 반드시 abstract를 붙여야 함!
public abstract class MyClass // abstract가 붙으면 객체생성 불가
{
	// 멤버변수(field)
	int num = 3; // 인스턴스 변수
	
	public MyClass() // 디폴트 생성자
	{
	}
	
	public MyClass(int n) // 생성자
	{
		this.num = n;
	}
	
	// 멤버메소드
	public void methodA() // 인스턴스 메소드(일반메소드)
	{
		System.out.println("methodA()");
	}
	
	// 추상메소드: 자식클래스에서 상속받아 재정의해서 사용
	public abstract void methodB(); // 메소드의 몸체(Body)가 없음
//	public void methodC(); // 이렇게는 못씀
}

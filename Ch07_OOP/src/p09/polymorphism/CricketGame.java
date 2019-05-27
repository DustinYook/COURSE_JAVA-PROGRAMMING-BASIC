package p09.polymorphism;

public class CricketGame extends Game // Game으로부터 상속받는 클래스
{
	// 일반 메소드였기 때문에 재정의 되지 않음
	@Override // 부모가 가진 일반메소드를 선택적으로 재정의해서 쓸 수 있음 (단, 추상 메소드의 경우 재정의 필수)
	public void type() 
	{
		System.out.println("선택적 재정의 type()");
	}
	
	public void write()
	{
		System.out.println("CricketGame.write()");
	}
	
	public void over() // 재정의 된 경우 부모의 재정의 되기 전 메소드를 사용하는 방법 (간접적 호출방법)
	{
		super.type();
	}
}
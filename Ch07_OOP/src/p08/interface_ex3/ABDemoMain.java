package p08.interface_ex3;

public class ABDemoMain 
{
	public static void main(String[] args) 
	{
		// 1.인터페이스를 구현한 클래스를 사용하는 경우
		ABDemo ab = new ABDemo(); // 객체 생성할 때는 부모객체보다 자식객체를 생성하여 쓰는 것이 효율적 (자식객체 생성시 자동으로 부모객체생성)
		ab.print();
		ab.write();
		System.out.println();
		
		// 2-1.구현된 인터페이스 중 하나를 사용하는 경우
		Ademo a = new ABDemo(); // 다형성: 부모 중에 하나의 눈으로 자식을 가리킴 (부모가 둘)
		a.write();
		((ABDemo)a).print(); // 자식만 갖고 있는 메소드는 형변환을 해주어야만 보임 => 부모의 눈에 자식의 안경을 씌움
		System.out.println();
		
		// 2-2.구현된 인터페이스 중 하나를 사용하는 경우
		Bdemo b = new ABDemo(); // 다형성: 부모 중에 하나의 눈으로 자식을 가리킴 (부모가 둘)
		b.print();
		((ABDemo)b).write(); // 타입의크기는 자식보다 부모가 큰데  반해, 자식이 더 많은 세세한 사항을 포함할 수 있음 
		// 부모의 눈높이를 자식의 눈높이로 맞추어 주어야 보임! 
		System.out.println();
		
//		Bdemo str = new String(); // 상속이 전제되지 않은 경우 다형성이 불가
		// 다형성, 추상클래스, 인터페이스 => 모두 상속이 전제되어야 함!
	}
}
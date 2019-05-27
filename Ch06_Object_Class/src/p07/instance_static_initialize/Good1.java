package p07.instance_static_initialize;

public class Good1 
{
	// 클래스 내부에 필드가 올 수 있음 => 여기에 선언하면 전역변수
	// 인스턴스 변수: 객체생성 후 사용가능
	int b; // 디폴트값: 0
	float f; // 디폴트값: 0.0
	double d; // 디폴트값: 0.0
	boolean aa; // 디폴트값: false(0)
	char ch; // 디폴트값: "u000" (unicode의 000)
	String str; // 디폴트값: null
	
	
	public static void main(String[] args) // 메소드 내부에 필드가 올 수 있음 => 여기에 선언하면 지역변수
	{
		Good1 g = new Good1();
		System.out.println(g.b); 
		System.out.println(g.f);
		System.out.println(g.d);
		System.out.println(g.aa);
		System.out.println(g.ch);
		System.out.println(g.str);
		
		// 1.명시적 초기화 => 변수의 초기화 방법 #1
		int a = 0; // 지역변수의 경우 명시적 초기화 반드시 필요
		System.out.println(a);
	}
}
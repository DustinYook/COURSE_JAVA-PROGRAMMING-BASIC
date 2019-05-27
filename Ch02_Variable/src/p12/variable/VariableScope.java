package p12.variable;

public class VariableScope 
{
	// static이 붙으면 RAM에 올라왔다는 의미
	// 전역변수(Global variable): 클래스 안에 있는 변수, 메소드 안에서 사용가능
	static int a; // 전역변수는 초기화를 하지 않아도 됨 (전역변수를 초기화하지 않으면 디폴트 값이 0이 들어있음)
	int b; // static을 쓰지 않은 전역변수는 메모리에 올라오지 않음, 메소드 안에서 사용불가 => 객체생성
	static int c = 3; // 모든 변수를 static으로 선언하면 안됨 => 메모리 낭비가 발생
	
	
	public static void main(String[] args) // main 메소드 (앞에 static이 붙음 => 메모리에 있음)
	{
		a = a + 10; // 메소드 안에서 전역변수에 접근가능
		System.out.println(a);
		// b = 20; // 메모리에 올라와 있지 않기 때문에 사용불가
		System.out.println(c);
		
		// 객체생성
		VariableScope v = new VariableScope(); // v:참조변수, VariableScope:타입
		System.out.println(v.b); // 객체 v에 존재하는 b 멤버변수에 접근
		
		// 지역변수(Local Variable): 메소드 안에 있는 변수
		int v1 = 0; // 지역변수는 반드시 초기화를 해야함
		v1 = v1 + 10; 
	}
}
// 메모리에 올리는 방법: static 사용 or 객체생성
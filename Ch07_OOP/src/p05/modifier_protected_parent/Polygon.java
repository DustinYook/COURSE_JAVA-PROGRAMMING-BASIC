package p05.modifier_protected_parent;

public class Polygon // 부모클래스 // 클래스 앞에는 public,default,abstract만 가능
{
	protected int x[]; // protected - 1)동일패키지 내 사용가능 2)패키지다른 자식클래스에서 사용가능
	protected int y[]; // int형 배열변수
	
	public Polygon(int v) // 생성자
	{
		// x[] = new int[v]; // 주의) 이렇게 쓰면 안됨
		x = new int[v]; // v는 배열의 칸 수를 의미
		y = new int[v]; 
	}
	
	protected void setPoint(int index, int a, int b) 
	// protected 붙은 것만 다른 패키지 내 자식클래스에서 사용가능 (안붙은 것은 사용불가)
	{
		this.x[index] = a;
		this.y[index] = b;
	}
} // 접근제어자의 역할: 보안유지
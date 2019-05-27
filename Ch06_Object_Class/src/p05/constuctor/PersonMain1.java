package p05.constuctor;

public class PersonMain1
{
	// field(전역변수, 공용변수)
	int b; // 1)인스턴스 변수: 객체를 생성해서 사용
	static int c; // 2)클래스 변수: 도트연산자를 이용해서 접근
	
	public static void main(String[] args)  // 메모리에 올라와 있음 (static 있음)
	{
		Person p1 = new Person(); // 객체생성 (인스턴스화)
		p1.name = "홍길동";
		p1.age = 21;
		System.out.printf("%s, %d세\n", p1.name, p1.age);
		
		int a = 0; // 지역변수: 메소드 안의 변수, 반드시 초기화 필요, 선언된 블록 내에서만 유호
		System.out.print(a + " ");
		
		PersonMain1 p2 = new PersonMain1();
		System.out.print(p2.b + " "); 
		
		System.out.print(PersonMain1.c + " ");
		System.out.print(c); // 같은 클래스내에 있으므로 클래스명 생략가능
	}
}
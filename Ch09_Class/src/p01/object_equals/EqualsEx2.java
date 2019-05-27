package p01.object_equals;

public class EqualsEx2 
{
	public static void main(String[] args) 
	{
		// 내용은 다 같으나 가르키는 주소값은 다름
		Circle c1 = new Circle(5); // 첫번째 객체생성
		Circle c2 = new Circle(5); // 두번째 객체생성
		// object는 모든 클래스가 자연상속 받음
		
		if(c1.equals(c2)) // 재정의 하지 않으면 객체의 주소값끼리 비교 (객체 간 비교) => equals() 재정의 필요
			System.out.println("같음"); 
		else
			System.out.println("다름");
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
	}
}
// equals()와 비교연산자(==)는 다름!
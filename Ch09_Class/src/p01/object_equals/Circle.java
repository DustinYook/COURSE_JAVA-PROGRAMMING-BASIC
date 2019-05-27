package p01.object_equals;

public class Circle 
{
	int radius; // c1 = 5

	public Circle(int radius) // 생성자
	{
		this.radius = radius;
	} 
	
	@Override // equal()를 재정의: 주소값 비교를 저장값(내용)비교로 전환
	public boolean equals(Object obj) // 대표 명칭을 부모 클래스로 해 놓음 
	{
		// instanceof: 참조변수가 해당 클래스를 가르키는지 비교 
		if(!(obj instanceof Circle)) // c2가 Circle이라는 클래스를 가르키고 있는지 판단
			return false;
		// 부모 클래스의 타입이 자식 클래스의 타입보다 큼
	    Circle c = (Circle) obj; // 부모에게 자식의 안경을 씌움 => 강제 형변환 (큰 타입을 작은 타입으로)
		
		if(this.radius == c.radius) // c1.radius == c2.radius
			return true;
		else
			return false;
	}
}
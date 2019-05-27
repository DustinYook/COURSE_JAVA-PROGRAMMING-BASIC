package p03.modifier_private;

public class Circle 
{
	// private: 클래스 안에서만 사용가능
	// private double radius; 
	double radius;
	
	public Circle(double r) // 생성자 
	{
		this.radius = r; 
	}
	
	double getArea() // 인스턴스 메소드 // 제어자가 디폴트: 같은 패키지에서 접근가능
	{
		double area;
		area = 3.14*(radius*radius);
		return area;
	}
}
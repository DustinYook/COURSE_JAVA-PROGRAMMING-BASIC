package p03.modifier_private;

public class ModifierEx1 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle(2.0);
//		c.radius = 5.0; // 멤버변수가 private로 설정되었으므로 도트연산자로 접근불가
		double result = c.getArea();
		System.out.println("원의 면적: " + result);
	}
}
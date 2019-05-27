package p05.modifier_protected_child;
import p05.modifier_protected_parent.Polygon; // 자식클래스
// 부모클래스의 protected 설정은 패키지가 다른 자식클래스에서의 사용을 허용

public class Square extends Polygon // 다각형에서 상속받은 사각형
{
	public Square(int x, int y, int sideLength) // 생성자 
	{
		super(4); // 부모클래스의 생성자호출
		setPoint(0, x, y);
		setPoint(1, x+sideLength, y);
		setPoint(2, x+sideLength, y+sideLength);
		setPoint(3, x+sideLength, y+sideLength);
	}
	
	public int getX(int index)
	{
		return x[index];
	}
	
	public int getY(int index)
	{
		return y[index];
	}
}
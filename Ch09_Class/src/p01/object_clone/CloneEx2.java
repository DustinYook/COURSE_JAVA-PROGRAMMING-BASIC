package p01.object_clone;

public class CloneEx2 
{
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = (Rectangle) r1.clone(); 
		// 주소값이 다르므로 형 변환 해야 함 => clone()을 사용하기 위해서는 재정의 필요
		System.out.println("r1: " + r1.width + " " + r1.height);
		System.out.println("r2: " + r2.width + " " + r2.height);
	}
}
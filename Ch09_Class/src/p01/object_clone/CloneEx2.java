package p01.object_clone;

public class CloneEx2 
{
	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = (Rectangle) r1.clone(); 
		// �ּҰ��� �ٸ��Ƿ� �� ��ȯ �ؾ� �� => clone()�� ����ϱ� ���ؼ��� ������ �ʿ�
		System.out.println("r1: " + r1.width + " " + r1.height);
		System.out.println("r2: " + r2.width + " " + r2.height);
	}
}
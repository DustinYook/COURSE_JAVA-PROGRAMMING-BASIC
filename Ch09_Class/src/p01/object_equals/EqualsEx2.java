package p01.object_equals;

public class EqualsEx2 
{
	public static void main(String[] args) 
	{
		// ������ �� ������ ����Ű�� �ּҰ��� �ٸ�
		Circle c1 = new Circle(5); // ù��° ��ü����
		Circle c2 = new Circle(5); // �ι�° ��ü����
		// object�� ��� Ŭ������ �ڿ���� ����
		
		if(c1.equals(c2)) // ������ ���� ������ ��ü�� �ּҰ����� �� (��ü �� ��) => equals() ������ �ʿ�
			System.out.println("����"); 
		else
			System.out.println("�ٸ�");
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
	}
}
// equals()�� �񱳿�����(==)�� �ٸ�!
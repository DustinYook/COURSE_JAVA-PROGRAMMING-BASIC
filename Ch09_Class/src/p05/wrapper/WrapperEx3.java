package p05.wrapper;

public class WrapperEx3 
{
	public static void main(String[] args) 
	{
		printDouble(new Double(123.45)); // ��ü���� => new Double(123.45)�� Ŭ���� Double Ÿ��
		printDouble(123.45); // 123.45�� 123.45D�� �⺻�� double Ÿ���� => �ڵ�����ȯ�� �Ͼ�� ������ �߻����� ����
	}
	
	static void printDouble(Double obj) // Ŭ�����޼ҵ� 
	{
		System.out.println(obj);
	}
	
}
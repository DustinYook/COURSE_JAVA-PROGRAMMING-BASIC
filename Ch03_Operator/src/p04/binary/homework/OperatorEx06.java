package p04.binary.homework;

public class OperatorEx06 
{
	public static void main(String[] args) 
	{
		byte a = 10;
		byte b = 20;
		
		byte c1 = (byte) (a + b); 
		System.out.println(c1); // byte�� ������� ���ؼ��� ���������ȯ �ʿ�
		
		int c2 = a + b; // ������ ������ �⺻������ int�� �ٲپ� �̷�� ��  
		System.out.println(c2); // ����� int
	}
}
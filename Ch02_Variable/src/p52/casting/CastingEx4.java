// ���α׷� ����: �������� �Ǽ��� ���� ����ȯ ����
package p52.casting;

public class CastingEx4 
{
	public static void main(String[] args) 
	{
		int i = 91_234_567; // 8�ڸ��� 10����
		System.out.printf("i=%d\n", i); 
		
		float f = (float)i; // int�� float���� ����ȯ
		int i2 =  (int)f; // float�� int�� ����ȯ
		System.out.printf("f=%f, i2=%d\n", f, i2); // ����
		
		double d = (double)i; // int�� double�� ����ȯ
		int i3 = (int)d; // double�� int�� ����ȯ
		System.out.printf("d=%f, i3=%d\n", d, i3);
		
		float f2 = 1.666f; // �Ҽ��� ���� 3�ڸ��� �Ǽ�
		int i4 = (int)f2; // float�� int�� ����ȯ
		System.out.printf("(int)%f=%d\n", f2, i4);
	}
}
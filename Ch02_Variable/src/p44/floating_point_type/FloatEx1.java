// ���α׷� ����: �ε��Ҽ��� ǥ������� ��¿���
package p44.floating_point_type;

public class FloatEx1 
{
	public static void main(String[] args) 
	{
		System.out.printf("     123456789012345678901234\n");
		
		float f1 = 9.12345678901234567890f;
		System.out.printf("f1 :   %f\n", f1); // %f�� ����Ʈ���� �Ҽ��� ���� 6° �ڸ����� ���
		System.out.printf("f1 : %24.20f\n",f1); // 24ĭ�� Ȯ��, �Ҽ��� ���� 20° �ڸ����� ���
		
		float f2 = 1.2345678901234567890f; // f�� �����Ұ�
		System.out.printf("f2 : %24.20f\n", f2);
		
		double d = 9.12345678901234567890d; // d�� ��������
		System.out.printf("d  : %24.20f\n", d);
	}
}
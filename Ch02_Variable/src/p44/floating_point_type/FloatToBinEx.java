// ���α׷� ����: �ε��Ҽ����� ���� ������ �˾ƺ��� ���� ����
package p44.floating_point_type;

public class FloatToBinEx 
{
	public static void main(String[] args) 
	{
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f); 
		// floatToIntBits()��� ����޼ҵ�� float�� ���� int�� ������ ��ȯ���ִ� ���� ����
		
		System.out.printf("%f\n", f);
		System.out.printf("%#X\n", i); // 16������ ���
	}
}
// ����) %x�� %X�� ������
// %x�� 16������ 10�̻��� ǥ�� A~F�� �ҹ��ڷ� ǥ�� => ��) 10���� 10�� a�� ǥ��
// %X�� 16������ 10�̻��� ǥ�� A~F�� �빮�ڷ� ǥ�� => ��) 10���� 10�� A�� ǥ��
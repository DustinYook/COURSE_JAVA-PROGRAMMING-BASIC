package p20.datatype;

public class FloatDouble 
{
	public static void main(String[] args) 
	{
		// �Ǽ���
		double d1 = 3.14d; // double�� 8����Ʈ
		// double d1 = 3.14; // ���� ���� ǥ��
		// double d1 = 3.14D; // ���� ���� ǥ��
		float f1 = 3.14f;
		// float f1 = 3.14; // L-value�� float������ 4����Ʈ, R-value�� double������ 8����Ʈ => ����������(������ ����)
		
		float f2 = (float)3.14; // ǥ������ ������ �����(����)����ȯ�� �ϸ� ������ �ҽ��� �߻����� ���� 
		System.out.println(f2);
		
		float f3 = (float)3.0000000000000000000000000000014; // ǥ������ ������ �����(����)����ȯ�� �ϸ� ������ �ҽ��� �߻����� ���� 
		System.out.println(f3); // ǥ�������� ��� ���¿��� ����� ����ȯ�� �ϸ� ������ �ҽ��� �߻��� (��ȿ�ڸ� ���ڸ� ǥ��)
		System.out.printf("%f\n", f3); // %f�� �⺻������ �Ҽ��� ���� 6�ڸ����� ���
		
		float f4 = (float)3.00014; 
		System.out.println(f4);
		
		final int MAX_VALUE = 100; // final(������)�� �پ��ִ� ���� ������ ���ȭ ��Ŵ (�������)
		// final�� C���� constŰ����� ������ ������ ����
		// MAX_VALUE = 200; // ����� �빮�ڷ� ǥ���ϰ� final�� ����, ����� ���� ������ �� ����
		
		System.out.println("aaaa" +  75 + 100); // ��°��: aaaa75100 (concatenate �����)
		System.out.println("aaaa" + (75 + 100)); // ���Ῥ�� �ڿ� +�� ���������ڷ� ���� ���ؼ��� ��ȣ�� �����
		System.out.println(75 + 100 + "aaaa");  // +�� C����� strcat�Լ��� ����
		
		int age = 30;
		System.out.printf("age: %d", age); // d�� decimal(10����)�� ����
		
		System.out.println('\'');
	}
}
// ����ȯ: ���������ȯ(��������ȯ) or ����������ȯ(�ڵ�����ȯ) => ���������ȯ���� �����ͼҽ��� �����ؾ� �Ѵ�!
// ���ͷ�: ������ ����� �� ��ü (������), ���: ����� ���� ������ �� ���� => �� ��Ȯ�ϰ� ������ ��!
// 2������ 0�� 1�� ��� ���ڸ� ǥ�� 
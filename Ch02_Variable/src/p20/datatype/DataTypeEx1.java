package p20.datatype;

public class DataTypeEx1 
{
	public static void main(String[] args) 
	{
		// 1. �⺻��Ÿ��(Primitive Datatype): ������ ���� ���� ����Ǿ� �ִ� ����
		// 1) ������ => int�� ����Ʈ��
		byte t = 127; // ǥ������: -128 ~ 127 (1����Ʈ) => ǥ������ �Ѿ�� ���������� �߻�
		short s = 32767; // ǥ������: -32768 ~ 32767 (2����Ʈ)
		int n = 2147483647; // (4����Ʈ)
		long l = 2000000000L; // (8����Ʈ) long type������ L�� ���־�� ��
		// 2) �Ǽ��� => double�� ����Ʈ��
		float f = 3.14f; // float�� ����ϱ� ���ؼ��� ��������� fǥ�� (4����Ʈ) 
		double d = 3.14; // *�Ǽ����� ����Ʈ �ڷ��� (�Ǵ� ��������� d) (8����Ʈ)
		// 3) ������
		char c = 'A'; // char c = 'AA'; (���ڸ� �ΰ� ������ �� ����) (2����Ʈ; C������ 1����Ʈ)
		// 4) ����: true �Ǵ� false�� ������ �� ����
		boolean b1 = true; // ����ġ�� ���� ���� (1����Ʈ)
		boolean b2 = false; // ����ġ�� ���� ����
		
		// 2. ������Ÿ�� (Reference Datatype) : ������ �ּҰ��� ����ִ�.		
		String str = "AAAA";
		System.out.println(t); // ctrl + alt + ����Ű(��): �ٺ���
		System.out.println(s);
		System.out.println(n);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(str);	
	}
} // �⺻���� �������� �ݵ�� �����ؼ� ����ؾ���
// ������ Ÿ���� �����ϴ� ����: �޸� ������ ȿ�������� �̿��ϱ� ����
// ���� ��Ȳ�� ���� �䱸�Ǵ� �ڷ����� ����ϴ� ���� ����
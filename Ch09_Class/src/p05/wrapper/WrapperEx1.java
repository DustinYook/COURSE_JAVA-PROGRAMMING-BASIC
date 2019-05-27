package p05.wrapper;
// �⺻�� Ÿ��: int,long,char,boolean,float,double,byte,short
// ������ Ÿ��: Integer, Long, Character, Byte, Boolean, Float, Double => ������ Ÿ���� ���ؼ� wrapperŬ������ ��
// Wrapper Class: ������ Ÿ���� ��ü������ ǥ���ϴ� ��� => Wrapper Class�� Ŭ������ API�� �������� ���� (�̵��� ���ؼ� �θ��� ���)
// �⺻�� Ÿ���� ���� �� Ȱ���ϱ� ���� �����ϴ� Ŭ������ wrapper class��
// �⺻�� -> ������: Boxing, ������ -> �⺻��: UnBoxing
public class WrapperEx1 
{
	public static void main(String[] args) 
	{
		int i = 10; // �⺻��Ÿ��
		Integer intg = (Integer)i; // (Integer) => ����ȯ ��������
		// Integer: Ŭ����, intg: ��������(��ü) => ����������
		Object obj = (Object) i; // (Object) => ����ȯ ��������
		Long l = (Long) 1000L; // (Long) => ����ȯ ��������
		// Long�� ���� �빮�ڷ� ���� Ŭ����, long�� �⺻��Ÿ��  // R_Value�� �⺻�� Ÿ���� L���� �� �� ����
		
		int i2 = intg+10; // �������� �⺻������ ������ ������
		long l2 = intg+l; // ������ ���� ���갡��
		Integer intg2 = new Integer(20); 
		int i3 = (int)intg2; // ����������ȯ�� �Ͼ�� ���������ȯ ���־ ��
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(intg);
		System.out.println(intg2);
		System.out.println(l);
		System.out.println(l2);
	}
}
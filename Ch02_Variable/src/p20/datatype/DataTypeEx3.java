package p20.datatype;

public class DataTypeEx3 
{
	public static void main(String[] args) 
	{
		short s = 12; // 12�� s��� ���������� ����
		int n = s; // short�� ���尪�� int�� ������ ����
		
		char c = 'A'; // ���ڻ�� A�� ASCII �ڵ尪�� 65
		System.out.println(c); // ��°��: A
		int n2 = c+1; // A�� ASCII �ڵ尪 65�� 1�� ���� 66�� ����
		System.out.println(n2); // ��°��: B
		System.out.println((char)n2);
		
		int x = 123; // ������ ���� �����ݷ�
		float y = x + 12.3f; // f�� ��������� �� ���� ������ double�� �ν� 
		// ������ �����ϱ� ���ؼ��� �ǿ����ڰ� ���� �ڷ����̿��� ��
		// ��, int�� ������ �� ū �ڷ����� float������ ������ ����ȯ �� ���������� �����ϰ� ��
		// f�� ���ִ� ����: �޸� ������ ȿ�������� �̿��ϱ� ���� (float�� 4����Ʈ, double�� 8����Ʈ)
		System.out.println(y);
		
		short s1 = 10; // 32767
		short s2 = 20; // 32767
		int z = s1 + s2; // int���� ������ int�� �������� ����
		System.out.println(z);
	}
}
// ������ Ÿ��: �⺻�� Ÿ���� ������ ��� Ÿ�� => ex) string
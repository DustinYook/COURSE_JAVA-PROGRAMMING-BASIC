package p21.datatype.casting;

public class CastingEx 
{
	public static void main(String[] args) 
	{
		int v1 = 44032;
		char c = (char) v1; // �����(����)����ȯ: �⺻�� Ÿ�Կ��� ����
		System.out.println(c); 
		
		long l1 = 500;
		v1 = (int)l1; // ū Ÿ�Կ��� ���� Ÿ������ �� ��ȯ
		System.out.println(v1);
		
		double d = 333333333333333333333333333333333333333333.1422222222222222222222222; // double���� �����δ� 52��Ʈ���� ǥ������
		v1 = (int) d; // int�� �Ҽ��� ���ϰ� ���� => �Ҽ��� ���� �ڸ��� �߷����� (int ǥ������ ��ġ�� ǥ�������� �ִ��� ���)
		System.out.println(v1);
		System.out.println(v1 * l1); // ������� �ǿ�����(operand)�� ������(operator)�� ����
		
		String s = "1234"; 
		int s_mobile = Integer.parseInt(s);
		System.out.println(s_mobile);
		// �ȵ���̵�� �ڹپ� �⺻ => ���û������ String���� ���� => ����Ʈ������ ���� ���ؼ� ���ڿ��� ���ڷ� ��ȯ�ؾ� �� (����ȯ)
	}
}
// ���� 3��� 4�� ������ ����
// ������ �����ϱ��� 3~5�� ������ ¦���� ���� �ڵ� �� �ּ��޾ƿ��� (~p227)
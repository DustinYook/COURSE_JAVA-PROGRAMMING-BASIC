package p02.for_statement;

public class ForEx1 
{
	public static void main(String[] args) 
	{
		// ����) i�� 1���� �����ϴ� �Ͱ� 0���� �����ϴ� �� ����!
		// 1���� 10���� �ݺ��Ͽ� ���ϴ� �˰���
		int total1 = 0;
		for(int i = 1; i <= 10; i++) // i�� 1���� �����ϴ� ���: ���ǽĿ� ��ȣ�� ����
			total1 += i;
		System.out.println(total1);
		
		int total2 = 0;
		for(int i = 0; i < 10; i++) //i�� 0���� �����ϴ� ���: ���ǽĿ� ��ȣ�� ��������
			total2 += (i+1); // �߰�ȣ�� ���� ��� �ٷ� �� �� �ٸ� for���� ���Ե� 
		System.out.println(total2);
		
		int total3 = 0;
		for(int i = 0; i < 10; i++) //i�� 0���� �����ϴ� ���: ���ǽĿ� ��ȣ�� ��������
		{
			total3 += (i+1); // �������� �������ؼ��� �߰�ȣ�� �̿��ؾ� ��
		} System.out.println(total3);
	}
}

		
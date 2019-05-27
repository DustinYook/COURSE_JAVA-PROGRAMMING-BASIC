package p02.throw_new;

public class ExceptionEx4 
{
	// 1.throw new Exception: ���ܸ� �߻���Ų �޼ҵ�� ����
//	public static void main(String[] args) throws Exception 
//	{
//		int sum = 1+(-2); // ������ �ƴ�
//		if(sum < 0) // sum�� 0���� ������
//			throw new Exception("Checked Exception"); // ó���� ���� (goto�� ���)
//		// main�޼ҵ�� JVM�� ȣ�� => ���ܸ� ����
//	}
	
	// 2. try, catch ���� ���� ����ó��
	public static void main(String[] args)
	{
		int sum = 1+(-2); // ������ �ƴ�
		// 1) ù��° ó�����: ó���� ������Ű�� ���
		if(sum < 0)
		{
			try
			{
				// ���ܸ� �߻���Ŵ
				throw new Exception("Checked Exception"); 
			} 
			catch (Exception e) 
			{
				System.out.println("throw�� ���� ���� �ڱ� ������ catch�� ����");
				System.out.println(e.getMessage());
			}
		} System.out.println("sum = " + sum);
	}
}
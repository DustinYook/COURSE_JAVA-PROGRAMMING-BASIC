package p02.throw_new;

public class ThrowException2 
{
	// �޼ҵ� �ȿ��� ���� �߻� �� throw new Exception���� ó��
	public static void main(String[] args) // main �޼ҵ忡 ������ ������ ������Ű�� ���� ����!
	{
		int result;
		try
		{
			result = add(1,-2); // 3�ܰ�
			System.out.println(result);
		}
		catch(Exception e)
		{
			
		}
		System.out.println(); 
	}
	
	static int add(int a, int b) throws Exception // 1�ܰ�
	{
		int result = a + b;
		if(result < 0)
		{
			throw new Exception("���Ƿ� ���ܸ� �߻���Ŵ");
		}
		return result;
	}
}
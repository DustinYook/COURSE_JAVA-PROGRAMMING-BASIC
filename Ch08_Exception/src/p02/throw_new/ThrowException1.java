package p02.throw_new;

public class ThrowException1 
{
	// �޼ҵ� �ȿ��� ���� �߻� �� try, catch ���� �̿��� ó�����
	public static void main(String[] args)// main �޼ҵ�
	{
		try 
		{
			int result = add(1,-2);
			System.out.println(result);
		} 
		catch (Exception e) 
		{
		}
		System.out.println(); 
		// try, catch ���� ���ܰ� �߻��ϴ� ������ �־�δ� ���� ����!
	}
	
	static int add(int a, int b)
	{
		int result = a + b;
		if(result < 0)
		{
			try 
			{
				throw new Exception("���Ƿ� ���ܸ� �߻���Ŵ");
			}
			catch (Exception e) 
			{
				System.out.println("�߻��� ���ܸ� ó����");
			}
		}
		return result;
	}
}
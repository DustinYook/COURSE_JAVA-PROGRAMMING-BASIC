package p04.try_with_resources;

public class TryWithMain 
{
	public static void main(String[] args) 
	{
		try(TryWith_New t = new TryWith_New("file.txt")) // ��ü���� => �̰��� try_with_resource��
		{ // f.close�� ���� �Ⱦ AutoCloseable�� �̿��Ͽ� try_with_resource�� ����
			t.read();
			throw new Exception(); // ���ܸ� �߻���Ŵ
		}
		catch (Exception e)
		{
			System.out.println("����ó���ڵ尡 ����Ǿ����ϴ�.");
		}
	}
}
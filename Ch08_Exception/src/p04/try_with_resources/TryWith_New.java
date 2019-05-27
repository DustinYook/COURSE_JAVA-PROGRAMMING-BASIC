package p04.try_with_resources;

public class TryWith_New implements AutoCloseable 
{
	private String file;
	
	public TryWith_New(String f) // ������
	{
		this.file = f;
	}
	
	public void read()
	{
		System.out.println(file + "�� �н��ϴ�.");
	}

	@Override // AutoCloseable��� �������̽��� ���ǵǾ� �ִ� �߻�޼ҵ�
	public void close() throws Exception 
	{
		System.out.println(file + "�� �ݽ��ϴ�.");
	}
}
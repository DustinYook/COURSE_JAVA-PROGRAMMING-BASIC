package p04.generic_method;

public class TV 
{
	private String caption;// �� Ŭ���� ���ο����� ��밡��

	public TV() // ����Ʈ ������
	{
		this("TVŬ���� �Դϴ�"); // �ڱ� �ڽ� Ŭ������ �ٸ� ������ ȣ��
	}
	
	public TV(String caption) // ������ 
	{
		this.caption = caption;
	}
	
	@Override // ������ ���ϸ� �ּҰ��� �⤪��
	public String toString() 
	{
		return caption; // caption�� ���尪�� ���
	}
}
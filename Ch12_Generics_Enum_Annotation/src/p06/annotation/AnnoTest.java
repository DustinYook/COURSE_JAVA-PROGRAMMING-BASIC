package p06.annotation;

public class AnnoTest 
{
	@Deprecated // ������� �ʰڴٴ� ǥ��
	public String toString()
	{
		return super.toString() + " annotation"; // �ּҰ� + ���ڿ�("annotation")
	} // toString()�� �ּҰ��� ������ �� ����
}
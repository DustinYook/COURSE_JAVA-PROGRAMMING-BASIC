package p06.annotation;

public class NewClass 
{
	int newField;
	
	public int getNewField() 
	{
		return newField;
	}
	
	// Annotation(@ + ctrl + space): ����/��� �ּ� => ������ �� üũ, ������ �ƴ����� ��� ��
	@Deprecated // ������ ���� ���� ������� �ǹ� 
	int oldField;
	
    @Deprecated
	public int getOldField() 
    {
		return oldField;
	}
}
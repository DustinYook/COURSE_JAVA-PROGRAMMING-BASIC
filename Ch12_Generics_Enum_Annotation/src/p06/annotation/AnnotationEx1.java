package p06.annotation;

import java.util.ArrayList;

public class AnnotationEx1 
{
	@SuppressWarnings("deprecation") // deprecation ���� ���(Warning)�� ������ => ���ͳݿ��� ������ ���� ����� �ٸ� ���
	public static void main(String[] args) 
	{
		NewClass nc = new NewClass(); // �ν��Ͻ�ȸ(��ü����)
		nc.oldField = 10; // @Deprecated�� ���� ����� ���
		System.out.println(nc.oldField);
		System.out.println(nc.getOldField());
		
		@SuppressWarnings("unchecked") // generics ���� ��� ���� 
		ArrayList<NewClass> a = new ArrayList(); // Ÿ���� �������� ����
		a.add(nc); 
	}
}
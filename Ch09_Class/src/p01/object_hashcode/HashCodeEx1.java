package p01.object_hashcode;

public class HashCodeEx1 
{
	public static void main(String[] args) 
	{
		// �ڹ� �����ڰ� ���� Ŭ������ ��� ���� �Ȱ��� ������ �� ������
		// ����� ���� Ŭ������ ��� �ٸ�
		String s1 = new String("ȫ�浿");
		String s2 = new String("ȫ�浿");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s2);
		System.out.println(s2.hashCode());
	}
}
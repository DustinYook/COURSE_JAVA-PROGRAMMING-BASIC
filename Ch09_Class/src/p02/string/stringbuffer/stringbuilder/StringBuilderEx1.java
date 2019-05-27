package p02.string.stringbuffer.stringbuilder;

public class StringBuilderEx1 
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder(100); // '100'�� ������ ũ�⸦ ��Ÿ��
		sb.append("java"); // append(): �� �ڿ� �߰��ϴ� ���� => ������ �� (insert�� �߰��� ����)
		System.out.println(sb + " : " + sb.capacity()); // ������ ũ�⸦ ���
		
		sb.trimToSize(); // ���۾ȿ� ����ִ� ������ ���� (100����Ʈ �� 4����Ʈ�� �� 96����Ʈ �з� ����)
		System.out.println(sb + " : " + sb.capacity()); // ������ ũ�⸦ ���
	}
}
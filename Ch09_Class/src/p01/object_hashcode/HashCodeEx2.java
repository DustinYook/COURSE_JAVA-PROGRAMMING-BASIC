package p01.object_hashcode;
// hashCode(): key���� ��ġȭ �� ��
// 1�ܰ�: hashCode()�� ������
// 2�ܰ�: equals()���� ������
public class HashCodeEx2 
{
	public static void main(String[] args) 
	{
		Name n1 = new Name("ȫ", "�浿"); // ��ü���� #1 (�ν��Ͻ�ȭ)
		Name n2 = new Name("ȫ", "�浿"); // ��ü���� #2 (�ν��Ͻ�ȭ)
		
		System.out.println(n1); // ù��° ��ü�� �ּ�
		System.out.println(n1.hashCode());
		System.out.println(n2);
		System.out.println(n2.hashCode());
	}
}
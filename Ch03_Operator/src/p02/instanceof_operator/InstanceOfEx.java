package p02.instanceof_operator;

public class InstanceOfEx 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 5;
		System.out.println(a==b); // �����: false
		System.out.println(a!=b); // �����: true
		System.out.println(a>b); // �����: true
		System.out.println(a>=b); // �����: true
		System.out.println(a<b); // �����: false
		System.out.println(a<=b); // �����: false
		
		String str ="Hello"; // String�� ������Ÿ�� 
		// str�� ��������
		if(str instanceof String) // instanceof������
			System.out.println("���� Ÿ���̹Ƿ� ����ȯ ����");
		else
			System.out.println("�ٸ� Ÿ���̹Ƿ� ����ȯ�� �Ұ���");
		// ������Ÿ��: �⺻��(������ ���� ����), ������(������ �ּҰ� ����)
		
		b += a; // <=> b = b + a; (��࿬����)
		System.out.println(b); // b = 5 -> b + a = 15
		b %= a; // <=> b = b % a; (��࿬����)
		System.out.println(b); // b = 15 -> b % a = 0
	}
}
package p05.wrapper;
//Wrapper Class: ������ Ÿ���� ��ü������ ǥ���ϴ� ��� => Wrapper Class�� Ŭ������ API�� �������� ���� (�̵��� ���ؼ� �θ��� ���)
//�⺻�� Ÿ���� ���� �� Ȱ���ϱ� ���� �����ϴ� Ŭ������ wrapper class��
//�⺻�� -> ������: Boxing, ������ -> �⺻��: UnBoxing
public class WrapperEx2 
{
	public static void main(String[] args) 
	{
		// 4���� ������ ���ڿ��� ���ڷ� ������ִ� ����
		int i = new Integer("100"); 
		System.out.println(i + 100); // ���� 200�� ����
		
		int i2 = new Integer("100").intValue(); 
		System.out.println(i2 + 100);
		
		int i3 = Integer.parseInt("100"); 
		System.out.println(i3 + 100);
		
		Integer i4 = Integer.valueOf("100");
		System.out.println(i4 + 100);
		
		int i5 = Integer.parseInt("100", 2); // 2������ 10������ ��ȯ; parseInt("�ش�����ǥ��",ǥ������) 
		System.out.println(i5);
		
		int i6 = Integer.parseInt("FF", 16); // 16������ 10������ ��ȯ
		System.out.println(i6);
		
		// �̰� ���ڿ�
		String str = new String("100");
		System.out.println(str + 100); // 100100�� ����
	}
}
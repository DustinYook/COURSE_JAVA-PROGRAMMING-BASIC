// ���α׷� ����: Television�� Ŭ���� ���Ǻ�
package p01.obj_class;

public class Television // Ŭ������
{
	// 1.�������(field): Ŭ���� ���� ������ �������� => �ʱ�ȭ�� �ʿ����
	String color; // String�� ����Ʈ��: null
	boolean power; // boolean�� ����Ʈ��: false
	int channel; // int�� ����Ʈ��: 0
	
	// 2.����޼ҵ�(method)
	void member_method() // ����� �޼ҵ�
	{
		int a = 0; // �޼ҵ� �ȿ� �ִ� ���������� �ݵ�� �ʱ�ȭ�� ���־�� ��
		a = a + 10;
	}
	
	void power() // ������ ON,OFF�ϴ� �޼ҵ�
	{
		power = !power; 
	}
	
	void channelUp() // ä���� �ø��� �޼ҵ�
	{
		channel++; 
	}
	
	void channelDown() // ä���� ������ �޼ҵ�
	{
		channel--;
	}
}
// ���α׷� ����: Card�� Ŭ���� ���Ǻ�
package p02.variable_method;

public class Card  
{
	// 1.�ν��Ͻ� ����(instance variable): ������� ��ü�����ʿ� (���� �������� ���)
	String kind;
	int num; 
	// static Ű���尡 ������ �ν��Ͻ�ȭ�� �Ǿ����� ����
	
	// 2.Ŭ���� ����(class variable): ��ü�������� ��Ʈ�����ڷ� ���� (���� �������� ���)
	static int width = 100; // ī���� �ʺ�� ���̴� �ٲ��� �ʰ� ������
	static int height = 250; 
	// static Ű���尡 ������ �ν��Ͻ�ȭ�� �Ǿ��־� ��ü�������� �ٷ� ���ٰ���
	// ����) �ν��Ͻ�ȭ ���: "��ü����" �Ǵ� "static Ű���� ���"
}
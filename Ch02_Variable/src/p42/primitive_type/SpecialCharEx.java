// ���α׷� ����: escape sequence�� ���� Ȱ�뿹��
package p42.primitive_type;

public class SpecialCharEx 
{
	public static void main(String[] args) 
	{
		System.out.println('\''); // ���� ����ǥ�� ����ϱ� ���ؼ��� \'�� ���
		System.out.println("abc \t 123\b456"); // \t�� tab, \b�� backspace (�� ��������?)
		System.out.println('\n'); // \n�� newline
		System.out.println("\"Hello World!\""); // ū ����ǥ�� ����ϱ� ���ؼ��� \"�� ���
		System.out.println("c:\\"); // \�� ����ϱ� ���ؼ��� \\�� ���
	}
}
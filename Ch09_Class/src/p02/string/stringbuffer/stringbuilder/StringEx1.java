package p02.string.stringbuffer.stringbuilder;
// String �迭 Ŭ������ ���� ������ ���� - ����� �ľ��� �� (ū �κ� buffer�� ��������)
// String(1.0����): buffer�� ����  => ���� ���ϰ� �״�� �ҷ��ͼ� ��
// StringBuffer(1.0����): buffer�� ���� , �����(����, �ӵ� ����) => ���α׷��� �� ����־� ����
// StringBuilder(1.5����): buffer�� ����, �񵿱��(�ܼ�, �ӵ� ����) => ���α׷��� �ܼ��ϰ� ����� ����
// buffer�� ������ ��� ���� ����,����,����Ͽ� �� ���� ����� �� �ִ� ������ ����
// ���� �޼ҵ尡 �� ���� ��� ����! 
public class StringEx1 
{
	public static void main(String[] args) 
	{
		String str = "�ڹ�Ŀ��"; // ���ڿ��� ����
		int len = str.length(); // String Ŭ������ ���ǵ� ��� �޼ҵ�
		for(int i = 0; i < len; i++)
			System.out.print(str.charAt(i)); // String.charAt(index): �迭 ������ ÷�ڿ� ��ġ�� ���ڻ�� ���
	}
}
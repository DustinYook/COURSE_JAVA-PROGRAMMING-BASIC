package p02.class_method;

public class MethodEx2 // Ŭ������ ���� ����: ��Ա� ���ؼ� Ʋ�� ����
{
	// main�޼ҵ�� ������ �ϴ� �޼ҵ���
	public static void main(String[] args) // static�� �޸�(RAM)�� ���� -> ���డ��
	{
		// ��ü����: Ŭ������ ��ä�� �����ؼ� �޸𸮿� ���� ��, Ŭ������ �ν��� �� -> ��ǻ�Ͱ� ���� (RAM�� �ö��)
		PrintEx p = new PrintEx();
		p.printCharacter('-', 20); // ���� �μ��� �̵��Ϸ��� tabŰ ���
		System.out.println("The Joeun"); // syso + ctrl + space�� ����Ű (ctrl + space: �ڵ��ϼ����)
		p.printCharacter('*', 20); // ctrl + ���콺 -> open declaration: ȣ��η� �̵���
	}
}
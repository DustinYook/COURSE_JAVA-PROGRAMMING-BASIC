package p02.class_method;

public class PrintEx // Ŭ����: ������ Ʋ -> Ʋ�� �����ٰ� ����� -> �׷��� �ϱ� ���ؼ� ��ü�� �����ʿ�
{ // ���� �� Ŭ������ �޸𸮿� �ö�� ���� ���� ���� -> �ǹ��ְ� ������ ������ static�� ���� �޼ҵ�(main)�� ��ü�� �����ؾ���
	// ���� �� ���´� �޸𸮿� �ö�� ���� ���� ������ // �ҷ��� ���� ���� ��
	public void printCharacter(char ch, int num) // �޼ҵ�(�Լ�):�ҹ��ڷ� ���� => input�� output�� ����
	{
		for (int cnt = 0; cnt < num; cnt++)
			System.out.print(ch);
		System.out.println(); // �ٹٲ� ����
	}
} // �޼ҵ� = �Լ�: input�� �޾� output�� ��ȯ (JAVA������ �Լ���� ����� �޼ҵ��� �� ���)
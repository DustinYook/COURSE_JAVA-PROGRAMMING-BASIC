package p01.basic;

public class MethodEx // Ŭ����: �빮�ڷ� ���� => Ʋ�� ����
{
	// static�� �پ� �ִ� �޼ҵ�� �޸�(RAM)�� �ö�� ����
	public static void main(String[] args)
	{// ���������� �����
		// ��ü����: �޸�(RAM)�� �ö���� �ȴ�. 
		MethodEx m = new MethodEx(); // �޸𸮿� �ö���� ��
		m.printCharacter('*', 30); // ���� �μ��� �Ʒ� �Ű������� ����
		System.out.println("Hello,Java!");
		m.printCharacter('#', 30);
	} // ������ ���⸸ ������
	
	// ���� �� ���´� �޸𸮿� �ö�� ���� ���� ������ // �ҷ��� ���� ���� ��
	public void printCharacter(char ch, int num)  // �޼ҵ�: �ҹ��ڷ� ����
	{
		for(int cnt = 0; cnt < num; cnt++)
			System.out.print(ch);
		System.out.println(); // �ٹٲ� ����
	}
}
// �޸𸮿� �ö�� �ִ� <=> ��ǻ�Ͱ� �����ϰ� ����
// �޸𸮿� �ö���� �ϴ� ��� 
// CPU <- RAM(�޸�) <- SSD/HD
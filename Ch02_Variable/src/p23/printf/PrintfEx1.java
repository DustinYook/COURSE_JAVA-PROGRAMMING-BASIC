// ���α׷� ����: printf�� ���õ� ��ȯ���� ���� �н� 1
package p23.printf;

public class PrintfEx1 
{
	public static void main(String[] args) 
	{
		byte b = 1;
		System.out.printf("b: %d\n", b);
		
		short s = 2;
		System.out.printf("s: %d\n", s);
		
		char c = 'A';
		System.out.printf("c: %c, c�� ASCII �ڵ尪: %d\n", c, (int)c); 
		// C����� printf�� �������ȯ�� �� �ʿ���� ��ȯ���� ���� ��������� ����� �� �ִٴ� ���� �ٸ�
		
		int finger = 10;
		System.out.printf("finger = [%5d]\n", finger); // ���ȣ �ȿ� 5ĭ�� ����� ���������� (���ڴ� ������������ ����Ʈ��)
		System.out.printf("finger = [%-5d]\n", finger); // ���ڸ� ���������ϱ� ���ؼ��� ��������� -�� �ٿ��־�� ��
		System.out.printf("finger = [%+5d]\n", finger); // ��ȯ�� ������ +�� ����� ������ +��ȣ�� ����ϰ� ���ָ� ���������Ľ�Ŵ 
		System.out.printf("finger = [%05d]\n", finger); // ��ȯ�� ������ 0�� ��ȿ�ڸ����ڰ� �ƴ� ������ 0���� ä����
		
		long big = 100_000_000_000L; // long big = 100000000000L; 
		System.out.printf("big: %d\n", big); // �ڸ����� �� ������ ��� underbar�� ���� �� ����
		
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		System.out.printf("hex�� 16���� ǥ���� : %x\n", hex); // x�� heXadecimal�� ����
		System.out.printf("hex�� ���λ縦 ������ 16���� ǥ���� : %#x\n", hex); // %x���̿� #�� ���� 16������ ������ ���λ� 0x�� ǥ�� 
		System.out.printf("hex�� 8���� ǥ����: %o\n", hex); // o�� octal�� ����
		System.out.printf("hex�� ���λ縦 ������ 8���� ǥ����: %#o\n", hex);  // %o���̿� #�� ���� 8������ ������ ���λ� 0�� ǥ��
		
		int octNum = 010; // 8���� 10�� 10������ 8�� // 8������ �����ϱ� ���ؼ��� ��������� 0�� �տ� ���־�� ��
		System.out.printf("octNum => 8���� ǥ��:%o, 10���� ǥ��:%d\n", octNum, octNum);
		
		int hexNum = 0x10; // 16���� 10�� 10������ 16�� // 16������ �����ϱ� ���ؼ��� ��������� 0x�� �տ� ���־�� ��
		System.out.printf("hexNum => 16���� ǥ��:%x, 10���� ǥ��:%d\n", hexNum, hexNum);
		
		int binNum = 0b10; // 2���� 10�� 10������ 2�� // b�� binary(2����)�� ����
		System.out.printf("binNum => 2���� ǥ��:%s, 10���� ǥ��:%d\n", Integer.toBinaryString(binNum), binNum); // 2���� �������� ǥ���� �� �ִ� ��ȯ���� �������� ����
		// Integer.toBinaryString(argument)��� �޼ҵ带 ���� �̸� ����
	}	
}
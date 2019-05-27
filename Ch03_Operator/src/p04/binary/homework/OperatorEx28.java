// ���α׷� ����: ��Ʈ�������� ����
package p04.binary.homework;

public class OperatorEx28 
{
	public static void main(String[] args) 
	{
		int x = 0xAB; // 0x�� 16������ ���ξ�
		int y = 0xF;
		System.out.printf("x = %#X, y = %#X\n", x, y);
		System.out.printf("x = %s\n", Integer.toBinaryString(x)); 
		System.out.printf("y = %s\n", Integer.toBinaryString(y));
		// toBinaryString(): IntegerŬ������ ���ǵ� ������������ String�� ��ȯ�ϴ� �޼ҵ�
		System.out.printf("%#X | %#X = %s\n", x, y, Integer.toBinaryString(x|y)); 
		// ��ƮOR����: �� �� �ϳ��� 1�� ������ 1�� ���� ��ȯ 
		// ��OR������ ���� ���� ���̸� ���� �� skip, ��ƮOR������ ��� ��� �ڸ��� ���ؼ� ������
		System.out.printf("%#X & %#X = %s\n", x, y, Integer.toBinaryString(x&y)); 
		// ��ƮAND����: �� �� �ϳ��� 0�� ������ 0�� ���� ��ȯ
		// ��AND������ ���� ���� �����̸� ���� �� skip, ��ƮAND������ ��� ��� �ڸ��� ���ؼ� ������
		System.out.printf("%#X ^ %#X = %s\n", x, y, Integer.toBinaryString(x^y)); 
		// ��ƮXOR����: �� ���� �ٸ��� 1��, �� ���� ������ 0�� ���� ��ȯ
		
		int result = x^y^y;
		System.out.printf("%#X ^ %#X ^ %#X = %#X\n", x, y, y, result);
		System.out.printf("%s\n", Integer.toBinaryString(x^y^y));
		
		int denial1 = ~x;
		int denial2 = ~y;
		System.out.printf("x = %s\n", Integer.toBinaryString(denial1));
		System.out.printf("y = %s\n", Integer.toBinaryString(denial2));
	}
}
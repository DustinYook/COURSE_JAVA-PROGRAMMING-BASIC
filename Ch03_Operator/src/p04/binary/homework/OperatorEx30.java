package p04.binary.homework;

public class OperatorEx30 
{
	static String toBinaryString(int x) // Ŭ���� �޼ҵ�
	{
		String zero = "0000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x); // ���ڿ� ���Ῥ����(+)
		return tmp.substring(tmp.length()-32);
	}
	
	public static void main(String[] args) // Ŭ���� �޼ҵ� (main)
	{
		int dec = 8;
		System.out.printf("%d >> %d = %d\t", dec, 0, dec>>0); // 2^0(=1)�� ����
		System.out.printf("%s\n", Integer.toBinaryString(dec>>0));
		System.out.printf("%d >> %d = %d\t", dec, 1, dec>>1); // 2^1(=2)�� ����
		System.out.printf("%s\n", Integer.toBinaryString(dec>>1));
		System.out.printf("%d >> %d = %d\t", dec, 2, dec>>2); // 2^2(=4)�� ����
		System.out.printf("%s\n\n", Integer.toBinaryString(dec>>2));
		
		System.out.printf("%d << %d = %d\t", dec, 0, dec<<0); // 2^0(=1)�� ����
		System.out.printf("%s\n", Integer.toBinaryString(dec<<0));
		System.out.printf("%d << %d = %d\t", dec, 1, dec<<1); // 2^1(=2)�� ����
		System.out.printf("%s\n", Integer.toBinaryString(dec<<1));
		System.out.printf("%d << %d = %d\t", dec, 2, dec<<2); // 2^2(=4)�� ����
		System.out.printf("%s\n\n", Integer.toBinaryString(dec<<2));
		
        dec = -8;
		System.out.printf("%d >> %d = %d\t", dec, 0, dec>>0); // 2^0(=1)�� ����
		System.out.printf("%s\n", Integer.toBinaryString(dec>>0));
		System.out.printf("%d >> %d = %d\t", dec, 1, dec>>1); // 2^1(=2)�� ����
		System.out.printf("%s\n", Integer.toBinaryString(dec>>1));
		System.out.printf("%d >> %d = %d\t", dec, 2, dec>>2); // 2^2(=4)�� ����
		System.out.printf("%s\n\n", Integer.toBinaryString(dec>>2));
		
		System.out.printf("%d << %d = %d\t", dec, 0, dec<<0); // 2^0(=1)�� ����
		System.out.printf("%s\n", Integer.toBinaryString(dec<<0));
		System.out.printf("%d << %d = %d\t", dec, 1, dec<<1); // 2^1(=2)�� ����
		System.out.printf("%s\n", Integer.toBinaryString(dec<<1));
		System.out.printf("%d << %d = %d\t", dec, 2, dec<<2); // 2^2(=4)�� ����
		System.out.printf("%s\n\n", Integer.toBinaryString(dec<<2));
	}
}
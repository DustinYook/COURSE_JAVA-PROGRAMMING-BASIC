// ���α׷� ����: ��ȣ�ִ� ������ �����÷ο�
package p43.integer_type;

public class OverflowEx 
{
	public static void main(String[] args) 
	{
		// MSB(�ֻ��� ��Ʈ)�� ��ȣ��Ʈ�� ��� �ڷ��� �տ� signed�� ��������� �� �� �ְ�, �Ǵ� ���������� (����Ʈ��)
		short sMin = -32768; // short���� ǥ�������� �ּڰ�
		System.out.println("sMin = "  + sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1)); // overflow
		System.out.println("sMin-1 = " + (sMin-1)); // ����������ȯ�� �Ͼ (short -> int)
		System.out.println();
		
		short sMax = 32767; // short���� ǥ�������� �ִ�
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1 = " + (short)(sMax+1)); // overflow
		System.out.println("sMax+1 = " + (sMax+1)); // ����������ȯ�� �Ͼ (short -> int)
		System.out.println();
		
		char cMin = 0; // char���� ǥ�������� �ּڰ�
		System.out.println("cMin = " + (int)cMin); 
		System.out.println("cMin-1 = " + (int)(--cMin)); // overflow
		System.out.println("cMin-1 = " + (int)(cMin-1)); // ����
		System.out.println();
		
		char cMax = 65535; // char���� ǥ�������� �ִ�
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax+1 = " + (int)(++cMax)); // overflow
		System.out.println("cMax+1 = " + (int)(cMax+1)); // ����
	}	
}
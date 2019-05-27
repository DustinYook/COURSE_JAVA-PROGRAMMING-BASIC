package p02.format;
import java.text.DecimalFormat;

// ȭ�� ������ ��
public class DecimalFormatEx1 
{
	public static void main(String[] args) 
	{
		double num = 1234567.89; 
		DecimalFormat df = new DecimalFormat("0"); // �ݿø��� ���¿��� �Ҽ��� �̻��ڸ� ǥ��
		System.out.println(df.format(num)); // �����: 1234568
		
	    df = new DecimalFormat("0.0"); // ù��° �Ҽ��� �ڸ����� �ݿø��� ���·� ǥ��
		System.out.println(df.format(num)); // �����: 1234567.9 
		
		df = new DecimalFormat("0000000000.000"); 
		System.out.println(df.format(num)); // �����: 0001234567.890000
		// #�� ���ڿ� �ش��ϴ� �͸� ä��, 0�� ���� �ڸ��� 0���� ä�� ����
		
		df = new DecimalFormat("#"); 
		System.out.println(df.format(num)); // �����: 1234568
		
		df = new DecimalFormat("#.#"); 
		System.out.println(df.format(num)); // �����: 1234567.9
		
		df = new DecimalFormat("###########.##########"); // �ش��ϴ� ���ڸ�ŭ�� ä��
		System.out.println(df.format(num)); // �����: 1234567.89
		
		df = new DecimalFormat("###########.000"); 
		System.out.println(df.format(num)); // �����: 1234567.890
		
		df = new DecimalFormat("+#.0"); 
		System.out.println(df.format(num)); // �����: +1234567.9
		
		df = new DecimalFormat("-#.0"); 
		System.out.println(df.format(num)); // �����: -1234567.9

		df = new DecimalFormat("#,###.000"); // �ణ ���������� ���� ����
		System.out.println(df.format(num)); // �����: 1,234,567.890
		
		df = new DecimalFormat("0.0E0"); 
		System.out.println(df.format(num)); // �����: 1.2E6
		
		df = new DecimalFormat("+#,###; -#,###"); // ����� �� ����, ������ �� ������
		System.out.println(df.format(num)); // �����: +1,234,568
		
		df = new DecimalFormat("#.# %"); 
		System.out.println(df.format(num)); // �����: 123456789 %
		
		df = new DecimalFormat("\u00A4 #,###"); // �����ڵ� �� 
		System.out.println(df.format(num)); // �����: 123456789 %
	}
}
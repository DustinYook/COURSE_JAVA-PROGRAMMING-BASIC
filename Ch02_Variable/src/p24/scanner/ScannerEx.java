// ���α׷� ����: �Է� �޼ҵ��� ���
package p24.scanner;

import java.util.Scanner; // Scanner Ŭ������ �̿��ϱ� ���� ��ó����

public class ScannerEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // ��ü����
		
		System.out.print("�� �ڸ� ������ �ϳ� �Է����ֽʽÿ�: ");
		String input = sc.nextLine(); // �޼ҵ带 �̿��Ͽ� StringŬ������ ��ü input�� �Է°��� ���� 
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���������� ��ȯ
		// int num = sc.nextInt(); // �� ����� �� ���� (13�� ������ ���� ���� �ʾƵ� ��)
		
		System.out.println("�Է³���: " + input); // �Է¹��ڿ� ���
		System.out.printf("num = %d\n", num); // �Է¹��ڿ��� ���ڷ� ��ȯ�� ����� ���
	}
}
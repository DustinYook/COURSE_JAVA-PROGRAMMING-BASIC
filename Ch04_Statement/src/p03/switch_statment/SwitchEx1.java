// ���α׷� ����: ȸ������� �Է��ϸ� ���� �� �ִ� ������ �˷��ִ� ���α׷�
package p03.switch_statment;

import java.util.Scanner; // ScannerŬ������ ����ϱ� ���� ��ó����

public class SwitchEx1 
{
	public static void main(String[] args) // static���� ����Ǿ� �޸𸮿� �ö�� ����
	{
		System.out.println("[�ý��۾˸�] ����� ���� �� �ִ� ������ ��ȸ�Ͻ� �� �ֽ��ϴ�.");
		System.out.print("����� ȸ������� A~C ������ ���ڷ� �Է����ֽʽÿ�: ");
		Scanner sc = new Scanner(System.in);
		String grade = sc.nextLine();
		
		switch(grade)
		{
		case "A":
		case "a":
			System.out.println("10% ������ ���� �� �ֽ��ϴ�.");
		case "B":
		case "b":
			System.out.println("�������Ḧ �������� �� �ֽ��ϴ�.");
		case "C":
		case "c":
			System.out.println("���������� �����մϴ�.");
			break;
		default: // �ش������ ���� �� ����
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
}
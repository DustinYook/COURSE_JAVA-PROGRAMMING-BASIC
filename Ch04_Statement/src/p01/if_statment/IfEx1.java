// ���α׷� ����: ������ �Է¹ް� ������ ��ȯ�ϴ� ���α׷�
package p01.if_statment; // ��Ű����: �ҹ��ڷ� ����

import java.util.Scanner;

public class IfEx1 // Ŭ������: �빮�ڷ� ����
{
	public static void main(String[] args) // main�޼ҵ�� static���� ����Ǿ� �����Ƿ� �޸𸮿� �ö�� ����
	{
		int score; // �ݵ�� while�� �ۿ� �����ؾ� �������� ����
		char grade;
		
		while(true) // ���ѷ�������
		{
			System.out.print("����� ������ 0���� 100���� ������ ������ �Է����ֽʽÿ�: ");
			Scanner sc = new Scanner(System.in); // ScannerŬ������ ��ü���� => �޸𸮿� �ø�
			score = sc.nextInt(); // Ű����� �Է¹��� ���� score������ ����
			if(score>=0 && score<=100) // �Է±�Ģ�Ǵ�
				break; // �ؼ� �� ���ѷ��� Ż��
			else // ���ؼ� �� �����޼��� ���
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �� �� �Է����ֽʽÿ�.\n");
		}
		
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("����� ������ " + grade + "�Դϴ�.");
	}
}
//if���� ���� ������ ���ԵǸ� �ݵ�� �߰�ȣ�� �����־�� ��
// ���α׷� ����: ��ǻ�Ͱ� ���Ƿ� ��ȯ�ϴ� �ֻ����� ���� �����ϴ� ����
package p01.if_statment;

import java.util.Scanner; // ScannerŬ������ ����ϱ� ���� ��ó����

public class IfEx2 
{
	public static void main(String[] args) 
	{
		int input; // ������Էº���
		while (true) 
		{
			System.out.print("�ֻ����� ����� �����Ͽ� 1���� 6������ ������ �Է����ֽʽÿ�: ");
			Scanner sc = new Scanner(System.in); // ScannerŬ������ ��ü���� => �޸𸮿� �ö��
			input = sc.nextInt();
			if (input >= 1 && input <= 6)
				break;
			else
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �� �� �Է����ֽʽÿ�.\n");
		}

		int computer = (int) (Math.random() * 6) + 1;
		System.out.printf("�ֻ����� ��: %d\n", computer);
		if (input == computer) 
			System.out.println("�����մϴ�. �����Դϴ�!");
		else
			System.out.println("��Ÿ�����ϴ�. �����Դϴ�!");
	}
}
// Math.random()�޼ҵ�� 0.0 ~ 1.0 ������ double�� ������� ��ȯ (����: 0.0 < return < 1.0)
// �ֻ����� ���� ������ ��ȯ�ϱ� ���ؼ��� ���������ȯ�� �����Ͽ��� ��
// C����� rand()�Լ��� ����, ������: seed���� ���� �ʾƵ� �Ź� ��ȯ���� �ٸ�!
package p04.while_statment;
import java.util.Scanner; // ScannerŬ������ �̿��ϱ� ���� ����

public class DoWhileEx1 
{
	public static void main(String[] args) 
	{
		String inputString; 
		do // do while������ ���ǿ� ������� ������ ��� �ѹ� ������ �� ����
		{
			System.out.print("�޼����� �Է����ֽʽÿ�: ");
			Scanner sc = new Scanner(System.in); // Scanner�� ��ü���� => �޸𸮿� �ø�
			inputString = sc.nextLine();
			System.out.println("[�ý������] " + inputString);
			System.out.println("���α׷��� �����Ϸ��� q�� �Է����ֽʽÿ�.\n");
		} while(!inputString.equals("q")); // Sentinel�� ���Ҽ���
		// StringŬ������ ���ǵ� equals(���ڿ�)�޼ҵ�� �Էµ� ���� �������ڿ��� ��ġ�ϴ��� ��
		// �̴� C����� strcmp()�Լ��� ������ ����� ���� (Ư���� ���� !�����ڸ� �̿��Ͽ� ������ �� ����)
		System.out.println("[�ý��۾˸�] ���α׷��� �����մϴ�.");
	}
}
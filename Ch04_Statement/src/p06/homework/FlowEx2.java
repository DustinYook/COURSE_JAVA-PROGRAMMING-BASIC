package p06.homework;
import java.util.Scanner;

public class FlowEx2 
{
	public static void main(String[] args) 
	{
		System.out.print("���ڸ� �ϳ� �Է����ֽʽÿ�: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.\n", input);
		if(input > 0)
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		else if(input == 0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		else
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
	}
}
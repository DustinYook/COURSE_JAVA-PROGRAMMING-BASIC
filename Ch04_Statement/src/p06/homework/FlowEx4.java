package p06.homework;
import java.util.Scanner;

public class FlowEx4 
{
	public static void main(String[] args) 
	{
		System.out.print("����� ������ �Է����ֽʽÿ�: ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt(); // ������ �����ϱ� ���� ����
		char grade; // ������ �����ϱ� ���� ����
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
		System.out.printf("����� ������ %d���̰�, ����� ������ %c�Դϴ�.\n", score, grade);
	}
}
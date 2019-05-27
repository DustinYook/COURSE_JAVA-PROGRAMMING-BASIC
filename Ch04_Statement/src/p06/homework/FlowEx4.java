package p06.homework;
import java.util.Scanner;

public class FlowEx4 
{
	public static void main(String[] args) 
	{
		System.out.print("당신의 점수를 입력해주십시오: ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt(); // 점수를 저장하기 위한 변수
		char grade; // 학점을 저장하기 위한 점수
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
		System.out.printf("당신의 점수는 %d점이고, 당신의 학점은 %c입니다.\n", score, grade);
	}
}
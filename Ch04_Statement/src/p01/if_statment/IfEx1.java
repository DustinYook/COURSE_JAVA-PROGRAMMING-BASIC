// 프로그램 설명: 점수를 입력받고 평점을 반환하는 프로그램
package p01.if_statment; // 패키지명: 소문자로 구성

import java.util.Scanner;

public class IfEx1 // 클래스명: 대문자로 시작
{
	public static void main(String[] args) // main메소드는 static으로 선언되어 있으므로 메모리에 올라와 있음
	{
		int score; // 반드시 while문 밖에 선언해야 오류나지 않음
		char grade;
		
		while(true) // 무한루프생성
		{
			System.out.print("당신의 점수를 0부터 100까지 사이의 정수로 입력해주십시오: ");
			Scanner sc = new Scanner(System.in); // Scanner클래스의 객체생성 => 메모리에 올림
			score = sc.nextInt(); // 키보드로 입력받은 값을 score변수에 저장
			if(score>=0 && score<=100) // 입력규칙판단
				break; // 준수 시 무한루프 탈출
			else // 미준수 시 오류메세지 출력
				System.out.println("잘못입력하셨습니다. 다시 한 번 입력해주십시오.\n");
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
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}
}
//if문에 여러 문장이 포함되면 반드시 중괄호로 묶어주어야 함
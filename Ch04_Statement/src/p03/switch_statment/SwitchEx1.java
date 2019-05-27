// 프로그램 설명: 회원등급을 입력하면 받을 수 있는 혜택을 알려주는 프로그램
package p03.switch_statment;

import java.util.Scanner; // Scanner클래스를 사용하기 위한 전처리기

public class SwitchEx1 
{
	public static void main(String[] args) // static으로 선언되어 메모리에 올라와 있음
	{
		System.out.println("[시스템알림] 당신이 받을 수 있는 혜택을 조회하실 수 있습니다.");
		System.out.print("당신의 회원등급을 A~C 사이의 문자로 입력해주십시오: ");
		Scanner sc = new Scanner(System.in);
		String grade = sc.nextLine();
		
		switch(grade)
		{
		case "A":
		case "a":
			System.out.println("10% 할인을 받을 수 있습니다.");
		case "B":
		case "b":
			System.out.println("무료음료를 제공받을 수 있습니다.");
		case "C":
		case "c":
			System.out.println("무료주차가 가능합니다.");
			break;
		default: // 해당사항이 없을 때 적용
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
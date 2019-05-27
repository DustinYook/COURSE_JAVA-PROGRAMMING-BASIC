// 프로그램 설명: 입력 메소드의 사용
package p24.scanner;

import java.util.Scanner; // Scanner 클래스를 이용하기 위한 전처리기

public class ScannerEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); // 객체생성
		
		System.out.print("두 자리 정수를 하나 입력해주십시오: ");
		String input = sc.nextLine(); // 메소드를 이용하여 String클래스의 객체 input에 입력값을 저장 
		int num = Integer.parseInt(input); // 입력받은 문자열을 정수형으로 전환
		// int num = sc.nextInt(); // 이 방법이 더 쉬움 (13번 라인을 굳이 쓰지 않아도 됨)
		
		System.out.println("입력내용: " + input); // 입력문자열 출력
		System.out.printf("num = %d\n", num); // 입력문자열을 숫자로 전환한 결과를 출력
	}
}
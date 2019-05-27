// 프로그램 설명: 컴퓨터가 임의로 반환하는 주사위의 눈을 예측하는 게임
package p01.if_statment;

import java.util.Scanner; // Scanner클래스를 사용하기 위한 전처리기

public class IfEx2 
{
	public static void main(String[] args) 
	{
		int input; // 사용자입력변수
		while (true) 
		{
			System.out.print("주사위의 결과를 예측하여 1부터 6사이의 정수로 입력해주십시오: ");
			Scanner sc = new Scanner(System.in); // Scanner클래스의 객체생성 => 메모리에 올라옴
			input = sc.nextInt();
			if (input >= 1 && input <= 6)
				break;
			else
				System.out.println("잘못입력하셨습니다. 다시 한 번 입력해주십시오.\n");
		}

		int computer = (int) (Math.random() * 6) + 1;
		System.out.printf("주사위의 값: %d\n", computer);
		if (input == computer) 
			System.out.println("축하합니다. 정답입니다!");
		else
			System.out.println("안타깝습니다. 오답입니다!");
	}
}
// Math.random()메소드는 0.0 ~ 1.0 사이의 double형 결과값을 반환 (범위: 0.0 < return < 1.0)
// 주사위와 같이 정수를 반환하기 위해서는 명시적형변환을 수행하여야 함
// C언어의 rand()함수와 동일, 차이점: seed값을 주지 않아도 매번 반환값이 다름!
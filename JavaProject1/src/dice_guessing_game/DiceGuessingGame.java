package dice_guessing_game;

import java.util.Scanner;
import java.util.function.IntSupplier;

public class DiceGuessingGame
{
	public static void main(String[] args) 
	{
		// 1.게임 안내 지시문
		System.out.println("           자바 8.0 기반 프로그래밍 중간포트폴리오 _ 주사위 게임 (by 육동현)");
		System.out.println("================================================================");
		System.out.println("[게임설명] 이 게임은 컴퓨터가 생성하는 1~6까지의 임의의 주사위 눈의 결과를 예측하는 게임입니다.");
		System.out.println(" 당신에게는 총 3번의 추측 기회가 주어지며 3번 이내로 정답을 맞추지 못하면 게임에서 지게 됩니다.");
		System.out.println("================================================================\n");
		
		// 2.입력처리
		System.out.print("<1번째 도전> 주사위의 결과를 예측하여 입력해주십시오: ");
		Scanner sc = new Scanner(System.in); // 자료 입력을 위한 Scanner 객체 생성
		int input = sc.nextInt(); // 예외처리 필요!: 1~6까지 정수값을 입력받아야 함
	
		
		// 3.주사위 난수 생성
		IntSupplier is = () -> // 람다식 표현 사용
		{
			int dice = (int)(Math.random()*6)+1;
			return dice;
		};
		int computer = is.getAsInt(); // 컴퓨터가 생성한 난수를 저장하는 변수공간

		// 4.게임 결과처리
		int try_count = 0; // 시도 횟수를 카운트하기 위한 변수 
		if(input == computer) // 정답을 맞춘 경우
		{
			System.out.println("[결과] 대단하시네요! 한 번만에 맞추시다니! 혹시 점쟁이 아니신가요?"); 
			System.out.println("[정답] 컴퓨터가 생성한 주사위의 값: " + computer);
		}
		else // 정답을 맞추지 못한 경우
		{
			try_count++; // 정답을 못맞추었으므로 시도횟수를 '1' 증가시킴
			System.out.println("[결과] 아,안타깝습니다! 정답을 맞추지 못했습니다.\n"); // 틀렸음을 알려줌
			do
			{
				System.out.printf("<%d번째 도전> 다시 한 번 주사위의 결과를 예측하여 입력해주십시오: ", try_count+1);
				Scanner sc_re = new Scanner(System.in);
				input = sc_re.nextInt();
				
				if(input == computer)
				{
					System.out.println("[결과] 한 번은 틀렸지만 괜찮아요! 어쨌든 정답을 맞췄잖아요!");
					System.out.println("[정답] 컴퓨터가 생성한 주사위의 값: " + computer);
					break; // 정답 맞추면 루프를 빠져나감
				}
				else
				{
					System.out.println("[결과] 아,안타깝습니다! 정답을 맞추지 못했습니다.\n");
					try_count++;
				}
			} while(try_count<3);
		}
		if(try_count >= 3)
			System.out.println("                     Game Over!");
		else
			System.out.println("[결과] " + (try_count+1) + "번의 추즉으로 정답을 맞추었습니다.");
	}
}
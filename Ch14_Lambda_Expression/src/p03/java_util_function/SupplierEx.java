package p03.java_util_function;

import java.util.Scanner;
import java.util.function.IntSupplier;

public class SupplierEx 
{
	public static void main(String[] args) 
	{
		System.out.println("             자바 8.0 기반 프로그래밍 중간포트폴리오 _ 수강생:육동현");
		System.out.println("============================================================");
		System.out.println("[안내] 이 프로그램은 컴퓨터의 주사위의 눈을 맞추는 프로그램입니다.");
		System.out.println("[게임 규칙] 이 게임은 컴퓨터가 생성하는 임의의 주사의 결과를 예측하는 게임입니다.");
		System.out.println("당신에게는 3번의 추측 기회가 주어지며 3번 이내로 정답을 맞추지 못하면 게임에서 지게 됩니다.");
		System.out.println("============================================================\n");
		
		System.out.print("주사위의 결과를 예측하여 입력해주십시오: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count = 0;
		
//		IntSupplier is = new IntSupplier() // @FunctionalInterface // 익명구현객체
//		{
//			@Override
//			public int getAsInt() // 매개변수는 없고 반환값만 있음 => ex)주사위
//			{
//				int result = (int)(Math.random()*6)+1;
//				return result;
//			}
//		};
//		int dice = is.getAsInt();
//		System.out.println("주사위의 값: " + dice);
		
		IntSupplier is = () -> // @FunctionalInterface // 익명구현객체
		{
			int result = (int)(Math.random()*6)+1;
			return result;
		};
		int dice = is.getAsInt();
		
		if(input == dice)
		{
			System.out.println("[결과] 축하합니다. 정답입니다.");
			System.out.println("[정답] 컴퓨터가 생성한 주사위의 값: " + dice);
		}
		else
		{
			count++;
			System.out.println("[결과] 안타깝습니다. 오답입니다.\n");
			do
			{
				System.out.printf("다시 한 번 주사위의 결과를 예측하여 입력해주십시오: ");
				Scanner sc_re = new Scanner(System.in);
				input = sc_re.nextInt();
				
				if(input == dice)
				{
					System.out.println("[결과] 축하합니다. 정답입니다.");
					System.out.println("[정답] 컴퓨터가 생성한 주사위의 값: " + dice);
					break;
				}
				else
				{
					System.out.println("[결과] 안타깝습니다. 오답입니다.\n");
					count++;
				}
			} while(count<3);
		}
		if(count >= 3)
			System.out.println("Game Over!");
		else
			System.out.println("[결과] " + (count+1) + "번의 추즉으로 정답을 맞추었습니다.");
	}
}
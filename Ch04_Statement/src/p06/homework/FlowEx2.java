package p06.homework;
import java.util.Scanner;

public class FlowEx2 
{
	public static void main(String[] args) 
	{
		System.out.print("숫자를 하나 입력해주십시오: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.printf("입력하신 숫자는 %d입니다.\n", input);
		if(input > 0)
			System.out.println("입력하신 숫자는 양수입니다.");
		else if(input == 0)
			System.out.println("입력하신 숫자는 0입니다.");
		else
			System.out.println("입력하신 숫자는 음수입니다.");
	}
}
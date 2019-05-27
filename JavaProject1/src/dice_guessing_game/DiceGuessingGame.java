package dice_guessing_game;

import java.util.Scanner;
import java.util.function.IntSupplier;

public class DiceGuessingGame
{
	public static void main(String[] args) 
	{
		// 1.���� �ȳ� ���ù�
		System.out.println("           �ڹ� 8.0 ��� ���α׷��� �߰���Ʈ������ _ �ֻ��� ���� (by ������)");
		System.out.println("================================================================");
		System.out.println("[���Ӽ���] �� ������ ��ǻ�Ͱ� �����ϴ� 1~6������ ������ �ֻ��� ���� ����� �����ϴ� �����Դϴ�.");
		System.out.println(" ��ſ��Դ� �� 3���� ���� ��ȸ�� �־����� 3�� �̳��� ������ ������ ���ϸ� ���ӿ��� ���� �˴ϴ�.");
		System.out.println("================================================================\n");
		
		// 2.�Է�ó��
		System.out.print("<1��° ����> �ֻ����� ����� �����Ͽ� �Է����ֽʽÿ�: ");
		Scanner sc = new Scanner(System.in); // �ڷ� �Է��� ���� Scanner ��ü ����
		int input = sc.nextInt(); // ����ó�� �ʿ�!: 1~6���� �������� �Է¹޾ƾ� ��
	
		
		// 3.�ֻ��� ���� ����
		IntSupplier is = () -> // ���ٽ� ǥ�� ���
		{
			int dice = (int)(Math.random()*6)+1;
			return dice;
		};
		int computer = is.getAsInt(); // ��ǻ�Ͱ� ������ ������ �����ϴ� ��������

		// 4.���� ���ó��
		int try_count = 0; // �õ� Ƚ���� ī��Ʈ�ϱ� ���� ���� 
		if(input == computer) // ������ ���� ���
		{
			System.out.println("[���] ����Ͻó׿�! �� ������ ���߽ôٴ�! Ȥ�� ������ �ƴϽŰ���?"); 
			System.out.println("[����] ��ǻ�Ͱ� ������ �ֻ����� ��: " + computer);
		}
		else // ������ ������ ���� ���
		{
			try_count++; // ������ �����߾����Ƿ� �õ�Ƚ���� '1' ������Ŵ
			System.out.println("[���] ��,��Ÿ�����ϴ�! ������ ������ ���߽��ϴ�.\n"); // Ʋ������ �˷���
			do
			{
				System.out.printf("<%d��° ����> �ٽ� �� �� �ֻ����� ����� �����Ͽ� �Է����ֽʽÿ�: ", try_count+1);
				Scanner sc_re = new Scanner(System.in);
				input = sc_re.nextInt();
				
				if(input == computer)
				{
					System.out.println("[���] �� ���� Ʋ������ �����ƿ�! ��·�� ������ �����ݾƿ�!");
					System.out.println("[����] ��ǻ�Ͱ� ������ �ֻ����� ��: " + computer);
					break; // ���� ���߸� ������ ��������
				}
				else
				{
					System.out.println("[���] ��,��Ÿ�����ϴ�! ������ ������ ���߽��ϴ�.\n");
					try_count++;
				}
			} while(try_count<3);
		}
		if(try_count >= 3)
			System.out.println("                     Game Over!");
		else
			System.out.println("[���] " + (try_count+1) + "���� �������� ������ ���߾����ϴ�.");
	}
}
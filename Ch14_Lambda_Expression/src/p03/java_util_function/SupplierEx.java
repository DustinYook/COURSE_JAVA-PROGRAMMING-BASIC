package p03.java_util_function;

import java.util.Scanner;
import java.util.function.IntSupplier;

public class SupplierEx 
{
	public static void main(String[] args) 
	{
		System.out.println("             �ڹ� 8.0 ��� ���α׷��� �߰���Ʈ������ _ ������:������");
		System.out.println("============================================================");
		System.out.println("[�ȳ�] �� ���α׷��� ��ǻ���� �ֻ����� ���� ���ߴ� ���α׷��Դϴ�.");
		System.out.println("[���� ��Ģ] �� ������ ��ǻ�Ͱ� �����ϴ� ������ �ֻ��� ����� �����ϴ� �����Դϴ�.");
		System.out.println("��ſ��Դ� 3���� ���� ��ȸ�� �־����� 3�� �̳��� ������ ������ ���ϸ� ���ӿ��� ���� �˴ϴ�.");
		System.out.println("============================================================\n");
		
		System.out.print("�ֻ����� ����� �����Ͽ� �Է����ֽʽÿ�: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count = 0;
		
//		IntSupplier is = new IntSupplier() // @FunctionalInterface // �͸�����ü
//		{
//			@Override
//			public int getAsInt() // �Ű������� ���� ��ȯ���� ���� => ex)�ֻ���
//			{
//				int result = (int)(Math.random()*6)+1;
//				return result;
//			}
//		};
//		int dice = is.getAsInt();
//		System.out.println("�ֻ����� ��: " + dice);
		
		IntSupplier is = () -> // @FunctionalInterface // �͸�����ü
		{
			int result = (int)(Math.random()*6)+1;
			return result;
		};
		int dice = is.getAsInt();
		
		if(input == dice)
		{
			System.out.println("[���] �����մϴ�. �����Դϴ�.");
			System.out.println("[����] ��ǻ�Ͱ� ������ �ֻ����� ��: " + dice);
		}
		else
		{
			count++;
			System.out.println("[���] ��Ÿ�����ϴ�. �����Դϴ�.\n");
			do
			{
				System.out.printf("�ٽ� �� �� �ֻ����� ����� �����Ͽ� �Է����ֽʽÿ�: ");
				Scanner sc_re = new Scanner(System.in);
				input = sc_re.nextInt();
				
				if(input == dice)
				{
					System.out.println("[���] �����մϴ�. �����Դϴ�.");
					System.out.println("[����] ��ǻ�Ͱ� ������ �ֻ����� ��: " + dice);
					break;
				}
				else
				{
					System.out.println("[���] ��Ÿ�����ϴ�. �����Դϴ�.\n");
					count++;
				}
			} while(count<3);
		}
		if(count >= 3)
			System.out.println("Game Over!");
		else
			System.out.println("[���] " + (count+1) + "���� �������� ������ ���߾����ϴ�.");
	}
}
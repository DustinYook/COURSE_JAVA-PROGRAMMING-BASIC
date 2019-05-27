package p01.character;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx1 
{
	public static void main(String[] args) 
	{
		FileReader f = null; // ���������� �ʱ�ȭ �����־�� ��
		try 
		{
//			f = new FileReader("C:/Users/aomor/Desktop/JavaBasic/Ch15_IO/src/p01/character"); // ������1
//			f = new FileReader("C:\\Users\\aomor\\Desktop\\JavaBasic\\Ch15_IO\\src\\p01\\character"); // ������2
			f = new FileReader("spring.txt"); // window10�� ���� �ִ��� ��� // ���ϸ� ���� ���(�����)
			while(true)
			{
				int data = f.read();
				if(data == -1) // -1�� �� ���� ���� ���ٴ� �ǹ� (���̶�� �ǹ�)
					break; // �� �̻� ���� ������ ���� ��� while��� Ż��
				char ch = (char)data; // ���������ȯ // �о���� ������
				System.out.print(ch);
			}
		} 
		catch (FileNotFoundException e) // ������ ã�� ���ϴ� ���
		{ 
			System.out.println("������ �������� �ʽ��ϴ�.");
		} // ���ܸ� ó�������� ������ ������ ������ �� => Checked Exception
		
		catch (IOException e) // ������ ������ ���ϴ� ���
		{
			System.out.println("������ ���� �� �����ϴ�.");
		}
		
		finally
		{
			try
			{
				f.close();
			}
			
			catch(IOException e)
			{
				System.out.println("������ ���� �� �����ϴ�.");
			}
			
			catch(NullPointerException e)
			{
				System.out.println("�ݵ�� �����ϴ� ��");
			}
		}
		
	}
}
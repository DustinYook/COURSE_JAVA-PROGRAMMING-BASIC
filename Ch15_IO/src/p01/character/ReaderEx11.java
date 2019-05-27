package p01.character;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx11 
{
	public static void main(String[] args) 
	{
		FileReader f = null;
		try 
		{
			f = new FileReader("abc.txt"); 
			while(true)
			{
				int data = f.read();
				if(data == -1) 
					break; 
				char ch = (char)data; 
				System.out.print(ch);
			}
		} 
		catch (FileNotFoundException e) // ������ ã�� ���ϴ� ���
		{ 
			System.out.println("������ �������� �ʽ��ϴ�.");
		} 
		
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
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
		catch (FileNotFoundException e) // 파일을 찾지 못하는 경우
		{ 
			System.out.println("파일이 존재하지 않습니다.");
		} 
		
		catch (IOException e) // 읽지도 쓰지도 못하는 경우
		{
			System.out.println("파일을 읽을 수 없습니다.");
		}
		
		finally
		{
			try
			{
				f.close();
			}
			catch(IOException e)
			{
				System.out.println("파일을 닫을 수 없습니다.");
			}
			catch(NullPointerException e)
			{
				System.out.println("반드시 실행하는 곳");
			}
		}	
	}
}
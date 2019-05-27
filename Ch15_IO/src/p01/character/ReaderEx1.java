package p01.character;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderEx1 
{
	public static void main(String[] args) 
	{
		FileReader f = null; // 지역변수는 초기화 시켜주어야 함
		try 
		{
//			f = new FileReader("C:/Users/aomor/Desktop/JavaBasic/Ch15_IO/src/p01/character"); // 절대경로1
//			f = new FileReader("C:\\Users\\aomor\\Desktop\\JavaBasic\\Ch15_IO\\src\\p01\\character"); // 절대경로2
			f = new FileReader("spring.txt"); // window10에 파일 있는지 물어봄 // 파일명 쓰는 방법(상대경로)
			while(true)
			{
				int data = f.read();
				if(data == -1) // -1은 더 읽을 것이 없다는 의미 (끝이라는 의미)
					break; // 더 이상 읽을 내용이 없는 경우 while블록 탈출
				char ch = (char)data; // 명시적형변환 // 읽어오지 않으면
				System.out.print(ch);
			}
		} 
		catch (FileNotFoundException e) // 파일을 찾지 못하는 경우
		{ 
			System.out.println("파일이 존재하지 않습니다.");
		} // 예외를 처리해주지 않으면 빨간색 나오는 것 => Checked Exception
		
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
package p03.data_object;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx1 // 주 스트림의 내용을 보조스트림에 넣어주어야 함
{
	public static void main(String[] args) 
	{
		FileInputStream f = null;
		DataInputStream d = null;
		try 
		{
			f = new FileInputStream("data.dat"); // dat는 2진 파일
			d = new DataInputStream(f); // 보조스트림: 밖에서 날라오는 것을 받음
			while(true)
			{
				int data = d.readInt();
				System.out.println(data);
			}
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch (IOException e) 
		{
			System.out.println("파일을 읽을 수 없습니다.");
		}
		try 
		{
			f.close();
		} 
		catch (IOException e) 
		{
			System.out.println("파일을 닫을 수 없습니다.");
		}
	}
}
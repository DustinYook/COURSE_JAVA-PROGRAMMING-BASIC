package p02.byte_based;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx1 
{
	public static void main(String[] args) 
	{
		FileOutputStream f = null;
		try 
		{
			f= new FileOutputStream("output.dat");
			byte arr[] = {0,1,2,3,4,5,6,7,8,9,10};
			for(int cnt = 0; cnt < arr.length; cnt++)
				f.write(arr[cnt]);
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("파일을 찾을 수 없습니다.");
		}
		catch (IOException e) 
		{
			System.out.println("파일을 출력할 수 없습니다.");
		}
	}
}
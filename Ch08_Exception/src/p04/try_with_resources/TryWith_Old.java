package p04.try_with_resources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// checked exception: try, catch를 하지 않으ㅇ면 컴파일 에러가 발생 => try,catch를 이용하여 처리
// 예) ClassNotFoundException
//    java.lang.CloneNotSupportedException
//    java.lang.InterruptedException
//    java.lang.ReflectiveOperationException
public class TryWith_Old 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader f = new FileReader("some.txt"); // checked exception => 이거를 먼저 만들고 try,catch를 해야함
			f.close(); // 과거 방식: 과거에는 파일을 열명 닫아주어야 했었음 => try_with_resources에서는 생략가능 // 예외처리를 하게 해야 함
		}
		catch (FileNotFoundException e1)
		{
			System.out.println("파일을 찾을 수 없습니다.");
		}
		catch (IOException e2)
		{
			System.out.println("파일을 닫을 수 없습니다.");
		}
		finally
		{
			System.out.println("정상적으로 파일을 열었습니다.");
		}
	}
}
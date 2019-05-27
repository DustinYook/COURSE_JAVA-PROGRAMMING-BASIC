package p04.try_with_resources;

public class TryWithMain 
{
	public static void main(String[] args) 
	{
		try(TryWith_New t = new TryWith_New("file.txt")) // 객체생성 => 이것이 try_with_resource임
		{ // f.close를 쓰기 싫어서 AutoCloseable을 이용하여 try_with_resource를 구현
			t.read();
			throw new Exception(); // 예외를 발생시킴
		}
		catch (Exception e)
		{
			System.out.println("예외처리코드가 실행되었습니다.");
		}
	}
}
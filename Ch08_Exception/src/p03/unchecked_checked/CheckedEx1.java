package p03.unchecked_checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// checked exception: try, catch�� ���� �������� ������ ������ �߻� => try,catch�� �̿��Ͽ� ó��
// ��) ClassNotFoundException
//    java.lang.CloneNotSupportedException
//    java.lang.InterruptedException
//    java.lang.ReflectiveOperationException
public class CheckedEx1 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader f = new FileReader("some.txt"); // checked exception => �̰Ÿ� ���� ����� try,catch�� �ؾ���
			f.close(); // ���� ���
		}
		catch (FileNotFoundException e1)
		{
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		catch (IOException e2)
		{
			System.out.println("������ ���� �� �����ϴ�.");
		}
		finally
		{
			System.out.println("���������� ������ �������ϴ�.");
		}
	}
}
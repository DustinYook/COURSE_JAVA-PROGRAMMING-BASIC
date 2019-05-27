package p03.data_object;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx1 // �� ��Ʈ���� ������ ������Ʈ���� �־��־�� ��
{
	public static void main(String[] args) 
	{
		FileInputStream f = null;
		DataInputStream d = null;
		try 
		{
			f = new FileInputStream("data.dat"); // dat�� 2�� ����
			d = new DataInputStream(f); // ������Ʈ��: �ۿ��� ������� ���� ����
			while(true)
			{
				int data = d.readInt();
				System.out.println(data);
			}
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch (IOException e) 
		{
			System.out.println("������ ���� �� �����ϴ�.");
		}
		try 
		{
			f.close();
		} 
		catch (IOException e) 
		{
			System.out.println("������ ���� �� �����ϴ�.");
		}
	}
}
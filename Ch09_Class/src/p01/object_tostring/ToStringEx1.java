package p01.object_tostring;
import java.io.File;
// import�� ������� �ʴ� ��Ű��: java.lang => �̿��� ��Ű���� ���� import�� ����ؾ� ��
// toString(): �ڹ� ���� �����ڰ� �����ؼ� ����� �ϼ����� ����
public class ToStringEx1 
{
	public static void main(String[] args) 
	{
		File f = new File("C:\\Spring");
		// File�� �����ڰ� ���� => C:\Spring���� ����ϰ� ����� ����
		String s = f.toString();
		System.out.println(s);
		System.out.println(f);
	}
}
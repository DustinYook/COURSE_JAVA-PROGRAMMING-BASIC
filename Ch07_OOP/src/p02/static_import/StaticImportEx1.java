package p02.static_import;
import java.util.Random; // java.lang�̿��� ���� �ݵ�� ��������� import�� �ؾ���
import static java.lang.System.out;
import static java.lang.Math.*;
// java.lang�̳� java.util ���� ��Ű����! (java.lang�� import�� ���� �ʴ� ��Ű����)

public class StaticImportEx1   
{
	public static void main(String[] args) 
	{
		// 1.������ �����
		System.out.println(Math.random()); // MathŬ������ java.lang�� ���ǵ� => import�� �� �ʿ����
		System.out.println(Math.PI); 
		
		// 2.static import�� ����ϴ� ���: import�� ����ϰ� Ŭ�������� ����
		out.println(random()); // MathŬ������ java.lang�� ���ǵ� => import�� �� �ʿ����
		System.out.println(PI); 
		// using namespace std; => std::cout << endl;�� cout << endl;�� �����ϴ� �Ͱ� ���
		
		Random r = new Random();
	}
}
// static import�� �ڹ� 8.0���� ������ ������
// ���α׷� ����: try, catch ���� �̿��� ����ó��
package p01.basic;
import java.util.Scanner;

public class ExceptionEx2 // Ŭ���� 
{
	public static void main(String[] args) // main Ŭ���� �޼ҵ�
	{
		try // try ������ ������ �߻��� �� �ִ� ������� ���
		{
			System.out.println("�� ���α׷��� �� ������ ������ ������ �����ϴ� ���α׷��Դϴ�.");
			System.out.print("[�Է�] ù���� ���ڸ� �Է����ֽʽÿ�: ");
			Scanner sc1 = new Scanner(System.in);
			int a = sc1.nextInt();
			System.out.print("[�Է�] �ι��� ���ڸ� �Է����ֽʽÿ�: ");
			Scanner sc2 = new Scanner(System.in);
			int b = sc2.nextInt();
			int result = a/b; // Arithmetic Exception�� �߻� 
			System.out.printf("[���] %d / %d = %d\n", a, b, result); // ���� ��߻� �ÿ��� ���� (���ܹ߻� �� skip�ϰ� catch ������ �̵�)
		} 
		catch (Exception e) // ���ܰ� �߻��� ��� �����ϴ� ��
		{
			System.out.println("[���] 0���� ���� �� �����ϴ�. �ٽ� �Է����ֽʽÿ�."); // ���Է� ����
			// try, catch �� ����: surround with - try/catch block
		} 
		finally // �ݵ�� �����ؾ� �ϴ� ���� ���⿡ ���, �ڹ� 7.0������ ���� (��������)
		{
			System.out.println("[�˸�] ���α׷��� �����մϴ�.");
		}	
	}
}
//�������: try -> �����߻� -> catch -> finally(�׻����)
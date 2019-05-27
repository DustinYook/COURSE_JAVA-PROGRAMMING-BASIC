// ���α׷� ����: if���� try,catch ����� �̿��Ͽ� ����ó���ϴ� ���
package p01.basic;

public class ExceptionEx3 // Ŭ���� 
{
	public static void main(String[] args) // main Ŭ���� �޼ҵ� 
	{
		int arr[] = { 5, 4, 3, 2, 1, 0 }; // �迭 ����� ���ÿ� �ʱ�ȭ
		for (int i = 0; i < 10; i++) 
		{
			try // ���� �߻� ���ɼ��� �ִ� ��츦 ���
			{
				int result = 100 / arr[i]; 
				System.out.printf("[ó�����] 100 / %d = %d\n", arr[i], result);
			} 
			catch (Exception e) 
			{
				if (i >= 0 && i < arr.length) // 0�� ��� ����ó��
					System.out.println("[���] 0���� ���� �� �����ϴ�. �ٽ� �� �� �Է����ֽʽÿ�.");
				else // �迭�� ��������� ��� ��� ����ó��
					System.out.println("[���] �迭�� ���尪�� �������� �ʾ� ������ ������ �� �����ϴ�.");
			}
		} System.out.println("\n[�ý��� �˸�] ���α׷��� �����մϴ�.");
	}
}
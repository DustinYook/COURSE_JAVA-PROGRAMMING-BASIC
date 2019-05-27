package p01.basic;

public class ExceptionEx4 
{
	public static void main(String[] args) 
	{
		int arr[] = { 5, 4, 3, 2, 1, 0 }; // �迭 ����� ���ÿ� �ʱ�ȭ

		for (int i = 0; i < 10; i++) 
		{
			try  // try,multi_catch ��: catch�� ���� �� �ִ� ���� ���� (if~else���� ����)
			{
				int result = 100 / arr[i];
				System.out.printf("[ó�����] 100 / %d = %d\n", arr[i], result);
			} 
			catch (ArithmeticException e1) // ������� ���ܰ� �߻��� ��� ����ó�� (i=6)
			{ // e1�� ��������, A~�� Ŭ����
				System.out.println("[���] 0���� ���� �� �����ϴ�. �ٽ� �� �� �Է����ֽʽÿ�.");
			}
			catch (ArrayIndexOutOfBoundsException e2) // �迭������ �ʰ��� ��� ����ó�� (i=6~9)
			{
				System.out.println("[���] �迭�� ���尪�� �������� �ʾ� ������ ������ �� �����ϴ�.");
			}
			catch (Exception e3) // �Ϲ����� ���ܰ� �߻��� ��� ����ó��
			{
				System.out.println("[���] �Ϲ��� ����ó���Դϴ�.");
			}
			// ����) Exception - Array~ - Arithmetic~ �̷��� ������ ������ �߻�
			// ���� �ݵ��  ������ �׹�(Arithmetic, Array)���� ���� �׹�(Exception)�� ���� ������ ���Ѿ� ��!
			// �θ� ���� Ŭ������ �ؿ� ��ġ�ϵ��� �ϴ� ��Ģ�� �ݵ�� ���Ѿ���
		} System.out.println("\n[�ý��� �˸�] ���α׷��� �����մϴ�.");
	}
}


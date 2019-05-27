package p03.unchecked_checked;
// Unchecked Exception: ������ ������ �߻����� �ʰ�, ���� �� ���ܰ� �߻��� => ���࿡ ���� ����ó���� ���־�� ��
public class UncheckedEx1 
{
	public static void main(String[] args) 
	{
		int arr[] = { 5, 4, 3, 2, 1, 0 }; // �迭 ����� ���ÿ� �ʱ�ȭ

		for (int i = 0; i < 10; i++) // ó������ try,catch�� �����صΰ� ������ �� => �����Ϸ��� �˷��ִ� ��� �� ��!
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
//1.����: ���α׷� �ڵ忡 ���ؼ� ������ �� ���� �ɰ��� ����
//2.����: ���α׷� �ڵ忡 ���ؼ� ������ �� �ִ� �ټ� �̾��� ����
//  1) Runtime Exception(����ð� ����) = Unchecked Exception: �������� �ƴϰ�, ���� �� ���ܹ߻� 
//  java.lang.ArithmeticException
//  java.lang.ArrayStoreException
//  java.lang.ClassCastException
//  java.lang.EnumConstantNotPresentException
//  java.lang.IllegalArgumentException
//  java.lang.IllegalThreadStateException
//  java.lang.NumberFormatException
//  java.lang.IllegalMonitorStateException
//  java.lang.IllegalStateException
//  java.lang.IndexOutOfBoundsException
//  java.lang.ArrayIndexOutOfBoundsException
//  java.lang.StringIndexOutOfBoundsException
//  java.lang.NegativeArraySizeException
//  java.lang.NullPointerException
//  java.lang.SecurityException
//  java.lang.TypeNotPresentException
//  java.lang.UnsupportedOperationException
//
//  2)Checked Exception: try,catch�� �̿��Ͽ� ó��
//  java.lang.CloneNotSupportedException
//  java.lang.InterruptedException
//  java.lang.ReflectiveOperationException

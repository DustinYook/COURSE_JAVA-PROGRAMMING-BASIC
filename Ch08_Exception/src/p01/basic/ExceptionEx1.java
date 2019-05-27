// ����: ���ܰ� �߻��ϴ� ��쿡 ���� ����
package p01.basic;

public class ExceptionEx1 // Ŭ���� 
{
	public static void main(String[] args) // main�޼ҵ� 
	{
		int a = 3, b = 0;
		int result = a/b; // ArithmeticException: 0���� ������ ���ܹ߻� -> ���α׷� ���� �� �߻��ϴ� ����
		System.out.println(result);
		System.out.println("The system will be closed");
	}
}
//1.����������(Syntax Error): ���α׷� �ڵ忡 ���ؼ� ������ �� ���� �ɰ��� ����
//2.��������(Logical Error): �ڵ忡 ���� ����� ����� �ǵ��� �ٸ��� ������ ��
//3.����(Exception): ���α׷� �ڵ忡 ���ؼ� ������ �� �ִ� �ټ� �̾��� ���� (java.lang�� ExceptionŬ�����μ� ����)
//1)Runtime(Unchecked) Exception: ������ �ð� �ƴ�  ���� �� ���ܹ߻� 
//  java.lang.ArithmeticException
//  java.lang.ArrayStoreException
//  java.lang.ClassCastException
//  java.lang.EnumConstantNotPresentException
//  java.lang.IllegalArgumentException
//  java.lang.IllegalMonitorStateException
//  java.lang.IllegalStateException
//  java.lang.IndexOutOfBoundsException
//  java.lang.NegativeArraySizeException
//  java.lang.NullPointerException
//  java.lang.SecurityException
//  java.lang.TypeNotPresentException
//  java.lang.UnsupportedOperationException
//2)Checked Exception: try,catch����� �̿��Ͽ� ����ó��
//  java.lang.CloneNotSupportedException
//  java.lang.InterruptedException
//  java.lang.ReflectiveOperationException
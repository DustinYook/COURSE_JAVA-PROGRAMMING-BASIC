package p01.unary;

public class OperatorEx01 
{
	public static void main(String[] args) 
	{
		int i = 5; // ���Կ�����: ���� 5�� �������� i�� �����Ѵ�
		// i++; // ������ ������ �����Ŵ
		System.out.println(i++); // ��ġ ����������: i = i; -> i = i + 1;
		System.out.println(i);
		
		int j = 5;
		System.out.println(++j); // ��ġ ����������: j = j + 1; -> j = j; 
		System.out.println(j);
		
		i = 5;
		++i;
		System.out.println(i);
	}
}
// i++ or ++i: ����������, ���׿�����(�ǿ����ڰ� 1��) => ���������ڴ� ������ ���尪�� ��ȭ��Ŵ
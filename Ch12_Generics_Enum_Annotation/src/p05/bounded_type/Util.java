package p05.bounded_type;

public class Util 
{
	// NumberŬ������ ��ӹ��� Ŭ����: Byte, Short, Integer, Long, Float, Double (Wrapper Class)
	// 1.���ѵ� �Ű����� Ÿ��
	public static <T extends Number> int compare(T t1, T t2) // �Ű������� Ÿ���� ���� 6���� Ÿ������ ������Ŵ (���� ���� ��밡��)
	{
		double v1 = t1.doubleValue(); // doubleValue(): Double�� ������ �޾Ƽ� double�� ��ȯ
		double v2 = t2.doubleValue(); 
		return Double.compare(v1, v2); // �� ���� ���������� �� (v1>v2: 1, v1==v2:0, v1<v2:-1)
		// ���ؼ� �����ϴµ� �̿���!
	}
}
package p07.instance_static_initialize;

public class StaticBlockTest 
{
	// ���ۼ���: Ŭ���� �ʱ�ȭ��� -> �ν��Ͻ� �ʱ�ȭ��� -> ������
	// �뵵: main�޼ҵ庸�� ���� ����
	static int arr[] = new int[10]; // Ŭ���� �迭���� ����
	static // Ŭ���� �ʱ�ȭ���
	{
		for(int i = 0; i < arr.length; i++)
		{
			// 1���� 10������ ������ ���� arr�� �� �迭������ ����
			arr[i] = (int)(Math.random()*10)+1; // ����� ����ȯ�� �̿��Ͽ� double->int�� ��ȯ (��ȯ�� ����: 1~10)
			// MathŬ������ ���ǵ� random()�޼ҵ�: ��ȯ���� double��, 0.0 < ��ȯ�� < 1.0
		}
	}
	
	public static void main(String[] args) 
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}
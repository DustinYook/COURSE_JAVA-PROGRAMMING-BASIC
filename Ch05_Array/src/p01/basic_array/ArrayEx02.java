// ���α׷� ����: �迭�� ���� ���� #2
package p01.basic_array;
public class ArrayEx02 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[3]; // �迭 ���� + �޸� �Ҵ� (arr:�迭����) 
		int num = 0;
		
		for(int i = 0; i < arr.length; i++) // �迭������ �ʱ�ȭ 
		{
			arr[i] = num++;
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}
}
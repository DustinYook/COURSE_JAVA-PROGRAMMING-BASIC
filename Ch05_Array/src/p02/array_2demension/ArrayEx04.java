// ���α׷� ����: 1���� �迭�� 2���� �迭
package p02.array_2demension;

public class ArrayEx04 
{
	public static void main(String[] args) 
	{
		// 1.1���� �迭 (���� ���� ���)
		int arr[] = {0,1,2,3};
		System.out.printf("1���� �迭�� ����: %d\n", arr.length);
		for(int i : arr) // �迭��½ÿ��� ���� for��
			System.out.printf("%d ", i);
		System.out.println();
	
		// 2.2���� �迭             0�� �ε���        1�� �ε���          2�� �ε���
		int table[][] = {{0,0,0,1}, {0,0,1,1}, {0,1,1,1}}; // 2���� �迭�� ����: �迭������[��][��]
		System.out.printf("2���� �迭�� ����: %d\n", table.length); // length�� ĭ�� ������ ��ȯ
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 4; j++)
				System.out.printf("a[%d][%d] = %d\n",i,j,table[i][j]);
			System.out.println();
		}
	}
}
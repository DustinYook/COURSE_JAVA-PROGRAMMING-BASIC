// ���α׷� ����: �迭�� ����
package p02.array_2demension;

public class ArrayCopyEx 
{
	public static void main(String[] args) 
	{
		String src[] = {"java", "array", "copy"}; // �迭����� ���ÿ� �ʱ�ȭ
		String dest1[] = new String[src.length];
		String dest2[] = new String[src.length];
		
		// 1. arraycopy()�޼ҵ带 �̿��� �迭����
		System.arraycopy(src, 0, dest1, 0, src.length); 
		for(String str : dest1) // ���� for��
			System.out.printf("%s ", str);
		System.out.println();
		
		// 2. for���� �̿��� �迭����
		for(int i = 0; i < dest2.length; i++) // ������ for��
		{
			dest2[i] = src[i];
			System.out.printf("%s ", dest2[i]);
		}
			
	}
}
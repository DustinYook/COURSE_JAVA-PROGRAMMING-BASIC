// ���α׷� ����: Television�� ��ü���� �� ����� #4 (��ü�迭)
package p01.obj_class;

public class TvTest4 
{
	public static void main(String[] args) 
	{
		// 1.��ü�迭����
		Television tv[] = new Television[3]; // ĭ�� Ŭ���� ������ ����
		
		// 2.��ü�迭�� �ν��Ͻ�ȭ �� �ʱ�ȭ
		for(int i = 0; i < tv.length; i++)
		{
			tv[i] = new Television(); // �ν��Ͻ�ȭ
			tv[i].channel = i; // �ʱ�ȭ
			System.out.printf("tv[%d].channel: %d\n", i, tv[i].channel);
		} System.out.println();
		
		// 3.��ü�迭�� ����޼ҵ� ȣ��
		for(int j = 0; j < tv.length; j++)
		{
			tv[j].channelUp(); // channel�� ���尪�� 1 ������Ŵ
			System.out.printf("tv[%d].channel: %d\n", j, tv[j].channel);
		} System.out.println();
		
		for(int k = 0; k < tv.length; k++)
		{
			tv[k].channelDown(); // channel�� ���尪�� 1 ���ҽ�Ŵ
			System.out.printf("tv[%d].channel: %d\n", k, tv[k].channel);
		} System.out.println();
	}
}
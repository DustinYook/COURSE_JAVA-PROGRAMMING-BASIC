// ���α׷� ����: Television�� ��ü���� �� ����� #3 (��ü����)
package p01.obj_class;

public class TvTest3 
{
	public static void main(String[] args) 
	{
		// 1.��ü���� (�ν��Ͻ�ȭ)
		Television tv3_1 = new Television();
		tv3_1.channel = 7;
		tv3_1.color = "green";
		tv3_1.power = false;
		// �ڵ��ϼ����(ctrl + space)�� ����ϸ� ��Ÿ�� ���� ������������
		
		Television tv3_2 = new Television();		
		tv3_2 = tv3_1; // ��ü����: �迭�� ����� ������ ����
		
		System.out.printf("tv3_1.channel: %d\n", tv3_1.channel);
		System.out.printf("tv3_2.channel: %d\n\n", tv3_2.channel);
		
		System.out.printf("tv3_1.color: %s\n", tv3_1.color);
		System.out.printf("tv3_2.color: %s\n\n", tv3_2.color);
		
		System.out.printf("tv3_1.power: %b\n", tv3_1.power);
		System.out.printf("tv3_2.power: %b\n\n", tv3_2.power);
	}
}
// ���α׷� ����: Television�� ��ü���� �� ����� #2 (��ü �ν��Ͻ�ȭ & �ʱ�ȭ)
package p01.obj_class;

public class TvTest2 
{
	public static void main(String[] args) 
	{
		// 1.��ü���� (�ν��Ͻ�ȭ)
		Television tv2_1 = new Television(); 
		Television tv2_2 = new Television(); 
		// �������� tv2_1, tv2_2�� ����� Ŭ������ �����ּҸ� ����
		
		// 2.��������� ����
		System.out.printf("tv2_1.channel: %d\n", tv2_1.channel);
		System.out.printf("tv2_2.channel: %d\n\n", tv2_1.channel);
		
		// 3.������� �ʱ�ȭ
		tv2_1.channel = 7; 
		tv2_2.channel = 8;
		System.out.printf("tv2_1.channel: %d\n", tv2_1.channel);
		System.out.printf("tv2_2.channel: %d\n\n", tv2_1.channel);
	
		tv2_1.color = "red";
		tv2_2.color = "blue";
		System.out.printf("tv2_1.color: %s\n", tv2_1.color);
		System.out.printf("tv2_2.color: %s\n\n", tv2_2.color);
		
		tv2_1.power = true;
		tv2_2.power = false;
		System.out.printf("tv2_1.power: %b\n", tv2_1.power);
		System.out.printf("tv2_2.power: %b\n\n", tv2_2.power);
	}
}
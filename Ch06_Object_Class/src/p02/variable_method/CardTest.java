// ���α׷� ����: Ŭ���� ������ �ν��Ͻ� ����
package p02.variable_method;

public class CardTest 
{
	public static void main(String[] args) 
	{
		// 1.Ŭ���� ������ ���: ��ü�������� ��Ʈ�����ڷ� ����
		System.out.printf("card Ŭ������ width: %d\n", Card.width);
		System.out.printf("card Ŭ������ height: %d\n\n", Card.height);
		
		// 2.�ν��Ͻ� ������ ���: ��ü���� ��, ��Ʈ�����ڷ� ����
		// 1) ��ü����
		Card c1 = new Card(); 
		Card c2 = new Card();
		// 2) ��Ʈ�����ڷ� ����
		c1.kind = "Heart"; 
		c2.kind = "Spade";
		c1.num = 7;
		c2.num = 4;
		
		System.out.printf("c1�� kind: %s\nc2�� kind: %s\n\n", c1.kind, c2.kind);
		System.out.printf("c1�� num: %d\nc2�� num: %d\n\n", c1.num, c2.num);
		
		// ����) Ư�� �ν��Ͻ��� Ŭ���������� ���� �ٲٸ� ��� �ν��Ͻ����� Ŭ���������� ���尪�� ���� �ٲ�
		c1.width = 50;
		System.out.printf("c1�� width: %d\nc2�� width: %d\n\n", c1.width, c2.width); 
		
		c2.height = 80;
		System.out.printf("c1�� height: %d\nc2�� height: %d\n\n", c1.height, c2.height); 
		
		System.out.printf("card Ŭ������ width: %d\n", Card.width);
		System.out.printf("card Ŭ������ height: %d\n\n", Card.height);
	}
}
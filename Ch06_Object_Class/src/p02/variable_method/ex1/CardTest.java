// ���α׷� ����: get�޼ҵ�� set�޼ҵ��� Ȱ��
package p02.variable_method.ex1;

public class CardTest 
{
	public static void main(String[] args) 
	{
		// 1.��ü���� (�ν��Ͻ�ȭ)
		Card c = new Card();
		
		// 2.set �޼ҵ带 �̿��� ������� �ʱ�ȭ
		c.setKind("Heart");
		c.setNum(7);
		
		// 3.get �޼ҵ带 �̿��� ������� ���尪 �о����
		System.out.printf("c.kind: %s\n", c.getKind());
		System.out.printf("c.num: %d\n\n", c.getNum());
	}
}
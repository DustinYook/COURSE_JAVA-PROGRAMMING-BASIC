// ���α׷� ����: ��ü(�ν��Ͻ�)�� ��������� �ʱ�ȭ�ϴ� ���  #�ݵ�� �˾Ƶα�!
package p04.class_method;

public class ClassEx1 
{
	public static void main(String[] args) 
	{
		// 1.��Ʈ�����ڸ� �̿��ϴ� ���
		GoodStock g = new GoodStock(); // ��ü���� (�ν��Ͻ�ȭ)
		g.goodsCode = "5111";
		g.stockNum = 200;
		System.out.println("��ǰ�ڵ�: " + g.goodsCode);
		System.out.println("������: " + g.stockNum + "��\n");
		
		// 2.getter & setter �޼ҵ带 �̿��ϴ� ���
		g.setGoodsCode("a1234"); // set�Լ��� �̿��ϸ� �����Ͱ� �����
		g.setStockNum(500);
		String code = g.getGoodsCode();
		int qty = g.getStockNum();
		System.out.println("��ǰ�ڵ�: " + code);
		System.out.println("������: " + qty + "��\n");
		
		// 3.�����ڸ� ����ϴ� ���
		GoodStock g2 = new GoodStock("b111", 300); // ��ȣ���� ���� �μ�(argument)
		System.out.println("��ǰ�ڵ�: " + g2.goodsCode); // ��Ʈ�����ڸ� ���� ��������
		System.out.println("������: " + g2.getStockNum() + "��\n"); // getter�޼ҵ带 �̿��ϴ� ���
		
		// ���尪 �����ϱ� ("c1234", 50)
		g2.goodsCode = "c1234"; // 1-1)��Ʈ�����ڷ� �����ϴ� ���
		g2.setStockNum(50); // 1-2)setter�޼ҵ带 �̿��ϴ� ���
		System.out.println("��ǰ�ڵ�: " + g2.goodsCode); // 2-1)��Ʈ�����ڸ� ���� ��������
		System.out.println("������: " + g2.getStockNum() + "��\n"); // 2-2)getter�޼ҵ带 �̿��ϴ� ���
	}
}
package p04.class_method;

public class GoodStock 
{
	// 1.�������
	String goodsCode; // ��ǰ�ڵ� 
	int stockNum; // ������
	// ����) �������� �ҹ��ڷ� ����

	// 2.get�޼ҵ�� set�޼ҵ��� ���Ǻ�
	public String getGoodsCode() // getter�޼ҵ�: ����� �����͸� �������� (Read)
	{
		return goodsCode; // ��������� ���尪�� ����
	}
	public void setGoodsCode(String goodsCode) // setter�޼ҵ�: �����ϴ� ���� (Write)
	{
		this.goodsCode = goodsCode; // ��������� ���� ����
	} 
	
	public int getStockNum() 
	{
		return stockNum;
	}
	public void setStockNum(int stockNum) 
	{
		this.stockNum = stockNum; // this������: �ڱ� �ڽ��� ���� �ִ� Ŭ����(GoodStock)�� ����Ű�� ������
	}
	
	// 3.����Ʈ ������ (Default Constructor) = �⺻������
	public GoodStock() // �������� Ư��: ��ȯ���� �ƿ� ���� (void���� �ƴ�), �������� �̸��� Ŭ������� ������ ���� 
	{ 
	} // �����ڰ� ������ �ִ� ���: ������ �����ε��̶� ���
	
	// 4.������(Constructor): �Ű������� ����, ��ü���� �� �ʱ갪�� �����ϴ� �뵵
	public GoodStock(String str, int num) // ��ȣ���� ���� �Ű�����(parameter)
	{ // �߿�) Ÿ���� main�޼ҵ��� �μ�(argument)���� ���� �� Ÿ�԰� ��ġ�ؾ� ��
		this.goodsCode = str; 
		this.stockNum = num;
		// this.goodsCode = goodsCode; // ���� �������� �� ���
	}
}
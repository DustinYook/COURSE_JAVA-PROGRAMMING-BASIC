package p01.object_tostring;

public class GoodStock 
{
	String goodsCode;
	int stockNum;
	
	public GoodStock(String goodsCode, int stockNum) // ������
	{
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	@Override // ������(�޼ҵ� �������̵�)
	public String toString() 
	{
		String str = "��ǰ�ڵ�: " + goodsCode + "\n������: " + stockNum;
		return str;
	}
}
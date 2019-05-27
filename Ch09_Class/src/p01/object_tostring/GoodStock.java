package p01.object_tostring;

public class GoodStock 
{
	String goodsCode;
	int stockNum;
	
	public GoodStock(String goodsCode, int stockNum) // 생성자
	{
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	@Override // 재정의(메소드 오버라이딩)
	public String toString() 
	{
		String str = "상품코드: " + goodsCode + "\n재고수량: " + stockNum;
		return str;
	}
}
package p04.class_method;

public class GoodStock 
{
	// 1.멤버변수
	String goodsCode; // 상품코드 
	int stockNum; // 재고수량
	// 참고) 변수명은 소문자로 시작

	// 2.get메소드와 set메소드의 정의부
	public String getGoodsCode() // getter메소드: 저장된 데이터를 가져오기 (Read)
	{
		return goodsCode; // 멤버변수의 저장값을 전달
	}
	public void setGoodsCode(String goodsCode) // setter메소드: 저장하는 역할 (Write)
	{
		this.goodsCode = goodsCode; // 멤버변수의 값을 갱신
	} 
	
	public int getStockNum() 
	{
		return stockNum;
	}
	public void setStockNum(int stockNum) 
	{
		this.stockNum = stockNum; // this포인터: 자기 자신이 속해 있는 클래스(GoodStock)를 가르키는 포인터
	}
	
	// 3.디폴트 생성자 (Default Constructor) = 기본생성자
	public GoodStock() // 생성자의 특성: 반환형이 아예 없음 (void조차 아님), 생성자의 이름은 클래스명과 완전히 동일 
	{ 
	} // 생성자가 여러개 있는 경우: 생성자 오버로딩이라 명명
	
	// 4.생성자(Constructor): 매개변수가 존재, 객체생성 시 초깃값을 저장하는 용도
	public GoodStock(String str, int num) // 괄호안의 것을 매개변수(parameter)
	{ // 중요) 타입이 main메소드의 인수(argument)들의 순서 및 타입과 일치해야 함
		this.goodsCode = str; 
		this.stockNum = num;
		// this.goodsCode = goodsCode; // 같은 변수명을 쓸 경우
	}
}
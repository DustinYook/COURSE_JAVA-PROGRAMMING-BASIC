// 프로그램 설명: 객체(인스턴스)의 멤버변수를 초기화하는 방법  #반드시 알아두기!
package p04.class_method;

public class ClassEx1 
{
	public static void main(String[] args) 
	{
		// 1.도트연산자를 이용하는 방법
		GoodStock g = new GoodStock(); // 객체생성 (인스턴스화)
		g.goodsCode = "5111";
		g.stockNum = 200;
		System.out.println("상품코드: " + g.goodsCode);
		System.out.println("재고수량: " + g.stockNum + "개\n");
		
		// 2.getter & setter 메소드를 이용하는 방법
		g.setGoodsCode("a1234"); // set함수를 이용하면 데이터가 저장됨
		g.setStockNum(500);
		String code = g.getGoodsCode();
		int qty = g.getStockNum();
		System.out.println("상품코드: " + code);
		System.out.println("재고수량: " + qty + "개\n");
		
		// 3.생성자를 사용하는 방법
		GoodStock g2 = new GoodStock("b111", 300); // 괄호안의 것을 인수(argument)
		System.out.println("상품코드: " + g2.goodsCode); // 도트연산자를 통해 직접접근
		System.out.println("재고수량: " + g2.getStockNum() + "개\n"); // getter메소드를 이용하는 방법
		
		// 저장값 변경하기 ("c1234", 50)
		g2.goodsCode = "c1234"; // 1-1)도트연산자로 접근하는 방법
		g2.setStockNum(50); // 1-2)setter메소드를 이용하는 방법
		System.out.println("상품코드: " + g2.goodsCode); // 2-1)도트연산자를 통해 직접접근
		System.out.println("재고수량: " + g2.getStockNum() + "개\n"); // 2-2)getter메소드를 이용하는 방법
	}
}
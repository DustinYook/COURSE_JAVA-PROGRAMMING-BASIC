// 프로그램 설명: get메소드와 set메소드의 활용
package p02.variable_method.ex1;

public class CardTest 
{
	public static void main(String[] args) 
	{
		// 1.객체생성 (인스턴스화)
		Card c = new Card();
		
		// 2.set 메소드를 이용한 멤버변수 초기화
		c.setKind("Heart");
		c.setNum(7);
		
		// 3.get 메소드를 이용한 멤버변수 저장값 읽어오기
		System.out.printf("c.kind: %s\n", c.getKind());
		System.out.printf("c.num: %d\n\n", c.getNum());
	}
}
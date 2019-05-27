// 프로그램 설명: 클래스 변수와 인스턴스 변수
package p02.variable_method;

public class CardTest 
{
	public static void main(String[] args) 
	{
		// 1.클래스 변수의 사용: 객체생성없이 도트연산자로 접근
		System.out.printf("card 클래스의 width: %d\n", Card.width);
		System.out.printf("card 클래스의 height: %d\n\n", Card.height);
		
		// 2.인스턴스 변수의 사용: 객체생성 후, 도트연산자로 접근
		// 1) 객체생성
		Card c1 = new Card(); 
		Card c2 = new Card();
		// 2) 도트연산자로 접근
		c1.kind = "Heart"; 
		c2.kind = "Spade";
		c1.num = 7;
		c2.num = 4;
		
		System.out.printf("c1의 kind: %s\nc2의 kind: %s\n\n", c1.kind, c2.kind);
		System.out.printf("c1의 num: %d\nc2의 num: %d\n\n", c1.num, c2.num);
		
		// 주의) 특정 인스턴스의 클래스변수의 값을 바꾸면 모든 인스턴스들의 클래스변수의 저장값도 따라서 바뀜
		c1.width = 50;
		System.out.printf("c1의 width: %d\nc2의 width: %d\n\n", c1.width, c2.width); 
		
		c2.height = 80;
		System.out.printf("c1의 height: %d\nc2의 height: %d\n\n", c1.height, c2.height); 
		
		System.out.printf("card 클래스의 width: %d\n", Card.width);
		System.out.printf("card 클래스의 height: %d\n\n", Card.height);
	}
}
// 프로그램 설명: Card의 클래스 정의부
package p02.variable_method.ex1;

public class Card  
{
	// 1.인스턴스 변수
	String kind;
	int num;
	
	// 2.클래스 변수 
	static int width = 100;
	static int height = 250;

	// 3.get메소드와 set메소드: 이 둘은 항상 쌍으로 붙어다님
	// 자동생성방법: source(alt + shift + s) - generate getters and setters
	public String getKind() // get 메소드: 저장 데이터를 읽어 외부로 전달하는 메소드
	{
		return kind; 
	}
	public void setKind(String k) // set 메소드: 데이터를 외부로부터 받아 저장하는 메소드
	{
		this.kind = k; // this 포인터: 각 인스턴스들의 인스턴스 변수에 접근하도록 도와 줌  #추가학습
	}
	
	public int getNum() 
	{
		return num;
	}
	public void setNum(int n) 
	{
		this.num = n; 
	}
	
	public static int getWidth() 
	{
		return width;
	}
	public static void setWidth(int width) 
	{
		Card.width = width; // 클래스변수는 this포인터가 필요없음
	}
	
	public static int getHeight() 
	{
		return height;
	}
	public static void setHeight(int height) 
	{
		Card.height = height;
	}
}
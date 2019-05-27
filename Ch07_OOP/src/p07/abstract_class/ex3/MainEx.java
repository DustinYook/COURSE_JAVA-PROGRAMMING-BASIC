// Figure라는 추상클래스 만들고, 그 안에 추상메소드(void area(int a, int b);)를 만듦
// 사각형의 면적을 구하는 클래스(SquareArea)를 만듦
// 삼각형의 면적을 구하는 클래스(TriangleArea)를 만듦
// main메소드에 결과를 출력(입력값:20,30)
package p07.abstract_class.ex3;

public class MainEx 
{
	public static void main(String[] args) 
	{
		int a = 20, b = 30; // 입력변수
		
		// 자식클래스의 객체를 생성
		TriangleArea t = new TriangleArea();
		SquareArea s = new SquareArea();
		// 생성자 이용해서 TriangleArea(20,30)으로 하는 방법도 있음!
		
		// 재정의된 추상메소드 호출
		t.area(a,b);
		s.area(a,b);
		
		// 이와 같은 형태가 있음 => 다형성(polymorphism): 부모의 타입을 여러 자식객체를 참조하는 것
		Figure f1 = new SquareArea();  // 참조: 가리킴 (포인터 개념_
		Figure f2 = new TriangleArea();
		Figure f; // figure는 부모클래스
		f = new SquareArea();
		f = new TriangleArea();
		// 사용하는 이유: 하나의 참조변수로 여러 자식객체를 가르킬 수 있음
		// 다형성의 종류는 여러가지 있음
	}
}
// 내일은 인터페이스와 다형성에 대해 학습 => 중요!
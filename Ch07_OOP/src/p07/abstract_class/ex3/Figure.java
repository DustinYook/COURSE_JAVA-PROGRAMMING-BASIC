// Figure라는 추상클래스 만들고, 그 안에 추상메소드(void area(int a, int b);)를 만듦
// 사각형의 면적을 구하는 클래스(SquareArea)를 만듦
// 삼각형의 면적을 구하는 클래스(TriangleArea)를 만듦
// main메소드에 결과를 출력(입력값:20,30)
package p07.abstract_class.ex3; 

//부모클래스
public abstract class Figure // 추상메소드를 포함하면 반드시 abstract를 붙여야 함!
{
	abstract void area(int a, int b); // 추상메소드 만듦 
	// 변수의 타입과 메소드의 이름이 정해져 있음 => 일관성과 강제성!
}
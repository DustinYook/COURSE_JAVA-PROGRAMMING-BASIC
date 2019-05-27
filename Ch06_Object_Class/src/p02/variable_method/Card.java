// 프로그램 설명: Card의 클래스 정의부
package p02.variable_method;

public class Card  
{
	// 1.인스턴스 변수(instance variable): 사용위해 객체생성필요 (값이 가변적인 경우)
	String kind;
	int num; 
	// static 키워드가 없으면 인스턴스화가 되어있지 않음
	
	// 2.클래스 변수(class variable): 객체생성없이 도트연산자로 접근 (값이 고정적인 경우)
	static int width = 100; // 카드의 너비와 높이는 바뀌지 않고 일정함
	static int height = 250; 
	// static 키워드가 있으면 인스턴스화가 되어있어 객체생성없이 바로 접근가능
	// 참고) 인스턴스화 방법: "객체생성" 또는 "static 키워드 사용"
}
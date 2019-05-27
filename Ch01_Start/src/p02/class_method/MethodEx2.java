package p02.class_method;

public class MethodEx2 // 클래스를 만든 이유: 써먹기 위해서 틀을 만듦
{
	// main메소드는 시작을 하는 메소드임
	public static void main(String[] args) // static은 메모리(RAM)에 있음 -> 실행가능
	{
		// 객체생성: 클래스를 통채로 복사해서 메모리에 놓은 것, 클래스가 인식이 됨 -> 컴퓨터가 인지 (RAM에 올라옴)
		PrintEx p = new PrintEx();
		p.printCharacter('-', 20); // 뒤의 인수로 이동하려면 tab키 사용
		System.out.println("The Joeun"); // syso + ctrl + space가 단축키 (ctrl + space: 자동완성기능)
		p.printCharacter('*', 20); // ctrl + 마우스 -> open declaration: 호출부로 이동함
	}
}
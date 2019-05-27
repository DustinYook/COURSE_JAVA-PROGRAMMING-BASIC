package p01.basic;

public class MethodEx // 클래스: 대문자로 시작 => 틀을 생성
{
	// static이 붙어 있는 메소드는 메모리(RAM)에 올라와 있음
	public static void main(String[] args)
	{// 순차적으로 실행됨
		// 객체생성: 메모리(RAM)에 올라오게 된다. 
		MethodEx m = new MethodEx(); // 메모리에 올라오게 함
		m.printCharacter('*', 30); // 여기 인수는 아래 매개변수로 전달
		System.out.println("Hello,Java!");
		m.printCharacter('#', 30);
	} // 실행은 여기만 실행함
	
	// 현재 이 상태는 메모리에 올라와 있지 않은 상태임 // 불러올 때만 실행 됨
	public void printCharacter(char ch, int num)  // 메소드: 소문자로 시작
	{
		for(int cnt = 0; cnt < num; cnt++)
			System.out.print(ch);
		System.out.println(); // 줄바꿈 수행
	}
}
// 메모리에 올라와 있다 <=> 컴퓨터가 인지하고 있음
// 메모리에 올라오게 하는 방법 
// CPU <- RAM(메모리) <- SSD/HD
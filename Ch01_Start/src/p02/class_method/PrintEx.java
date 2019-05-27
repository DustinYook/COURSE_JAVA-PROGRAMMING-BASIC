package p02.class_method;

public class PrintEx // 클래스: 벽돌의 틀 -> 틀을 가져다가 써먹음 -> 그렇게 하기 위해서 객체를 생성필요
{ // 지금 이 클래스는 메모리에 올라와 있지 않은 상태 -> 의미있게 가져다 쓰려면 static이 붙은 메소드(main)나 객체를 생성해야함
	// 현재 이 상태는 메모리에 올라와 있지 않은 상태임 // 불러올 때만 실행 됨
	public void printCharacter(char ch, int num) // 메소드(함수):소문자로 시작 => input과 output이 있음
	{
		for (int cnt = 0; cnt < num; cnt++)
			System.out.print(ch);
		System.out.println(); // 줄바꿈 수행
	}
} // 메소드 = 함수: input을 받아 output을 반환 (JAVA에서는 함수라는 용어대신 메소드라는 용어를 사용)
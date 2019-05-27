package p05.break_continue;

public class BreakEx1 
{
	public static void main(String[] args) 
	{
		while(true) // 무한루프 생성
		{
			int num = (int)(Math.random()*6)+1; // 1~6 사이의 임의의 정수값 반환
			System.out.println(num);
			if(num == 6) // 주사위 눈이 6이 나오면 종료
				break; // break문: 반복문(while)을 빠져나온다.
		}System.out.println("프로그램 종료");
	}
}
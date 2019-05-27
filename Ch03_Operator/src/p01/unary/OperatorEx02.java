package p01.unary;

public class OperatorEx02 
{
	public static void main(String[] args) 
	{
		int i = 5, j = 0; 
		j = i++; // i = i; (8번 라인) -> i = i + 1; (9번 라인) 
		System.out.println("j = i++; 실행 후: i = " + i + ", j = " + j + "\n");
		
		i = 5; j = 0; // 자바에서는 이렇게도 쓸 수 있음 (C언어와 착이)
		j = ++i; // i = i + 1; (12번 라인) -> i = i; (13번 라인)
		System.out.println("j = ++i; 실행 후: i = " + i + ", j = " + j);
		
	}
}
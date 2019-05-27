package p04.while_statment;

public class WhileEx1 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int sum = 0;
		while(i <= 10) // while은 조건이 거짓이면 한 번도 실행하지 않을 수 있음
		{
			System.out.println(i);
			sum += i;
			i++;
		} System.out.println(sum);
	}
}
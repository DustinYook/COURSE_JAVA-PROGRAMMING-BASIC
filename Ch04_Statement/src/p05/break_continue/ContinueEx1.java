package p05.break_continue;

public class ContinueEx1 
{
	public static void main(String[] args) 
	{
		int count = 0;
		for(int i = 1; i <= 9; i++)
		{
			if(i%2==0) // 짝수인 경우
			{
				System.out.println(i);
				count++;
				continue; // 짝수인 경우 스킵 => continue 만나면 조건식으로 감
			}	
		} System.out.println("짝수의 개수는 " + count + "개 입니다.");
	}
}
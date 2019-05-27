package p02.for_statement;

public class ForEx1 
{
	public static void main(String[] args) 
	{
		// 주의) i가 1부터 시작하는 것과 0부터 시작하는 것 구분!
		// 1부터 10까지 반복하여 더하는 알고리즘
		int total1 = 0;
		for(int i = 1; i <= 10; i++) // i가 1부터 시작하는 경우: 조건식에 등호가 붙음
			total1 += i;
		System.out.println(total1);
		
		int total2 = 0;
		for(int i = 0; i < 10; i++) //i가 0부터 시작하는 경우: 조건식에 등호가 붙지않음
			total2 += (i+1); // 중괄호가 빠진 경우 바로 밑 한 줄만 for문에 포함됨 
		System.out.println(total2);
		
		int total3 = 0;
		for(int i = 0; i < 10; i++) //i가 0부터 시작하는 경우: 조건식에 등호가 붙지않음
		{
			total3 += (i+1); // 여러문장 수행위해서는 중괄호를 이용해야 함
		} System.out.println(total3);
	}
}

		
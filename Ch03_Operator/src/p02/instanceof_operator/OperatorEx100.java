package p02.instanceof_operator;

public class OperatorEx100 
{
	public static void main(String[] args) 
	{
		boolean a = true;
		boolean b = false;
		
		System.out.println(a&&b); // 논리AND연산(논리곱): 속도가 빠름 => 앞의 항이 false이면 뒤의 항을 skip하고 false결과값 반환
		System.out.println(a||b); // 논리OR연산(논리합): 속도가 빠름 => 앞의 항이 true이면 뒤의 항을 skip하고 true결과값 반환
		System.out.println("!a: " + !a + ", !b: " + !b + "\n"); // 논리NOT연산(논리부정)
		
		System.out.println(a&b); // 비트AND연산: 속도가 느림 => 모든 비트자리값에 대해서 모두 비교하기 때문
		System.out.println(a|b); // 비트OR연산: 속도가 느림 => 모든 비트자리값에 대해서 모두 비교하기 때문
		System.out.println();
		
		// 조건삼항연산자를 이용한 최댓값을 반환하는 알고리즘 구현
		// 조건삼항연산자: 피연산자가 3개 존재 => (조건식) ? 참일때 반환값 : 거짓일때 반환값;
		int a1 = 12, b1 = 4, c1 = 19; 
		int max = (a1 > b1) ? a1 : b1; // max = 12
		max = (max > c1) ? max : c1; // max = 19
		System.out.printf("최댓값은  %d입니다.", max);
		// 스스로 해보기: 최솟값 구하는 알고리즘 구현
	}
}
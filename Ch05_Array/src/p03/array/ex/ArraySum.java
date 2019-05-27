package p03.array.ex;

public class ArraySum 
{
	int a; // 클래스 안에 있는 변수: 전역변수 (field) => 초기화를 해주어도 되고 안해도 됨 (초기화 생략 시 0이 들어감)
	public static void main(String[] args) 
	{
		int scores[] = null; 
		scores = new int[]{83, 90, 97, 99}; // 가변배열형성
		
		int scores2[] = new int[3]; // 객체생성 
		scores2[0] = 83;
		scores2[1] = 90;
		scores2[2] = 97;
		//System.out.println("scores1[0]: " + scores1[0]);
		
		// 1) 합계를 구하는 처리
		int sum = 0; // 지역변수: 메소드 안에 있는 변수, 특정 블록 안에 들어있는 변수  => 반드시 초기화해야 함
		for(int i = 0; i<scores.length; i++)
		{
			// int sum += scores[i];일 때 오류가 나는 이유 => 지역변수는 반드시 초기값을 주어야 함 
			// 안에다 선언을 하면 논리적오류 발생
			sum += scores[i];
		}System.out.println("합계: " + sum + "점");
		
		// 2) 평균을 구하는 처리
		double avg1 = sum/scores.length; // 논리적오류: sum과 scores.length은 int타입이므로 그 결과는 int타입이 됨
		// 그 것을 double로 억지로 형 변환을 시켜 double로 만들다 보니 소숫점 이하 자리가 잘려 항상 .0만 나오게 되는 문제점이 있음
		System.out.println("평균: " + avg1 + "점");
		
		// 해결법 #1
		double avg2 = sum/4.; 
		System.out.println("평균: " + avg2 + "점");
		// 해결법 #2
		double average = (double)sum/(double)scores.length;
		System.out.println("평균: " + average + "점");
	}
}
// 프로그램 설명: 형 변환에 대한 기본적인 내용
package p20.datatype;

public class LongEx 
{
	public static void main(String[] args) 
	{
		long v1 = 10; // 아무 것도 안쓰면 int형 (정수의 디폴트 자료형) => 묵시적 형변환이 일어남
		long v2 = 20L; // L을 명시적으로 붙여주면 long형 
		// int는 4바이트, long은 8바이트 (C언어에서 long은 4바이트)
		long v3 = 1000000000; // 자동형변환(묵시적형변환): L-Value는 8바이트, R-Value는 4바이트  
		long v4 = 100000000000L;
		// int v5 = 100000000000L; // L-value는 4바이트, R-value는 8바이트 (long을 int로 저장) => 데이터소실
		int v5 = (int)100L; // 강제형변환(명시적형변환): cast 연산자의 이용 => 데이터소실은 발생하지 않음
		// 표현범위 내에서 명시적 형변환을 수행하면 데이터 소실이 일어나지 않음, 표현범위 벗어나면 데이터 소실이 발생
		System.out.println(v5); // int형으로 출력
	}
}
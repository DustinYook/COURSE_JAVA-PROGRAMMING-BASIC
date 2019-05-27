// 프로그램 설명: 부호있는 정수의 오버플로우
package p43.integer_type;

public class OverflowEx 
{
	public static void main(String[] args) 
	{
		// MSB(최상위 비트)가 부호비트인 경우 자료형 앞에 signed를 명시적으로 쓸 수 있고, 또는 생략가능함 (디폴트값)
		short sMin = -32768; // short형이 표현가능한 최솟값
		System.out.println("sMin = "  + sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1)); // overflow
		System.out.println("sMin-1 = " + (sMin-1)); // 묵시적형변환이 일어남 (short -> int)
		System.out.println();
		
		short sMax = 32767; // short형이 표현가능한 최댓값
		System.out.println("sMax = " + sMax);
		System.out.println("sMax+1 = " + (short)(sMax+1)); // overflow
		System.out.println("sMax+1 = " + (sMax+1)); // 묵시적형변환이 일어남 (short -> int)
		System.out.println();
		
		char cMin = 0; // char형이 표현가능한 최솟값
		System.out.println("cMin = " + (int)cMin); 
		System.out.println("cMin-1 = " + (int)(--cMin)); // overflow
		System.out.println("cMin-1 = " + (int)(cMin-1)); // 질문
		System.out.println();
		
		char cMax = 65535; // char형이 표현가능한 최댓값
		System.out.println("cMax = " + (int)cMax);
		System.out.println("cMax+1 = " + (int)(++cMax)); // overflow
		System.out.println("cMax+1 = " + (int)(cMax+1)); // 질문
	}	
}
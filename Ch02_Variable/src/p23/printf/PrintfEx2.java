// 프로그램 설명: printf와 관련된 변환명세에 대한 학습 2
package p23.printf;

public class PrintfEx2 
{
	public static void main(String[] args) 
	{
		float f1 = .10f; // <=> float f1 = 0.10f 
		System.out.printf("f1 = %f, %e, %g\n", f1, f1, f1); 
		// %f는 기본적으로 소숫점 이하 6째 자리까지만 표현 (디폴트 값)
		
		float f2 = 1e1f; // 앞의 1은 1.0을 의미, 뒤의 e1은 10^1(10.0)을 의미
		System.out.printf("f2 = %.2f, %.2e, %.2g\n", f2, f2, f2);
		
		float f3 = 3.14e3f; // 3.14 * 10^3을 의미, 즉, 3140.0을 의미
		System.out.printf("f3 = %f, %e, %g\n", f3, f3, f3);
		
		double d = 0.1234567890; 
		System.out.printf("d = %f\n", d); // %f는 기본적으로 소숫점 이하 6째 자리까지만 표현하고 그 밑의 자리는 반올림처리
		System.out.printf("d = %14.10f\n", d); // 14칸의 공간할당, 소숫점 이하 10째 자리까지 출력
		
		System.out.printf("[12345678901234567890]\n");
		String url = "www.codechobo.com"; 
		System.out.printf("[%s]\n", url); // %s는 문자열의 시작주소를 받아와 출력하는 변환명세
		System.out.printf("[%20s]\n", url); // 20: 20칸의 공간할당, +는 디폴트 값(생략가능): 오른쪽 정렬 
		System.out.printf("[%-20s]\n", url); // -는 왼쪽정렬 (왼쪽 정렬을 하고 싶으면 명시적으로 -써야됨)
		System.out.printf("[%.8s]\n", url); // .8은 시작주소에서부터 8번째 저장문자열까지 출력하라는 변환명세 
	}
}
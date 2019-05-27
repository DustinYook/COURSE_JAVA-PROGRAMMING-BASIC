//프로그램 설명: 연결연산자(+)의 특성에 대한 이해
package p22.string;

public class StringEx 
{
	public static void main(String[] args) 
	{
		String name = "Ja" + "va"; // 연결연산자(+): 문자열을 연결(concatenate)하는 역할 
		// C언어에서의 concat(str1, str2)함수와 같은 역할
		System.out.println(name); // 연결연산에 의해 초기화된 name객체의 저장값을 출력 
		
		String str = name + 8.0; // 연결연산자(+)는 문자열을 연결하는 연산자로 문자열이 아닌 것을 
		                         // 문자열로 묵시적 형변환을 수행하여 연결연산을 수행
		System.out.println(str); // 연결연산에 의해 초기화된 str객체의 저장값을 출력
		
		System.out.println(7 + " "); // 정수형 상수 7과 공백문자열을 연결 (상수 7은 문자열로 묵시적 형변환됨)
		System.out.println(" " + 7); // 정수형 상수 7과 공백문자열을 연결 (상수 7은 문자열로 묵시적 형변환됨)
		
		System.out.println(7 + ""); // 정수형 상수 7과 빈문자열을 연결 (상수 7은 문자열로 묵시적 형변환됨)
		System.out.println("" + 7); // 정수형 상수 7과 빈문자열을 연결 (상수 7은 문자열로 묵시적 형변환됨)
		
		System.out.println("" + ""); // 빈문자열과 빈문자열을 연결
		System.out.println(7 + 7 + ""); // 첫번째 +는 덧셈연산자이고 두번째 +는 연결연산자임
		System.out.println("" + 7 + 7); // 소괄호 안에 +연산이 있는 경우를 제외하고 연결연산자 이후에 나오는 +는 연결연산자로 인식됨  
		System.out.println("" + (7 + 7)); // 소괄호 안에 +연산이 있으므로 우선 덧셈연산을 수행 후 연결연산을 진행함
		System.out.println(7 + "" + 7);
	}
}
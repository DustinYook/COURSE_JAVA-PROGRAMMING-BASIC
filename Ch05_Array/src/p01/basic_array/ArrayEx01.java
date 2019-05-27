// 프로그램 설명: 배열의 사용법 기초 #1
package p01.basic_array; 
public class ArrayEx01 
{
	public static void main(String[] args) // 메소드 괄호 안의 변수를 매개변수(parameter)라고 함
	{ 
		// 1.배열선언
		int ages[]; // int형의 배열선언  (변수명 앞에 있는 것은 타입)
		String names[]; // String형의 배열선언 (참고: String[] names;도 가능)
		
		// 2.배열객체 생성  => 메모리에 할당
		ages = new int[3]; // int형 크기(4바이트)공간이 3칸 생성		
		names = new String[3]; // String형 크기 공간이 3칸 생성
		
		// 3. 배열객체 초기화
		// 1) for문을 이용한 초기화 방법
		for(int i = 0; i < ages.length; i++) // length를 사용하는 것이 좋음!
			ages[i] = i; // i를 배열첨자(index)라고 함, 배열첨자는 0부터 시작
		// 2) 각 원소에 일일이 대입하는 방법
		names[0] = "홍길동"; // 배열에는 엄격한 순서가 있음
		names[1] = "알파고";
		names[2] = "강감찬";
		
		// 4. 배열객체의 저장값 출력 => 배열첨자를 활용하기위해 반복문 사용
		// 1) 일반적인 for문으로 저장값 출력하는 방법
		for(int i = 0; i < ages.length; i++)
			System.out.printf("age[%d]: %d\n", i, ages[i]);
		System.out.println();
		// 2) 향상된 for문으로 저장값 출력하는 방법
		for(String str : names) // #추가학습필요
			System.out.println(str);			
	}
} 

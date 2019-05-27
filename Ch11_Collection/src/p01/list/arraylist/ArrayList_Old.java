// 프로그램 설명: 과거의 ArrayList 사용방법
package p01.list.arraylist;

import java.util.ArrayList;

public class ArrayList_Old 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList(); // ArrayList의 선언
		// 자바 5.0이후 부터 Generic(<>)을 이용한 특정 타입 지정이 필수
		// Generic: 특정 타입에 대해 사용 (<>) => 비교의 용이성

		// ArrayList에 넣을 수 있는 자료형
		al.add("홍길동"); // 문자열
		al.add(3); // 정수
		al.add('A'); // 문자상수
		al.add(5.5); // 실수
		// ArrayList 클래스에 정의된 add()는 ArrayList에 자료형 추가
		
		final int MAX = al.size();
		for(int i = 0; i < MAX; i++)
		{
			Object obj = al.get(i); // get(): 각 인덱스에 있는 데이터 가져옴
			System.out.print(obj + " ");
		}
	}
}
// List 계열: 자료가 순서적, 중복가능한 특성 존재 => ArrayList도 List의 일종
// ArrayList: 자료의 크기가 유동적일 때 사용 <-> Array: 자료의 크기가 고정적인 단점 (선언되면 크기변경불가)
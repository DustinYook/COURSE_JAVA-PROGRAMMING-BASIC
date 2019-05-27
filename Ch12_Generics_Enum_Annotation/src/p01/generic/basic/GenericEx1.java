package p01.generic.basic;

import java.util.ArrayList;

import p04.generic_method.TV;

public class GenericEx1 
{
	public static void main(String[] args) 
	{
		// 1.<String> Generics를 사용한 경우
		ArrayList<String> a = new ArrayList<>(); // 타입의 유형 #1
		a.add("안녕하세요"); // 같은 타입만 들어있음
		a.add("3"); 
		for(String s: a) // 향상된 for문을 이용하여 저장값 출력
			System.out.println(s);
		System.out.println();
		
		// 2.<Integer> Generics를 사용한 경우
		ArrayList<Integer> ai = new ArrayList<>(); // 타입의 유형 #2
		ai.add(1);
		ai.add(2);
		for(Integer i: ai)
			System.out.println(i);
		System.out.println();
		
		// 3.<클래스명> Generics를 사용한 경우
		ArrayList<TV> atv = new ArrayList<>();
		atv.add(new TV()); // 생성된 객체의 주소값을 출력 (재정의 안한 경우)
		// new TV(): 객체를 생성하는 것이 먼저! => 생성된 TV 객체 주소값을 매개변수로 전달
		atv.add(new TV("New TV")); 
		// 사용자 정의 클래스의 경우 반드시 new로 메모리에 할당하는 것이 우선!
		for(TV t: atv)
			System.out.println(t);
	}
}
// Generic: <Type> => *형변환이 필요없음, 컴파일 시 타입 체크 => 타입의 안정성확보
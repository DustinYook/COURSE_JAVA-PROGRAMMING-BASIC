// 프로그램 설명: 현재의 ArrayList 사용방법
package p01.list.arraylist;

import java.util.ArrayList;

public class ArrayList_New 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> list = new ArrayList<Object>(); 
//		ArrayList<Object> list = new ArrayList<>(); // Object 생략가능 
		// <Object>: Object는 모든 클래스의 조상이므로 모든 자료형을 사용할 수 있다는 의미 
		
		// 1.add()를 이용한 자료저장: 0번부터 순서대로 자료저장
		list.add("포도"); // 0번 인덱스
		list.add("딸기"); // 1번 인덱스
		list.add("감귤"); // 2번 인덱스
		int max = list.size();
		for(int i = 0; i < max; i++)
			System.out.print(list.get(i) + "  ");
		System.out.println();
		
		// 2.add(arg1,arg2) => arg1:인덱스, arg2:저장값
		list.add(0,"키위"); // 0번 인덱스의 저장값을 "키위"로 저장 
		list.add(1,"사과"); // 1번 인덱스의 저장값을 "사과"로 저장
		list.add(2,"용과"); // 2번 인덱스의 저장값을 "용괴"로 저장
		for(int i = 0; i < max; i++)
			System.out.print(list.get(i) + "  ");
		System.out.println();
		
		// 3.set(arg1,arg2) => arg1:인덱스, arg2:저장값 (2번과 동일)
		list.set(0,"포도"); // 0번 인덱스의 저장값을 "포도"로 저장  
		list.set(1,"딸기"); // 1번 인덱스의 저장값을 "딸기"로 저장  
		list.set(2,"감귤"); // 2번 인덱스의 저장값을 "감귤"로 저장 
		for(int i = 0; i < max; i++)
			System.out.print(list.get(i) + "  ");
		System.out.println();
		
		// 4.remove()를 이용한 자료제거: remove(index) or remove(저장데이터)의 형식으로 사용
		list.remove(0); // 0번 인덱스의 저장값을 제거
		list.remove("딸기"); // "딸기"라는 저장값 제거
		max = list.size();
		for(int i = 0; i < max; i++)
			System.out.print(list.get(i) + "  ");
		System.out.println();
	}
}
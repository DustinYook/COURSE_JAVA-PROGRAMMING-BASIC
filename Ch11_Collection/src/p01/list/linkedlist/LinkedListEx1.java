// 프로그램 목적: LinkedList의 사용법
package p01.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>(); // LinkedList선언 
		list.add("사과"); // 0번 인덱스
		list.add("딸기"); // 1번 인덱스
		list.add("포도"); // 2번 인덱스
		
		// 중요) 반복해서 저장 데이터를 읽어오는 처리 (iterate:반복하여 처리)
		Iterator<String> read = list.iterator(); 
		// iterator(): 리스트 저장 순서에 따라 값을 반복적으로 읽어옴
		
		while(read.hasNext()) // hasNext(): 다음에 읽을 자료가 있으면 true, 없으면 false 반환
		{
			String str = read.next(); 
			System.out.println(str);
		}// 반복적으로 수행해서 String타입의 것을 list에 저장 (인터페이스)
	}
}
// List 계열   - 1) LinkedList: 데이터의 삽입/삭제가 많은 경우
//          - 2) ArrayList: 데이터의 삽입/삭제가 적은 경우
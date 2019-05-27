package p02.map.hashmap;
import java.util.HashMap;
// HashMap: Map 계열 
// Map<key,value>

public class HashMapEx1 
{
	public static void main(String[] args) 
	{
		// 1.자료를 저장
		HashMap<String, Integer> h = new HashMap<>();
		// 데이터를 쌍으로 집어 넣을 수 있음
		h.put("홍길동", 95); // key와 value가 대응
		h.put("알파고", new Integer(93)); // WrapperClass를 활용 
		h.put("홍길동", 100); // key 값이 중복이 되면 덮어쓰기가 됨
		// key 값이 중요함: key->value는 가능하지만 value->key는 불가
		// key는 동일한 것이 존재하지 않음
		
		// 2.자료를 출력
		Integer result = h.get("홍길동"); // get()가 중요함!
		System.out.println("홍길동의 성적: " + result + "점");
		System.out.println(h.size());
	}
}
package p04.iterator_listiterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
// keySet(): key들을 모아놓게 하는 메소드
// entrySet(): key들과 value들의 쌍들을 모아놓게 하는 메소드
// keySet()과 entrySet()을 비교해서 잘 알아두기!
public class Iterator_HashMap 
{
	public static void main(String[] args) 
	{
		// Map은 인터페이스 (계열은 인터페이스)
		Map<String, String> m = new HashMap<String, String>(); // Map이 부모, HashMap은 인터페이스를 구현한 클래스
		m.put("1", "감사");
		m.put("2", "사과");
		
		// 뽑아다가 내용을 출력
		Iterator<String> key = m.keySet().iterator(); // keySet(): key들을 모아놓게 하는 메소드 => "1", "2" 
		Iterator<?> entry = m.entrySet().iterator(); // ?: 제한된 타입이 들어감  => 여러개 타입이 가능함 <-> Object는 모든 타입이 가능 (?와는 다름)
		// ?를 쓴 이유: key와 value가 타입이 다를 수도 있기 때문
		// entrySet에는 <"1","감사">, <"2","사과">가 들어가 있음 => key와 value를 합하면 entry라고 부름
		
		while(key.hasNext()) // 다음 저장값이 있으면 true, 없으면 false
			System.out.println(key.next()); // key값을 뽑아냄 => "1", "2" // key값을 알면 value값을 알 수 있음
	
		while(entry.hasNext())
			System.out.println(entry.next()); // entry값을 뽑아냄 => <"1", "감사">, <"2", "사과">
	}
}
//Stack도 List계열
//Vetor는 동기적으로 만듦 => 프로그램 용량 많아 느려짐 (StringBuilder, StringBuffer와 비슷한 원리)
//ArrayList는 비동기적 => 프로그램이 단순해 빨라짐
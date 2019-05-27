package p01.object_tostring;

public class ToStringEx2 
{
	public static void main(String[] args) 
	{ // toString(): 문자열로 출력할 때 쓰여지는 것
      // 사용자가 클래스를 만든 경우, 반드시 재 정의해서 사용해야 함 => 그래야 원하는 결과가 출력
		GoodStock g = new GoodStock("1111", 100);
		System.out.println(g); // g = g.toString() => toString이 생략
		System.out.println(g.toString()); // 주소값이 출력 (toString 오버라이딩 안 한 경우)
		System.out.println("\n[재고정보]: " + g);
	}
}
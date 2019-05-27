package p04.array_class;

// 자동차의 설계도와 같은 역할 => 객체가 생성되면 구체적으로 
public class Dog // main메소드가 없음 (일반적인 class)
{
	// 멤버변수
	String name; 
	String kind;
	
	// 생성자(Constructor): 객체 생성 시 초기값 저장하는 역할
	public Dog(String name, String kind) // 클래스이름과 동일, 형태는 메소드형태, 반환형 존재하지 않음
	{ // 객체가 생성될 때 실행되는 메소드
		// super(); // 굳이 필요 없음
		// 생성자 Dog의 parameter인 name의 저장값을 클래스 Dog의 멤버변수인 name에 저장
		this.name = name; // d[0].name = "워리";
		this.kind = kind; // d[0].kind = "불독";
	}
	
	/*public Dog(String string1, String string2) // 위의 것과 완전히 동일 (parameter변수는 지역변수)
	{
		this.name = string1;
		this.kind = string2;
	}*/
	
	@Override // 재정의: 자바개발자가 만들어 놓은 메소드(toString)들을 우리가 재정의해서 사용
	public String toString() // Dog라는 클래스 안에 정의된 멤버메소드
	{
		return name + "은 " + kind + "입니다." ; 
	}
}
// 이 부분이 오늘 한 부분에서 가장 중요한 부분임!
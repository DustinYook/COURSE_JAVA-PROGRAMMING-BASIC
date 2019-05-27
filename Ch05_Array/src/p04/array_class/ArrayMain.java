package p04.array_class; 

public class ArrayMain  
{ // 객채배열?
	public static void main(String[] args) // 실행되는 부분 (main메소드)
	{ 
		// 클래스를 통채로 배열을 생성
		// 1) 객체선언
		Dog d[] = new Dog[3]; // d는 참조변수, Dog는 타입  => Dog타입의 배열을 3칸 만들라는 의미
		// String str[] = new String[3]; // String과 동일하게 사용되는 것이라고 인식하면 됨
		// int a[] = new int[3]; // int도 동일한 방식으로 사용 가능
		
		// 2) 객체생성 및 초기화 
		d[0] = new Dog("워리", "불독"); // 객체생성한 값을 생성자를 통해서 저장 
		d[1] = new Dog("진도", "진돗개");
		d[2] = new Dog("풍산", "풍산개"); 
		
		for(int i = 0; i < d.length; i++) // length는 칸을 말해줌
		{
			System.out.println(d[i].name + " " + d[i].kind);
			System.out.println(d[i]); // @overide를 통해 재정의 하지 않으면 주소값이 나옴
			System.out.println(d[i].toString()); // d[i]객체에 정의된 toString메소드에 접근하여 값을 반환받아 콘솔창에 출력
		} System.out.println();
	}
}
// 클래스가 통채로 메모리에 올라오게 하는 방법: 객체 생성 or static으로 선언
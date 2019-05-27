// 프로그램 설명: 클래스 메소드와 인스턴스 메소드
package p06.static_instance_method;

public class Counter 
{
	public Counter() // 디폴트 생성자
	{
		count++;
//		System.out.println(count); // 1이 출력 (증감연산 끝난후 출력)
//		System.out.println(count++); // 0이 출력 (후치증감연산)
//		System.out.println(++count); // 1이 출력 (전치증감연산)
		this.num = count;
	}
	
	// 클래스 변수 (디폴트값=0): 객체생성 없이 도트연산자로 접근가능
	static int count; // static이 붙어있으면 메모리에 이미 올라와 있음
	// 클래스 메소드: 객체생성 없이 도트연산자로 접근가능
	public static int getCount()
	{
		return count;
	}
	public static void setCount(int c) // 내부의 변수를 매개변수라 함
	{
		Counter.count = c;
	}

	// 인스턴스 변수: 객체 생성 후 사용가능
	int num; // static이 붙어있지 않으면 객체생성을 해서 메모리에 올릴 수 있음
	// 인스턴스 메소드: 객체생성 후 사용가능
	public int getNum() 
	{
		return num;
	}
	public void setNum(int n) 
	{
		this.num = n;
	}
}
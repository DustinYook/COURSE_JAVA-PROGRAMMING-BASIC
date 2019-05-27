package p04.generic_method;

public class TV 
{
	private String caption;// 이 클래스 내부에서만 사용가능

	public TV() // 디폴트 생성자
	{
		this("TV클래스 입니다"); // 자기 자신 클래스의 다른 생성자 호출
	}
	
	public TV(String caption) // 생성자 
	{
		this.caption = caption;
	}
	
	@Override // 재정의 안하면 주소값이 출ㄺ됨
	public String toString() 
	{
		return caption; // caption의 저장값을 출력
	}
}
package p04.try_with_resources;

public class TryWith_New implements AutoCloseable 
{
	private String file;
	
	public TryWith_New(String f) // 생성자
	{
		this.file = f;
	}
	
	public void read()
	{
		System.out.println(file + "을 읽습니다.");
	}

	@Override // AutoCloseable라는 인터페이스에 정의되어 있는 추상메소드
	public void close() throws Exception 
	{
		System.out.println(file + "을 닫습니다.");
	}
}
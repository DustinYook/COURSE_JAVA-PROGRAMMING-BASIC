package p07.instance_static_initialize;

public class BlockTest 
{
	static // 1.클래스 초기화블록
	{
		System.out.println("static{}");
	}
	
	// 2.인스턴스 초기화 블록
	{
		System.out.println("instance{}");
	}
	
	// 3.생성자
	public BlockTest() 
	{
		System.out.println("constructor{}");
	}
	
	public static void main(String[] args) 
	{
		BlockTest bt = new BlockTest(); // 클래스 초기화블록 -> 인스턴스 초기화블록 -> 생성자
	}
}
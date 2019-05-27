package p07.instance_static_initialize;

public class BlockTest 
{
	static // 1.Ŭ���� �ʱ�ȭ���
	{
		System.out.println("static{}");
	}
	
	// 2.�ν��Ͻ� �ʱ�ȭ ���
	{
		System.out.println("instance{}");
	}
	
	// 3.������
	public BlockTest() 
	{
		System.out.println("constructor{}");
	}
	
	public static void main(String[] args) 
	{
		BlockTest bt = new BlockTest(); // Ŭ���� �ʱ�ȭ��� -> �ν��Ͻ� �ʱ�ȭ��� -> ������
	}
}
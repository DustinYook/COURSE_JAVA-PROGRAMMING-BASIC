package p06.keyword_final;

public class B_Child extends B 
{
	// overiding 금지
//	@Override // final로 인해 재정의 불가
//	public void print1() 
//	{
//		super.print1();
//	}
	
	@Override
	public void print2() // final 안붙으면 재정의 가능
	{
		super.print2();
	}
	

}
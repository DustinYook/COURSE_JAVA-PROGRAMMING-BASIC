package p06.annotation;

public class AnnoTest 
{
	@Deprecated // 사용하지 않겠다는 표시
	public String toString()
	{
		return super.toString() + " annotation"; // 주소값 + 문자열("annotation")
	} // toString()은 주소값이 나오게 끔 설계
}
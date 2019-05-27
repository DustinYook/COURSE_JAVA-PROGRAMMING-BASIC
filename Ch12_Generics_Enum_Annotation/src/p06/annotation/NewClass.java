package p06.annotation;

public class NewClass 
{
	int newField;
	
	public int getNewField() 
	{
		return newField;
	}
	
	// Annotation(@ + ctrl + space): 서술/기술 주석 => 컴파일 시 체크, 에러는 아니지만 경고를 줌
	@Deprecated // 앞으로 쓰지 않을 변수라는 의미 
	int oldField;
	
    @Deprecated
	public int getOldField() 
    {
		return oldField;
	}
}
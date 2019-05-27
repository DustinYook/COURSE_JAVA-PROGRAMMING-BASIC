package p06.annotation;

import java.util.ArrayList;

public class AnnotationEx1 
{
	@SuppressWarnings("deprecation") // deprecation 관련 경고(Warning)를 억제함 => 인터넷에서 가져온 것이 현재와 다른 경우
	public static void main(String[] args) 
	{
		NewClass nc = new NewClass(); // 인스턴스회(객체생성)
		nc.oldField = 10; // @Deprecated가 붙은 대상을 사용
		System.out.println(nc.oldField);
		System.out.println(nc.getOldField());
		
		@SuppressWarnings("unchecked") // generics 관련 경고를 억제 
		ArrayList<NewClass> a = new ArrayList(); // 타입을 지정하지 않음
		a.add(nc); 
	}
}
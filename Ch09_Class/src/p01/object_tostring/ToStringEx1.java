package p01.object_tostring;
import java.io.File;
// import를 사용하지 않는 패키지: java.lang => 이외의 패키지의 경우는 import를 사용해야 함
// toString(): 자바 원래 개발자가 정의해서 만들어 완성시켜 놓음
public class ToStringEx1 
{
	public static void main(String[] args) 
	{
		File f = new File("C:\\Spring");
		// File은 개발자가 만듦 => C:\Spring으로 출력하게 만들어 놓음
		String s = f.toString();
		System.out.println(s);
		System.out.println(f);
	}
}
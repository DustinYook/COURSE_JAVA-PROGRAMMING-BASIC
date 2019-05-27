package p02.static_import;
import java.util.Random; // java.lang이외의 것은 반드시 명시적으로 import를 해야함
import static java.lang.System.out;
import static java.lang.Math.*;
// java.lang이나 java.util 등은 패키지임! (java.lang은 import를 쓰지 않는 패키지임)

public class StaticImportEx1   
{
	public static void main(String[] args) 
	{
		// 1.기존의 사용방법
		System.out.println(Math.random()); // Math클래스는 java.lang에 정의됨 => import를 할 필요없음
		System.out.println(Math.PI); 
		
		// 2.static import를 사용하는 방법: import에 명시하고 클래스명을 생략
		out.println(random()); // Math클래스는 java.lang에 정의됨 => import를 할 필요없음
		System.out.println(PI); 
		// using namespace std; => std::cout << endl;을 cout << endl;로 쓰게하는 것과 비슷
		
		Random r = new Random();
	}
}
// static import는 자바 8.0부터 등장한 개념임
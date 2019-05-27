package p04.singleton;
// Singleton Pattern: 객체 생성을 제한해서 Singleton 클래스에서만 객체생성 1회 허용하고
// 다음부터는 getInstance()를 호출해서 사용하는 방법론
public class SingletonMain 
{
	public static void main(String[] args) 
	{
		// Singleton s = new Singleton(); // 이런식으로 객체생성이 불가: private가 붙었기 때문
		Singleton s = Singleton.getInstance(); // 클래스 메소드를 호출
	}
}
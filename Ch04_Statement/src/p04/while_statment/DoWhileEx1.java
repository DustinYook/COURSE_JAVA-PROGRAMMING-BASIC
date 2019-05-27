package p04.while_statment;
import java.util.Scanner; // Scanner클래스를 이용하기 위한 문장

public class DoWhileEx1 
{
	public static void main(String[] args) 
	{
		String inputString; 
		do // do while문장은 조건에 관계없이 문장을 적어도 한번 수행할 수 있음
		{
			System.out.print("메세지를 입력해주십시오: ");
			Scanner sc = new Scanner(System.in); // Scanner의 객체생성 => 메모리에 올림
			inputString = sc.nextLine();
			System.out.println("[시스템출력] " + inputString);
			System.out.println("프로그램을 종료하려면 q을 입력해주십시오.\n");
		} while(!inputString.equals("q")); // Sentinel의 역할수행
		// String클래스에 정의된 equals(문자열)메소드는 입력된 값과 지정문자열이 일치하는지 비교
		// 이는 C언어의 strcmp()함수와 유사한 기능을 수행 (특이한 점은 !연산자를 이용하여 부정할 수 있음)
		System.out.println("[시스템알림] 프로그램을 종료합니다.");
	}
}
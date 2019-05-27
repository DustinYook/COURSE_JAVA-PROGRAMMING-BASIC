package p09.polymorphism;

public class GameMain 
{
	public static void main(String[] args)
	{
		// 1.객체생성
		Game g = new Game(); // 부모 -> 부모
		g.type(); 
//		g.write(); // 부모클래스에는 없고 자식클래스에 있는 메소드의 경우 명시적형변환을 해주어야 함
		System.out.println();
		
		// 2.상속
		CricketGame c = new CricketGame(); // 자식 -> 자식
		c.type(); // Cricket에서 재정의한 메소드 => 부모의 것은 안보임
		c.over(); // 부모의 것을 보이게 하는 법, 부모(Game)클래스의 메소드(type())를 호출
		c.write();
		System.out.println();
		
		// 3.다형성: 부모 -> 자식
		Game ga = new CricketGame(); // 부모의 눈으로 자식을 가리키고 있음
		ga.type(); // 재정의 한 자식 것이 보임 => 이유: 재정의한 것이 우선
		((CricketGame) ga).write(); // 부모가 자식의 눈높이로 보기 위해 자식의 안경(명시적형변환)을 씌워서 자식의 메소드가 보이게끔 함 
		// 이것보다 4번의 방법이 더 권장할만 함
		System.out.println();
		
		// 4.권장하는 사용방법 (3번과 쌍으로 연결해서 학습해야 함) => 가장 중요한 내용!
		CricketGame cr1 = (CricketGame) ga; // 자식 #1
		cr1.type(); 
		cr1.write();
		CricketGame cr2 = (CricketGame) ga; // 자식 #2
		cr2.type(); // 
		cr2.write();
		System.out.println();
	
		// 이런 형태는 불가능
//		CricketGame c1 = (CricketGame) new Game(); // 자식의 눈으로 부모를 바라봄
//		c1.type(); 
	}
}
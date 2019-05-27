package p05.constuctor;
// import java.util.Scanner;

public class PersonMain2 
{
	public static void main(String[] args) 
	{
//		Scanner sc1 = new Scanner(System.in);
//		System.out.print("이름을 입력해주십시오: ");
//		String name = sc1.nextLine();
//		Scanner sc2 = new Scanner(System.in);
//		System.out.print("나이를 입력해주십시오: ");
//		int age = sc2.nextInt();
//		Person p = new Person(name, age); // 객체생성 (인스턴스화)
//		System.out.printf("%s, %d세\n", p.name, p.age);
		
		Person p1 = new Person("홍길동"); // 객체생성 (인스턴스화)
		System.out.printf("%s\n", p1.name);
		
		Person p2 = new Person(19); // 객체생성 (인스턴스화)
		System.out.printf("%s, %d세\n", p2.name, p2.age);
		
		Person p3 = new Person("알파고", 30); // 객체생성 (인스턴스화)
		System.out.printf("%s, %d세\n\n", p3.name, p3.age);
		
		Person p4 = new Person();
		p4.setName("강감찬");
		p4.setAge(23);
		System.out.printf("%s, %d세\n\n", p4.name, p4.age);
	}
}
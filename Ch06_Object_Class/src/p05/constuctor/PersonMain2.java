package p05.constuctor;
// import java.util.Scanner;

public class PersonMain2 
{
	public static void main(String[] args) 
	{
//		Scanner sc1 = new Scanner(System.in);
//		System.out.print("�̸��� �Է����ֽʽÿ�: ");
//		String name = sc1.nextLine();
//		Scanner sc2 = new Scanner(System.in);
//		System.out.print("���̸� �Է����ֽʽÿ�: ");
//		int age = sc2.nextInt();
//		Person p = new Person(name, age); // ��ü���� (�ν��Ͻ�ȭ)
//		System.out.printf("%s, %d��\n", p.name, p.age);
		
		Person p1 = new Person("ȫ�浿"); // ��ü���� (�ν��Ͻ�ȭ)
		System.out.printf("%s\n", p1.name);
		
		Person p2 = new Person(19); // ��ü���� (�ν��Ͻ�ȭ)
		System.out.printf("%s, %d��\n", p2.name, p2.age);
		
		Person p3 = new Person("���İ�", 30); // ��ü���� (�ν��Ͻ�ȭ)
		System.out.printf("%s, %d��\n\n", p3.name, p3.age);
		
		Person p4 = new Person();
		p4.setName("������");
		p4.setAge(23);
		System.out.printf("%s, %d��\n\n", p4.name, p4.age);
	}
}
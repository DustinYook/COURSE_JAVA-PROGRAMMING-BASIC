package p10.polymorphism.instanceof_operator;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee(); // 부모객체생성 // emp는 참조변수이며 주소값이 저장 => taxRate(Employee e)
		Manager man = new Manager(); // 자식객체생성 #1
		Engineer eng = new Engineer(); // 자식객체생성 #2

		// 매개변수(parameter)의 다형성
		emp.taxRate(emp);
		emp.taxRate(man);
		emp.taxRate(eng);
	}
}
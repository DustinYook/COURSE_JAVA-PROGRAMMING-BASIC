package p10.polymorphism.instanceof_operator;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee(); // �θ�ü���� // emp�� ���������̸� �ּҰ��� ���� => taxRate(Employee e)
		Manager man = new Manager(); // �ڽİ�ü���� #1
		Engineer eng = new Engineer(); // �ڽİ�ü���� #2

		// �Ű�����(parameter)�� ������
		emp.taxRate(emp);
		emp.taxRate(man);
		emp.taxRate(eng);
	}
}
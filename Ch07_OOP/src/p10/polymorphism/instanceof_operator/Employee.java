package p10.polymorphism.instanceof_operator;
// instanceof ������: ����ȯ ���ɿ��θ� �˰��� => �ּҸ� ����Ű���� Ȯ���ϴ� ������ // �θ� �ڽİ����� ���
public class Employee // �θ�Ŭ����
{
	// �ν��Ͻ� �޼ҵ� 
	public void taxRate(Employee e) // �Ű������� ������: emp.taxRate(emp); / emp.taxRate(man); / emp.taxRate(eng);
	// �θ�Ÿ������ �ؾ��� �ڽ�Ÿ������ �ϸ� ���� �� ���� // �� ���� Ÿ������ �ؾ� �� 
	{
		if(e instanceof Manager) // Manager�� ����Ű�°�?
		{
			Manager m = (Manager) e; // ���������ȯ
			System.out.println("Manager ���� ���ϱ�");
		}
		else if(e instanceof Engineer) // Engineer�� ����Ű�°�?
		{
			Engineer en = (Engineer) e;
			System.out.println("Engineer ���� ���ϱ�");
		}
		else if(e instanceof Employee) // Employee�� ����Ű�°�?
			System.out.println("Employee ���� ���ϱ�");
		else
			System.out.println("����ȯ�� �̷������ ����");
	}
}

// �̰Ŵ� �ܺ�Ŭ������ �ƴ�
class Manager extends Employee // �ڽ�Ŭ���� #1: Employee�κ��� ���
{
}

class Engineer extends Employee // �ڽ�Ŭ���� #2: Employee�κ��� ���
{	
}
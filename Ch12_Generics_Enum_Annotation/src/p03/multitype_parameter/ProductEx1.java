package p03.multitype_parameter;

public class ProductEx1 
{
	public static void main(String[] args) 
	{
		Product<Tv, String> p1 = new Product<>();
		p1.setType(new Tv()); // Tv()�� ���� �ȵ� => �ν��Ͻ�ȭ�ؼ� ����ؾ� ��
		p1.setModel("����Ʈ TV");
		Tv t = p1.getType();
		String s = p1.getModel();
		System.out.println(t); // toString() ���������� ������ ���������̹Ƿ� �ּҰ��� ��Ÿ��
		System.out.println(s);
		System.out.println();
		
		Product<Car, String> p2 = new Product<>();
		p2.setType(new Car()); // ����� ���� Ŭ������ ����ϱ� ���ؼ��� �ݵ�� �ν��Ͻ�ȭ�� ���ľ� ��!
		p2.setModel("Disel"); // String�� �̸� ���ǵ� Ŭ�����̹Ƿ� ��ü�������� ��밡��
		System.out.println(p2.getType());
		System.out.println(p2.getModel());
	}
}
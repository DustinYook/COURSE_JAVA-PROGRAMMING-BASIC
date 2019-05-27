package p03.multitype_parameter;

public class ProductEx1 
{
	public static void main(String[] args) 
	{
		Product<Tv, String> p1 = new Product<>();
		p1.setType(new Tv()); // Tv()만 쓰면 안됨 => 인스턴스화해서 사용해야 함
		p1.setModel("스마트 TV");
		Tv t = p1.getType();
		String s = p1.getModel();
		System.out.println(t); // toString() 재정의하지 않으면 참조변수이므로 주소값을 나타냄
		System.out.println(s);
		System.out.println();
		
		Product<Car, String> p2 = new Product<>();
		p2.setType(new Car()); // 사용자 정의 클래스를 사용하기 위해서는 반드시 인스턴스화를 거쳐야 함!
		p2.setModel("Disel"); // String은 미리 정의된 클래스이므로 객체생성없이 사용가능
		System.out.println(p2.getType());
		System.out.println(p2.getModel());
	}
}
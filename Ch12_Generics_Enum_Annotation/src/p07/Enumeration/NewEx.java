package p07.Enumeration;

public class NewEx 
{
	public static void main(String[] args) 
	{
		ClothingInfo c = new ClothingInfo("3222", "long Sleeves", "wool 100%", Season.WINTER);
		System.out.println("상품코드: " + c.code);
		System.out.println("상품명: " + c.name);
		System.out.println("상품소재: " + c.material);
		System.out.println("계절구분: " + c.season); // 숫자가 아닌 원하는 것이 나옴
	}
}
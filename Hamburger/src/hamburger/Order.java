package hamburger;

public class Order {

	public void PrpmotionInfo() {
		System.out.println("?��?��로모?��?��?��?��");
		System.out.println("?�� 19?��?��?�� ?��?��?��?�� 30%");
		System.out.println("?�� 쿠폰?��?�� 10% ");
		System.out.println("-->쿠폰코드 : C12092r51 ");
	}

	public void orderHambuger() {
		System.out.println("?��?��버거�? 고르?��?��");
		System.out.println("1.치킨버거 : 5000?��");
		System.out.println("2.불고기버�?: 3500?��");
		System.out.println("3.?��림프버거: 2500?��");
		System.out.println("4.비프버거 : 6500?��");
		System.out.println("번호?��?�� -->");
	}

	public static void orderSide() {
		System.out.println("?��?��?��?���? 고르?��?��");
		System.out.println("1.감자??�? : 5000?��");
		System.out.println("2.?��?��?���?: 3500?��");
		System.out.println("3.치즈?��?��: 2500?��");
		System.out.println("번호?��?�� -->");
	}

	public static void orderBeverage() {
		System.out.println("?��?��료�?? 고르?��?��");
		System.out.println("1.콜라 : 5000?��");
		System.out.println("2.?��?��?��: 3500?��");
		System.out.println("3.?��??: 2500?��");
		System.out.println("번호?��?�� -->");
		System.out.println();
	}

	public static void selectPromotion() {
		System.out.println("?��?��?��?�� ?��?��?��?��?��");
		System.out.println("1. ?��?��?��?��  2. 쿠폰?��?��");
		System.out.println("번호?��?�� -->");
	}
}

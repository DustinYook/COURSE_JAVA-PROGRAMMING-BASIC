package hambugerorder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Order o = new Order();
		MenuPrice m = new MenuPrice();
		Promotion p = new Promotion();

		o.PrpmotionInfo();
		
		o.orderHambuger();
		int menu = sc.nextInt();
		m.selectB(menu);
		System.out.println(m.getA1());

		Order.orderSide();
		int menu1 = sc.nextInt();
		m.selectS(menu1);
		System.out.println(m.getA1());

		Order.orderBeverage();
		int menu2 = sc.nextInt();
		m.selectBV(menu2);
		m.setBv1(m.bv1);

		int grandtotal = m.sumOrder(m.getA1(),m.getS1(),m.getBv1());
		m.setSum(grandtotal);
		
		Order.selectPromotion();
		int menu3 = sc.nextInt();
		if(menu3 == 1)
			p.agePromotion();
		
		if(menu3 == 2)
			p.couponPropotion();

	}

}

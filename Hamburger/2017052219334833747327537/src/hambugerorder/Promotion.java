package hambugerorder;

import java.util.Calendar;
import java.util.Scanner;

public class Promotion {

	public void agePromotion(){
		MenuPrice m = new MenuPrice();
		Main m1 = new Main();
		Scanner sc = new Scanner(System.in);
		int year = Calendar.getInstance().get(Calendar.YEAR);
		
		System.out.println("태어난 해를 입력하세요");
		System.out.println("연도입력 -->");
		int birthYear = sc.nextInt();
			
		if(year - birthYear > 19){
		System.out.println("할인대상이 아닙니다");
		System.out.println("최종결제금액 : ");		
		}
		if(year - birthYear <= 19){
		double save = m.getSum()*0.7;
		System.out.println("최종결제금액 :" + save);
				
		}
	}
	public void couponPropotion(){
		System.out.println("쿠폰번호를 입력하세요");
	}
}

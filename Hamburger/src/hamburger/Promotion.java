package hamburger;

import java.util.Calendar;
import java.util.Scanner;

public class Promotion {

	public void agePromotion(){
		MenuPrice m = new MenuPrice();
		Main m1 = new Main();
		Scanner sc = new Scanner(System.in);
		int year = Calendar.getInstance().get(Calendar.YEAR);
		
		System.out.println("?ƒœ?–´?‚œ ?•´ë¥? ?…? ¥?•˜?„¸?š”");
		System.out.println("?—°?„?…? ¥ -->");
		int birthYear = sc.nextInt();
			
		if(year - birthYear > 19){
		System.out.println("?• ?¸???ƒ?´ ?•„?‹™?‹ˆ?‹¤");
		System.out.println("ìµœì¢…ê²°ì œê¸ˆì•¡ : ");		
		}
		if(year - birthYear <= 19){
		double save = m.getSum()*0.7;
		System.out.println("ìµœì¢…ê²°ì œê¸ˆì•¡ :" + save);
				
		}
	}
	public void couponPropotion(){
		System.out.println("ì¿ í°ë²ˆí˜¸ë¥? ?…? ¥?•˜?„¸?š”");
	}
}

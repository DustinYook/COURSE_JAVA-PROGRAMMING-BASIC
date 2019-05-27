package p02.format;
import java.text.DecimalFormat;

// 화폐에 관련한 것
public class DecimalFormatEx1 
{
	public static void main(String[] args) 
	{
		double num = 1234567.89; 
		DecimalFormat df = new DecimalFormat("0"); // 반올림된 상태에서 소숫점 이상자리 표현
		System.out.println(df.format(num)); // 결과값: 1234568
		
	    df = new DecimalFormat("0.0"); // 첫번째 소숫점 자리까지 반올림한 상태로 표현
		System.out.println(df.format(num)); // 결과값: 1234567.9 
		
		df = new DecimalFormat("0000000000.000"); 
		System.out.println(df.format(num)); // 결과값: 0001234567.890000
		// #은 숫자에 해당하는 것만 채움, 0은 남는 자리를 0으로 채워 넣음
		
		df = new DecimalFormat("#"); 
		System.out.println(df.format(num)); // 결과값: 1234568
		
		df = new DecimalFormat("#.#"); 
		System.out.println(df.format(num)); // 결과값: 1234567.9
		
		df = new DecimalFormat("###########.##########"); // 해당하는 숫자만큼만 채움
		System.out.println(df.format(num)); // 결과값: 1234567.89
		
		df = new DecimalFormat("###########.000"); 
		System.out.println(df.format(num)); // 결과값: 1234567.890
		
		df = new DecimalFormat("+#.0"); 
		System.out.println(df.format(num)); // 결과값: +1234567.9
		
		df = new DecimalFormat("-#.0"); 
		System.out.println(df.format(num)); // 결과값: -1234567.9

		df = new DecimalFormat("#,###.000"); // 약간 형식지정자 같은 느낌
		System.out.println(df.format(num)); // 결과값: 1,234,567.890
		
		df = new DecimalFormat("0.0E0"); 
		System.out.println(df.format(num)); // 결과값: 1.2E6
		
		df = new DecimalFormat("+#,###; -#,###"); // 양수일 땐 왼쪽, 음수일 땐 오른쪽
		System.out.println(df.format(num)); // 결과값: +1,234,568
		
		df = new DecimalFormat("#.# %"); 
		System.out.println(df.format(num)); // 결과값: 123456789 %
		
		df = new DecimalFormat("\u00A4 #,###"); // 유니코드 값 
		System.out.println(df.format(num)); // 결과값: 123456789 %
	}
}
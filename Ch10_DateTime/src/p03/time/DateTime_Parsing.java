package p03.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime_Parsing 
{
	public static void main(String[] args) 
	{
		DateTimeFormatter dtf; // ��ü�����ϰ�� �ٸ�; ���� �� ����
		LocalDate ld;
		
		ld = LocalDate.parse("2024-06-28");
		System.out.println(ld); 
		
		dtf = DateTimeFormatter.ISO_LOCAL_DATE;
		ld = LocalDate.parse("2024-06-28", dtf);
		System.out.println(ld);
		
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		ld = LocalDate.parse("2024/06/28", dtf);
		System.out.println(ld);
	}
}
// �̷� ����Ʈ: ������ ������������ ����ϱ� ������ parse()�� �̿��Ͽ� �ϳ��� �������� ���Ͻ�Ŵ
// ������ collection�� �� ���� => �ڷᱸ������
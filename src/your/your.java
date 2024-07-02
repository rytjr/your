package your;

import java.util.*;

public class your {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] list = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0"};
		
		double num3 = 5.0;
		double sum  =0;
		double sum2 = 0;
		double sum3 = 0;
		
		for(int i = 0; i < 20; i++) {
			String sfefse = sc.next();
			double num = sc.nextDouble();
			String str = sc.next();
			for(int j = 0; j < 8; j++) {
				num3 =num3-0.5;
				if(str.equals("P")) {
					num3 = 0;
					num = 0;
					sum = num3;
				}
				if(str.equals("F")) {
					num3 = 0.0;
					sum = num3;
				}
				else {
					if(str.equals(list[j])) {
						sum = num3;
					}
				}
				
			}
			sum2 +=num*sum;
			sum3 +=num;
			num3 = 5.0;
			
		}
		double d = sum2/sum3;
		System.out.printf("%,.6f", d);
		
	}
}
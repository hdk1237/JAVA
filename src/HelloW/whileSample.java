package HelloW;

import java.util.Scanner;

public class whileSample {

	public static void main(String[] args) {
		System.out.println("201205040 황동길");
		Scanner rd = new Scanner(System.in);
		int n=0;
		double sum=0;
		int i=0;
		
		while((i = rd.nextInt()) !=0){
			sum=sum+i;
			n++;
		}
		System.out.println("입력된 수의 개수는"+n+"게이머의 평균은"+ sum/ n+ "입니다.");

	}

}

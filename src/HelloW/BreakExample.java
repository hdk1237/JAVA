package HelloW;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		System.out.println("201205040 황동길");
		Scanner in = new Scanner(System.in);
		int num=0;
		
		while(true){
			if(in.nextInt() == -1)
				break;
			num++;
		}
		System.out.println("입력된 숫자 개수는 "+ num );

	}

}

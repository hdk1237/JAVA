package HelloW;

import java.util.Scanner;

public class ExcoptionExaple2 {

	public static void main(String[] args) {
		System.out.println("201205040 황동길");
		Scanner rd = new Scanner(System.in);
		int divisor=0;
		int dividend=0;
		
		System.out.print("나뉨수를 입력하시요.");
		dividend = rd.nextInt();
		System.out.print("나눗수를 입력하시요.");
		divisor = rd.nextInt();
		try{
			System.out.println(dividend+"를 "+divisor+"로 나누면 몫은"+dividend/divisor+"입니다.");
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}

}

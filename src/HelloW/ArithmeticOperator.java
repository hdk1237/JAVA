package HelloW;

import java.util.Scanner;
public class ArithmeticOperator {

	public static void main(String[] args) {
		System.out.println("201205040 Ȳ����");
		int time;
		int second;
		int minute;
		int hour;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���.");
		time = sc.nextInt();
		second = time % 60;
		minute = (time / 60) %60;
		hour = (time / 60) / 60;
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.print(second + "���Դϴ�. ");

	}

}

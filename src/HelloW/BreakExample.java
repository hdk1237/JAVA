package HelloW;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		System.out.println("201205040 Ȳ����");
		Scanner in = new Scanner(System.in);
		int num=0;
		
		while(true){
			if(in.nextInt() == -1)
				break;
			num++;
		}
		System.out.println("�Էµ� ���� ������ "+ num );

	}

}

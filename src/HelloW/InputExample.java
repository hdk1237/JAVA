package HelloW;

import java.io.*;
public class InputExample {

	public static void main(String[] args) {
		System.out.println("201205040 Ȳ����");
		InputStreamReader rd= new InputStreamReader(System.in);
		try{
			while (true){
				int a = rd.read();
				if(a == -1)
					break;
				System.out.println((char)a);
			}
		}
		catch (IOException e){
			System.out.println("�Է� ���� �߻�");
		}
	}

}

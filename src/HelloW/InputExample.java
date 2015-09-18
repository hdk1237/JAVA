package HelloW;

import java.io.*;
public class InputExample {

	public static void main(String[] args) {
		System.out.println("201205040 황동길");
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
			System.out.println("입력 오류 발생");
		}
	}

}

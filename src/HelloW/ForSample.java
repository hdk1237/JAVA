package HelloW;

public class ForSample {

	public static void main(String[] args) {
		System.out.println("201205040 Ȳ����");
		int i, j;
		
		for (j=0, i=0; i<= 10; i++){
			j = j+1;
			System.out.print(i);
			if(i==10){
				System.out.print("=");
				System.out.print(j);
			}
			else
				System.out.print("+");
		}
	}

}

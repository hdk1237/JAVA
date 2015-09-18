package HelloW;

public class CoutinueExample {

	public static void main(String[] args) {
		System.out.println("201205040 황동길");
		int sum=0;
		for(int i=1; i<=100;i++){
			if(i%2 == 1)
				continue;
			else
				sum=sum+i;
		}
		System.out.println("1부터 100까지 짝수의 합은 "+ sum);

	}

}

package HelloW;

public class MainParameter {

	public static void main(String[] args) {
		System.out.println("201205040 황동길");
		double sum=0.0;
		
		for(int i=0; i<args.length; i++)
			sum+=Double.parseDouble(args[i]);
		
		System.out.println("합계: "+sum);
		System.out.println("평균: "+sum/args.length);
	}

}

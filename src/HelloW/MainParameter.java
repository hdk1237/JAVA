package HelloW;

public class MainParameter {

	public static void main(String[] args) {
		System.out.println("201205040 Ȳ����");
		double sum=0.0;
		
		for(int i=0; i<args.length; i++)
			sum+=Double.parseDouble(args[i]);
		
		System.out.println("�հ�: "+sum);
		System.out.println("���: "+sum/args.length);
	}

}

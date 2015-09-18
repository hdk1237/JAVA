package HelloW;

public class NestedLoop {

	public static void main(String[] args) {
		System.out.println("201205040 È²µ¿±æ");
		int i,j;
		
		for(i = 1; i<10; i++,System.out.println()){
			for(j = 1; j<10; j++, System.out.print('\t')){
				System.out.print(i + "*"+ j + "="+i*j);
			}
		}

	}

}

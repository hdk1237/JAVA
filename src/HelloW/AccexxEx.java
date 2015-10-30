package HelloW;

class Sample{
	public int a;
	private int b;
	int c;
	
	public int getb(){
		return b;
	}
	public void setB(int value){
		b= value;
	}
}

public class AccexxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201205040 È²µ¿±æ");
		Sample aClass = new Sample();
		aClass.a = 10;
		aClass.setB(10);
		aClass.c = 10;

	}

}

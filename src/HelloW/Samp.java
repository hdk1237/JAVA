package HelloW;

public class Samp {
	int id;
	public Samp(int x) {this.id = x;}
	public void set(int x) {this.id = x;}
	public int get() {return this.id;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201205040 È²µ¿±æ");
		Samp ob1 = new Samp(3);
		Samp ob2 = new Samp(3);
		Samp ob3 = new Samp(3);
		
		ob1.set(5);
		ob2.set(6);
		ob3.set(7);
		System.out.println(ob1.id);
		System.out.println(ob2.id);
		System.out.println(ob3.id);

	}

}

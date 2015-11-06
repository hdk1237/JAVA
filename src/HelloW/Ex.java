package HelloW;

class StaticSample {
	public int n;

	public void g() {
		m = 20;
	}

	public void h() {
		m = 30;
	}

	public static int m;

	public static void f() {
		m = 5;
	}
}

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201205040 È²µ¿±æ");
		StaticSample s1, s2;
		s1 = new StaticSample();
		s1.n = 5;
		s1.g();
		s1.m = 50;
		s2 = new StaticSample();
		s1.n = 8;
		s1.h();
		s1.f();
		System.out.println(s1.m);

	}

}

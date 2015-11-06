package HelloW;

class A{
	public A(){
		System.out.println("持失切 A");
	}
}
class B extends A{
	public B(){
		System.out.println("持失切 B");
	}
}
class C extends B{
	public C(){
		System.out.println("持失切 C");
	}
}

public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201205040 伐疑掩");
		C c = new C();

	}

}

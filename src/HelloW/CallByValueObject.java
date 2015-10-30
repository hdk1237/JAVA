package HelloW;

public class CallByValueObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201205040 황동길");
		Person2 aPerson = new Person2("황동길");
		MyInt a = new MyInt(33);
		
		
		System.out.println(a.val);
		aPerson.setAge(a);
		System.out.println(a.val);
		System.out.println(++a.val);

	}

}

class Person2{
	public String name;
	public int age;
	public Person2(String s){
		name = s;	
	}
	public void setAge(MyInt i){
		age = i.val;
		i.val++;
	}
}

class MyInt{
	int val;
	MyInt(int i){
		val = i;
	}
}
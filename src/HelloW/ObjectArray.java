package HelloW;

class Person{
	public int age;
}

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] pa;
		pa = new Person[10];
		for(int i=0; i<pa.length; i++){
			pa[i] = new Person();
			pa[i].age = 30 + i;
			System.out.println(pa[i].age + " ");
		}

	}

}

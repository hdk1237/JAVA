package HelloW;

class Person123 {
	int age;
	public String name;
	protected int height;
	private int weight;

	public void setWeight(int weight) {
		this.weight = weight;
		System.out.print("몸무게는 " + this.weight + "이고 ");
	}

	public int getWeight() {
		return weight;
	}
}

public class Student extends Person123 {
	void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		setWeight(99);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201205040 황동길");
		Student s = new Student();
		s.set();
		System.out.println("나이는 " + s.age + "이고 이름은 " + s.name + "이고 키는 "
				+ s.height + "이다.");
	}

}

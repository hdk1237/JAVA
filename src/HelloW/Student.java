package HelloW;

class Person123 {
	int age;
	public String name;
	protected int height;
	private int weight;

	public void setWeight(int weight) {
		this.weight = weight;
		System.out.print("�����Դ� " + this.weight + "�̰� ");
	}

	public int getWeight() {
		return weight;
	}
}

public class Student extends Person123 {
	void set() {
		age = 30;
		name = "ȫ�浿";
		height = 175;
		setWeight(99);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201205040 Ȳ����");
		Student s = new Student();
		s.set();
		System.out.println("���̴� " + s.age + "�̰� �̸��� " + s.name + "�̰� Ű�� "
				+ s.height + "�̴�.");
	}

}

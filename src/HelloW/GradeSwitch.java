package HelloW;

public class GradeSwitch {

	public static void main(String[] args) {
		System.out.println("201205040 황동길");
		char grade = 'C';
		switch (grade) {
		case 'A':
		case 'B':
			System.out.println("참 잘하였습니다.");
			break;
		case 'C':
		case 'D':
			System.out.println("좀 더 노력하세요.");
			break;
		case 'F':
			System.out.println("다음 학기에 다시 수강하세요.");
			break;
		default:
			System.out.println("잘못된 학점입니다.");
		}
	}

}

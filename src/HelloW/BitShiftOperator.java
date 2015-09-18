package HelloW;

public class BitShiftOperator {

	public static void main(String[] args) {
		System.out.println("201205040 황동길");
		short a = (short)0x55ff;
		short b = 0x00ff;
		//비트연산
		System.out.printf("%x\n", a & b);
		System.out.printf("%x\n", a | b);
		System.out.printf("%x\n", a ^ b);
		System.out.printf("%x\n", -a);

		byte c = 20;
		byte d = -8;
		//시프트 연산
		System.out.println(c<<2);
		System.out.println(c>>2);
		System.out.println(d>>2);
		System.out.printf("%x\n", d>>>2);
	}

}

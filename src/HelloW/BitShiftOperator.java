package HelloW;

public class BitShiftOperator {

	public static void main(String[] args) {
		System.out.println("201205040 Ȳ����");
		short a = (short)0x55ff;
		short b = 0x00ff;
		//��Ʈ����
		System.out.printf("%x\n", a & b);
		System.out.printf("%x\n", a | b);
		System.out.printf("%x\n", a ^ b);
		System.out.printf("%x\n", -a);

		byte c = 20;
		byte d = -8;
		//����Ʈ ����
		System.out.println(c<<2);
		System.out.println(c>>2);
		System.out.println(d>>2);
		System.out.printf("%x\n", d>>>2);
	}

}

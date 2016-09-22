package ch03;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('c');
		Float f = new Float(3.14);
		Boolean b = new Boolean(true);

		Integer i4 = 10;// 오토박싱
		int i5 = i4;// 오토언박싱
		System.out.println(i4 + ":" + i5);
	}

}

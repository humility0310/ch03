package ch03;

public class ObjectTest {

	public static void main(String[] args) {
		Point p = new Point();
		
		System.out.println(p.getClass().getName());

		// 해시란?
		// 주소도 아니다
		// reference value도 아니다
		// 주소를 기본으로 만든 해싱값(int)
		System.out.println(p.hashCode());
		System.out.println(System.identityHashCode(p));

		// 해싱코드를 16진수로 변환
		System.out.println(p.toString());
		System.out.println(p);
	}

}

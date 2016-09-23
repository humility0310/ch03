package ch03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("둘리");
		set.add("마이콜");
		set.add("고길동");

		System.out.println(set.contains("둘리"));
		System.out.println(set.size());

		set.add("둘리");
		System.out.println(set.size());// 중복입력 x(사이즈 크기 그대로)

		// 순회
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}

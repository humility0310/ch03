package ch03;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();

		map.put("one", new Integer(1));
		map.put("two", 2);// autoboxing
		map.put("three", 3);

		Integer i = map.get("two");
		System.out.println(i);

		map.remove("two");
		System.out.println(map.get("two"));

		//키 중복시 value를 덮어씌움
		map.put("one",10);
		System.out.println(map.get("one"));
	}

}

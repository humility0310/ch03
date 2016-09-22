package ch03;

public class StringTest4 {

	public static void main(String[] args) {
		String s = "aBcDeFgHABC";

		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.replace('a', 'R'));
		System.out.println(s.replaceAll("abc", "123"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 6));

		String a = "        ab   cd       ";
		String b = ",efg,hi,jklmn";

		String c = a.concat(b);
		System.out.println(c);
		System.out.println(a + b);

		System.out.println("--" + a.trim() + "--");
		System.out.println("--" + a.replaceAll(" ", "") + "--");

		String[] t = b.split(",");
		for (String k : t) {
			System.out.println(k);
		}

		// +연산자
		String[] arr = { "Hello", "World", "Java" };
		String str = "";
		for (String str2 : arr) {
			str += str2;
		}

		// String str2 = "Hello" + " World" + " Java";
		
//		StringBuffer sb = new StringBuffer("Hello");
//		sb.append(" World");
//		sb.append(" java");
//		String str2 = sb.toString();
		
		String str2 = new StringBuffer("Hello")
				.append(" World")
				.append(" Java")
				.toString();
		
		System.out.println(str2);
	}
}

package ch03;

public class StringTest2 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		String s4 = s2.concat("??");
		
		s2 = s1.toUpperCase();
	}
}

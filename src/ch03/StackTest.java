package ch03;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();

		stack.push("둘리");
		stack.push("마이콜");
		stack.push("고길동");

		while (!stack.empty()) {
			String s = stack.pop();
			System.out.println(s);
		}
		// stack.pop(); stackemptyexception 발생
		stack.push("희동이");
		stack.push("도우너");
		stack.push("또치");

		System.out.println(stack.pop());
		System.out.println(stack.peek());//top 출력하기
		System.out.println(stack.pop());//희동이만 남음
	}
}

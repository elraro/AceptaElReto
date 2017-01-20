package intervalo100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problema141 {

	private static Stack<Character> stack = new Stack<Character>();
	private static StringBuilder sb = new StringBuilder();
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		while (in.ready()) {
			char[] l = in.readLine().toCharArray();
			balanceo(l);
			stack.clear();
		}
		System.out.print(sb.toString());
	}

	private static void balanceo(char[] l) {
		int len = l.length;
		for (int i = 0; i < len; i++) {
			switch (l[i]) {
			case '(':
				stack.push(')');
				break;
			case '{':
				stack.push('}');
				break;
			case '[':
				stack.push(']');
				break;
			case ')':
				if (stack.isEmpty() || ')' != stack.peek()) {
					sb.append("NO\n");
					return;
				} else {
					stack.pop();
					break;
				}
			case '}':
				if (stack.isEmpty() || '}' != stack.peek()) {
					sb.append("NO\n");
					return;
				} else {
					stack.pop();
					break;
				}
			case ']':
				if (stack.isEmpty() || ']' != stack.peek()) {
					sb.append("NO\n");
					return;
				} else {
					stack.pop();
					break;
				}
			}
		}
		if (stack.isEmpty())
			sb.append("YES\n");
		else
			sb.append("NO\n");
	}
}
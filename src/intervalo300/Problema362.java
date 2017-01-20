package intervalo300;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema362 {

	private static StringBuilder sb = new StringBuilder();
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	private static final int radix = 10;
	private static int result = 0;
	private static int i = 0;
	private static int len;
	private static int digit;

	public static void main(String[] args) throws Exception {

		String s = in.readLine();
		len = s.length();

		while (i < len) {
			digit = Character.digit(s.charAt(i++), radix);
			result *= radix;
			result -= digit;
		}
		result = -result;

		for (int i = 0; i < result; i++) {
			if (in.readLine().equals("25 12"))
				sb.append("SI\n");
			else
				sb.append("NO\n");
		}
		System.out.print(sb.toString());
	}
}


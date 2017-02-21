package intervalo300;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema362 {

	static StringBuilder sb = new StringBuilder();
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static final String PUTANAVIDAD = "25 12";
	static final String SI = "SI\n";
	static final String NO = "NO\n";

	static final int radix = 10;
	static int result = 0;
	static int i = 0;
	static int len;
	static int digit;

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
			if (in.readLine().equals(PUTANAVIDAD))
				sb.append(SI);
			else
				sb.append(NO);
		}
		System.out.print(sb.toString());
	}
}
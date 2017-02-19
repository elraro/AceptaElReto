package intervalo200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problema256 {

	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder sb = new StringBuilder();
	private static StringTokenizer st;
	private static final String FILL = "000000000";

	public static void main(String[] args) throws IOException {
		String line;
		WHILE: while ((line = in.readLine()) != null) {
			st = new StringTokenizer(line, " ");
			String first = st.nextToken();
			String second = st.nextToken();
			String third = st.nextToken();
//			if (first.equals(second) && first.equals(third)) {
//				sb.append(first).append("\n");
//				continue WHILE;
//			}
			int length = first.length();
			if (second.length() > length) {
				length = second.length();
			}
			if (third.length() > length) {
				length = third.length();
			}
			first = FILL.substring(first.length()) + first;
			second = FILL.substring(second.length()) + second;
			third = FILL.substring(third.length()) + third;

			String sol = "";
			for (int i = 9 - length; i < 9; i++) {
				if (first.charAt(i) == second.charAt(i) && first.charAt(i) != third.charAt(i)) {
					sol += first.charAt(i);
				} else if (first.charAt(i) != second.charAt(i) && first.charAt(i) == third.charAt(i)) {
					sol += first.charAt(i);
				} else if (second.charAt(i) == third.charAt(i)) {
					sol += second.charAt(i);
				} else {
					sb.append("RUIDO COSMICO\n");
					continue WHILE;
				}
			}
			sb.append(Integer.parseInt(sol)).append("\n");
		}
		System.out.print(sb.toString());
	}
}


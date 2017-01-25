package intervalo300;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema364 {

	private static StringBuilder sb = new StringBuilder();
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static int len = 0;

	public static void main(String[] args) throws Exception {
		while (true) {
			String l = in.readLine();
			if (l.equals("FIN"))
				break;
			len = l.length();
			for (int x = 0; x < len; x++) {
				char c = l.charAt(x);
				if (c == ' ')
					sb.append(' ');
				else if (c == 'Z')
					sb.append('A');
				else
					sb.append((char) (l.charAt(x) + 1));
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
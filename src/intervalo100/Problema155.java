package intervalo100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problema155 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static final String SALTO = "\n";
	static StringTokenizer st;
	static String line;
	static int l;
	static int l2;

	public static void main(String[] args) throws IOException {
		while ((line = in.readLine()) != null) {
			st = new StringTokenizer(line, " ");
			l = Integer.parseInt(st.nextToken());
			l2 = Integer.parseInt(st.nextToken());
			if (l < 0 || l2 < 0)
				break;
			sb.append(l * 2 + l2 * 2).append(SALTO);
		}
		System.out.print(sb.toString());
	}
}
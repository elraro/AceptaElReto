package intervalo100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problema148 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static final String SALTO = "\n";
	static StringTokenizer st;
	static String line;
	static int h;
	static int m;
	static int r;

	public static void main(String[] args) throws IOException {
		while ((line = in.readLine()) != null) {
			st = new StringTokenizer(line, ":");
			h = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			if (h == 0 && m == 0)
				break;
			r = Math.abs((h - 23) * 60);
			r += Math.abs(m - 60);
			sb.append(r).append(SALTO);
		}
		System.out.print(sb.toString());
	}
}
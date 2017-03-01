package intervalo100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problema191 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static final String SALTO = "\n";
	static String[] line;
	static int c;
	static int p;
	static int l;
	static int d;

	static int t;

	public static void main(String[] args) throws IOException {
		c = Integer.parseInt(in.readLine());
		for (int i = 0; i < c; i++) {
			st = new StringTokenizer(in.readLine(), " ");
			p = Integer.parseInt(st.nextToken());
			l = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			sb.append(l * p - ((p * (p - 1) / 2) * d)).append(SALTO);
		}
		System.out.print(sb.toString());
	}
}
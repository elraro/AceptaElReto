package intervalo100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problema117 {
	private static StringBuilder sb = new StringBuilder();
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int l = Integer.parseInt(in.readLine());
		for (int i = 0; i < l; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			st.nextToken();
			sb.append("Hola, ").append(st.nextToken()).append(".\n");
		}
		System.out.print(sb.toString());
	}
}
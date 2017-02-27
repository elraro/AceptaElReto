package intervalo100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema138 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static final String SALTO = "\n";
	static int zeros;
	static int n;
	static int c;

	public static void main(String[] args) throws IOException {
		c = Integer.parseInt(in.readLine());
		for (int i = 0; i < c; i++) {
			n = Integer.parseInt(in.readLine());
			zeros = 0;
			for (long j = 5; n / j > 0; j *= 5) { //ojo el overflow!
				zeros += n / j;
			}
			sb.append(zeros).append(SALTO);
		}
		System.out.print(sb.toString());
	}
}
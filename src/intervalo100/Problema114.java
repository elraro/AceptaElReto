package intervalo100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema114 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static final String SALTO = "\n";
	static String line;
	static int factorial = 1;
	static int n;
	static int c;

	public static void main(String[] args) throws IOException {
		c = Integer.parseInt(in.readLine());
		for (int i = 0; i < c; i++) {
			n = Integer.parseInt(in.readLine());
			if (n >= 5)
				sb.append(0).append(SALTO);
			else 
				switch (n) {
				case 0:
					sb.append(1).append(SALTO);
					break;
				case 1:
					sb.append(1).append(SALTO);
					break;
				case 2:
					sb.append(2).append(SALTO);
					break;
				case 3:
					sb.append(6).append(SALTO);
					break;
				case 4:
					sb.append(4).append(SALTO);
				}
		}
		System.out.print(sb.toString());
	}
}

package intervalo100;

import java.io.IOException;

public class Problema165 {

	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int n;
		boolean next = false;
		while ((n = System.in.read()) != 45) {
			if (n == 10) {
				if (next) {
					sb.append("NO\n");
					next = false;
				} else {
					sb.append("SI\n");
				}
				continue;
			}
			if (next)
				continue;
			if (n % 2 == 1) {
				next = true;
			}
		}
		System.out.print(sb.toString());
	}

}
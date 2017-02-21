package intervalo300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema300 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static int[] VOCALES;
	final static String SALTO = "\n";
	static String line;

	public static void main(String[] args) throws IOException {
		int casos = Integer.parseInt(in.readLine());
		CASOS: for (int i = 0; i < casos; i++) {
			VOCALES = new int[5];
			line = in.readLine();
			for (char c : line.toCharArray()) {
				if (c == 'a') {
					if (VOCALES[0] == 0) {
						VOCALES[0] = 1;
					}
				}
				if (c == 'e') {
					if (VOCALES[1] == 0) {
						VOCALES[1] = 1;
					}
				}
				if (c == 'i') {
					if (VOCALES[2] == 0) {
						VOCALES[2] = 1;
					}
				}
				if (c == 'o') {
					if (VOCALES[3] == 0) {
						VOCALES[3] = 1;
					}
				}
				if (c == 'u') {
					if (VOCALES[4] == 0) {
						VOCALES[4] = 1;
					}
				}
			}
			for (int j : VOCALES) {
				if (j == 0) {
					sb.append("NO").append(SALTO);
					continue CASOS;
				}
			}
			sb.append("SI").append(SALTO);
		}
		System.out.print(sb.toString());
	}
}

package intervalo300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema372 {

	static StringBuilder sb = new StringBuilder();
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int j = Integer.parseInt(in.readLine());
		for (int i = 0; i < j; i++) {
			char[] a = new StringBuilder(in.readLine()).reverse().toString().toCharArray();
			if (Character.isUpperCase(a[a.length - 1])) {
				a[a.length - 1] = Character.toLowerCase(a[a.length - 1]);
				a[0] = Character.toUpperCase(a[0]);
			}
			sb.append(a).append("\n");
		}
		System.out.print(sb.toString());
	}
}
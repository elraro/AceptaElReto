package intervalo300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problema381 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int i;
		int r;
		while (true) {
			int l = Integer.parseInt(in.readLine());
			if (l == 0) {
				break;
			}
			StringTokenizer arr = new StringTokenizer(in.readLine());
			r = Integer.parseInt(arr.nextToken());
			for (i = 1; i < l; i++) {
				r = mcm(r, Integer.parseInt(arr.nextToken()));
			}
			System.out.println(r);
			r = 0;
		}
	}

	private static int mcd(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		}
		return mcd(n2, n1 % n2);
	}

	private static int mcm(int n1, int n2) {
		return n1 * (n2 / mcd(n1, n2));
	}

}

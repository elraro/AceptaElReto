package intervalo100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problema193 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static final String SI = "SI\n";
	static final String NO = "NO\n";
	static int n;
	static int copyN;
	static int revN;
	static int sizeN;
	static int sizeRevN;
	static int dig;

	public static void main(String[] args) throws IOException {
		WHILE: while (true) {
			n = Integer.parseInt(in.readLine());
			if (n == 0) {
				break;
			}
			sizeN = (int) Math.log10(n) + 1;
			revN = 0;
			copyN = n;
			while (copyN != 0) {
				revN = revN * 10 + copyN % 10;
				copyN /= 10;
			}
			sizeRevN = (int) Math.log10(revN) + 1;
//			System.out.println(n);
//			System.out.println(revN);
//			System.out.println(sizeN);
//			System.out.println(sizeRevN);
			if (sizeN == sizeRevN) {
				n += revN;
				while (n != 0) {
				    dig = n % 10;
				    if (dig % 2 == 0) {
				    	sb.append(NO);
				    	continue WHILE;
				    }
				    n /= 10;
				}
				sb.append(SI);
			} else {
				sb.append(NO);
			}
		}
		System.out.print(sb.toString());
	}
}
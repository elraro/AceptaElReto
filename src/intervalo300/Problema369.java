package intervalo300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema369 {

	static StringBuilder sb = new StringBuilder();
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static String line;
	static final String SALTO = "\n";
	static final String N1 = "1\n";
	static final String N2 = "11\n";
	static final String N3 = "111\n";
	static final String N4 = "1111\n";
	static final String N5 = "11111\n";
	static final String N6 = "111111\n";
	static final String N7 = "1111111\n";
	static final String N8 = "11111111\n";
	static final String N9 = "111111111\n";
	static final String N10 = "1111111111";
	static final String N100 = "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
	static final String N1000 = "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111\n";
	static int r;
	static int n;
	// Integer.parseInt
	static final int RADIX = 10;
	static int result;
	static int i;
	static int len;
	static int digit;

	public static void main(String[] args) throws IOException {
		while ((line = in.readLine()) != null) {
			// start n = Integer.parseInt(line);
			len = line.length();
			i = 0;
			result = 0;
			while (i < len) {
				digit = Character.digit(line.charAt(i++), RADIX);
				result *= RADIX;
				result -= digit;
			}
			n = -result;
			// end
			if (n == 0)
				break;
			if (n / 1000 == 1) {
				sb.append(N1000);
				continue;
			}
			r = n / 100;
			n = n % 100;
			if (r > 0)
				for (int i = 0; i < r; i++)
					sb.append(N100);
			r = n / 10;
			n = n % 10;
			if (r > 0)
				for (int i = 0; i < r; i++)
					sb.append(N10);
			switch (n) {
			case 0:
				sb.append(SALTO);
				break;
			case 1:
				sb.append(N1);
				break;
			case 2:
				sb.append(N2);
				break;
			case 3:
				sb.append(N3);
				break;
			case 4:
				sb.append(N4);
				break;
			case 5:
				sb.append(N5);
				break;
			case 6:
				sb.append(N6);
				break;
			case 7:
				sb.append(N7);
				break;
			case 8:
				sb.append(N8);
				break;
			case 9:
				sb.append(N9);
			}
		}
		System.out.print(sb.toString());
	}
}
package intervalo100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema140 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static final String SALTO = "\n";
	static final String SUM = " + ";
	static final String EQ = " = ";
	static String line;
	static int l;
	static int n;

	public static void main(String[] args) throws IOException {
		while ((line = in.readLine()) != null) {
			if (line.startsWith("-"))
				break;
			l = line.length();
			n = 0;
			for (int i = 0; i < l; i++) {
				n += Character.getNumericValue(line.charAt(i));
				sb.append(line.charAt(i));
				if (i != l - 1)
					sb.append(SUM);
				else
					sb.append(EQ).append(n).append(SALTO);
			}

		}
		System.out.print(sb.toString());
	}
}
package intervalo100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problema124 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static final String SALTO = "\n";
	static String line;

	static String number1;
	static String number2;
	static int size1;
	static int size2;
	static int size;
	static int diff;
	static int count;
	static int c1;
	static int c2;
	static int sum;
	static int rest;

	public static void main(String[] args) throws IOException {
		while ((line = in.readLine()) != null) {
			if (line.equals("0 0"))
				break;
			st = new StringTokenizer(line, " ");
			number1 = st.nextToken();
			number2 = st.nextToken();
			size1 = number1.length();
			size2 = number2.length();
			count = 0;
			sum = 0;
			rest = 0;
			if (size1 > size2) {
				size = size2 - 1;
				diff = size1 - size2;
				for (int i = size; i >= 0; i--) {
					c1 = number1.charAt(i + diff) - 48;
					c2 = number2.charAt(i) - 48;
					sum = c1 + c2 + rest;
					rest = sum / 10;
					if (rest > 0)
						count++;
				}
				if (rest > 0) {
					size = size1 - size2 - 1;
					for (int i = size; i >= 0; i--) {
						c1 = number1.charAt(i) - 48;
						sum = c1 + rest;
						rest = sum / 10;
						if (rest > 0)
							count++;
					}
				}
			} else if (size1 < size2) {
				size = size1 - 1;
				diff = size2 - size1;
				for (int i = size; i >= 0; i--) {
					c1 = number1.charAt(i) - 48;
					c2 = number2.charAt(i + diff) - 48;
					sum = c1 + c2 + rest;
					rest = sum / 10;
					if (rest > 0)
						count++;
				}
				if (rest > 0) {
					size = size2 - size1 - 1;
					for (int i = size; i >= 0; i--) {
						c1 = number2.charAt(i) - 48;
						sum = c1 + rest;
						rest = sum / 10;
						if (rest > 0)
							count++;
					}
				}
			} else {
				size = size1 - 1;
				for (int i = size; i >= 0; i--) {
					c1 = number1.charAt(i) - 48;
					c2 = number2.charAt(i) - 48;
					sum = c1 + c2 + rest;
					rest = sum / 10;
					if (rest > 0)
						count++;
				}
			}
			sb.append(count).append(SALTO);
		}
		System.out.print(sb.toString());
	}

}

package intervalo100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema145 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static final String SALTO = "\n";
	static String line;
	static char[] pile = new char[10000];
	static char[] cs;
	static int l;
	static char c;
	static int head;
	static int s;

	public static void main(String[] args) throws IOException {
		while ((line = in.readLine()) != null) {
			cs = line.toCharArray();
			l = cs.length-1;
			head = -1;
			s = 0;
			for (int i = l; i >= 0; i--) {
				c = cs[i];
				if (c == 'H') {
					if (head > -1) {
						if (pile[head] == 'M') {
							head--;
							s++;
						} else {
							head = -1;
						}
					}
				} else if (c == 'h') {
					if (head > -1) {
						if (pile[head] == 'm') {
							head--;
							s++;
						} else {
							head = -1;
						}
					}
				} else if (c == 'M') {
					head++;
					pile[head] = 'M';
				} else if (c == 'm') {
					head++;
					pile[head] = 'm';
				} else if (c == '@') {
					head = -1;
				}
			}
			//System.out.println(s);
			sb.append(s).append(SALTO);
		}
		System.out.print(sb.toString());
	}
}
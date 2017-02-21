package intervalo300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problema319 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static int[] queue = new int[20000];
	static boolean[] duplicates;
	final static String SALTO = "\n";
	final static int LEVEL = -1;
	static String line;
	static int start;
	static int sol;
	static int i;
	static int calc;

	public static void main(String[] args) throws IOException {
		while ((line = in.readLine()) != null) {
			st = new StringTokenizer(line, " ");
			queue[0] = Integer.parseInt(st.nextToken());
			sol = Integer.parseInt(st.nextToken());
			queue[1] = -1;
			duplicates = new boolean[10000];
			i = 0;
			int head = 0;
			int tail = 2;
			while (head < tail) {
				int next = queue[head];
				head++;
				if (next == LEVEL) {
					i++;
					queue[tail] = LEVEL;
					tail++;
					continue;
				}
				if (next == sol) {
					break;
				}

				calc = (next + 1) % 10000;
				if (!duplicates[calc]) {
					queue[tail] = calc;
					tail++;
					duplicates[calc] = true;
				}
				calc = (next * 2) % 10000;
				if (!duplicates[calc]) {
					queue[tail] = calc;
					tail++;
					duplicates[calc] = true;
				}
				calc = (next / 3) % 10000;
				if (!duplicates[calc]) {
					queue[tail] = calc;
					tail++;
					duplicates[calc] = true;
				}
			}
			sb.append(i).append(SALTO);
		}
		System.out.print(sb.toString());
	}
}


package intervalo300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problema319 {

	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder sb = new StringBuilder();
	private static StringTokenizer st;
	private static Queue<Integer> queue = new LinkedList<Integer>();
	private static int[] duplicates = new int [10000];

	public static void main(String[] args) throws IOException {
		String line;
		while ((line = in.readLine()) != null) {
			int start;
			int sol;
			int i = 0;
			int calc;
			st = new StringTokenizer(line, " ");
			start = Integer.parseInt(st.nextToken());
			sol = Integer.parseInt(st.nextToken());
			queue.add(start);
			queue.add(null);
			while (!queue.isEmpty()) {
				Integer s = queue.poll();
				duplicates[start] = 0;
				if (s == null) {
					i += 1;
					queue.add(null);
					continue;
				}
				if (s == sol) {
					break;
				}
				calc = (s + 1) % 10000;
				if (duplicates[calc] == 0) {
					queue.add(calc);
					duplicates[calc] = 1;
				}
				calc = (s * 2) % 10000;
				if (duplicates[calc] == 0) {
					queue.add(calc);
					duplicates[calc] = 1;
				}
				calc = (s / 3) % 10000;
				if (duplicates[calc] == 0) {
					queue.add(calc);
					duplicates[calc] = 1;
				}
			}
			sb.append(i).append("\n");
			queue.clear();
			duplicates = new int [10000];
		}
		System.out.print(sb.toString());
	}
}
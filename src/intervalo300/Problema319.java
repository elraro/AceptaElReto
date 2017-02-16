package intervalo300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problema319 {

	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static StringBuilder sb = new StringBuilder();
	private static Queue<Integer> queue = new LinkedList<Integer>();
	private static int[] duplicates = new int [10000];

	public static void main(String[] args) throws IOException {
		String line;
		while ((line = in.readLine()) != null) {
			String[] numbers;
			int start;
			int sol;
			int i = 0;
			int calc;
			numbers = line.split(" ");
			start = Integer.parseInt(numbers[0]);
			sol = Integer.parseInt(numbers[1]);
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
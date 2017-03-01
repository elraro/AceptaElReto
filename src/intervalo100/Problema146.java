package intervalo100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Problema191 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static LinkedList<Integer> list;
	static String line;
	static int n;
	static int c;

	public static void main(String[] args) throws IOException {
		while ((line = in.readLine()) != null) {
			n = Integer.parseInt(line);
			list = new LinkedList<Integer>();
			for (int i = 2; i < n; i += 2) {
				list.add(i);
			}
			c = 3;
			while (list.size() > c) {
				for(int i=0; i < list.size(); i++) {
					if (i % c == 0) {
						
					}
				}
				c++;
			}
		}
		System.out.print(sb.toString());
	}
}
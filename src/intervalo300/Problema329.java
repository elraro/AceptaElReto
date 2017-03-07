package intervalo300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problema329 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static House[] houses;
	static StringTokenizer st;
	static final String SALTO = "\n";
	static String line;
	static int start;
	static int end;
	static int c;
	static int tunnel;
	static int tunnels;

	public static void main(String[] args) throws IOException {
		while ((line = in.readLine()) != null) {
			c = Integer.parseInt(line);
			if (c == 0)
				break;
			tunnel = -1;
			tunnels = 0;
			houses = new House[c];
			for (int i = 0; i < c; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				houses[i] = new House(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			}
			Arrays.sort(houses);
			for(House h : houses) {
				if (h.start >= tunnel) {
					tunnel = h.end;
					tunnels++;
				}
			}
			sb.append(tunnels).append(SALTO);
		}
		System.out.print(sb.toString());
	}
}

class House implements Comparable<House> {

	int start;
	int end;

	House(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(House o) {
		if (this.end < o.end)
			return -1;
		else if (this.end > o.end)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "House [start=" + start + ", end=" + end + "]";
	}

}
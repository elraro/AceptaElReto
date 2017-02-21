package intervalo100;

import java.util.Scanner;

public class Problema149 {

	static Scanner in = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		int casos;
		while (in.hasNext()) {
			casos = in.nextInt();
			long y, z = 0;
			for (int j = 0; j < casos; j++) {
				y = in.nextLong();
				if (y > z)
					z = y;
			}
			sb.append(z).append("\n");
		}
		System.out.print(sb.toString());
	}

}
package adabyron2017.faselocalucm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema384 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line;
		int l;
		int lm1;
		LOOP: while (true) {
			if (in.readLine() == null) {
				break;
			}
			l = Integer.parseInt(in.readLine());
			if (l < 3) {
				continue LOOP;
			}
			line = in.readLine().split(" ");
			lm1 = l - 1;
			if (Integer.parseInt(line[0]) < Integer.parseInt(line[lm1])) {
				System.out.println("ELEGIR OTRA");
				continue LOOP;
			}
			for (int j = 1; j < l; j++) {
				if (j != lm1) {
					if (Integer.parseInt(line[j]) > Integer.parseInt(line[j + 1])) {
						System.out.println("ELEGIR OTRA");
						continue LOOP;
					}
				}
			}
			System.out.println("SIEMPRE PREMIO");
		}
	}
}

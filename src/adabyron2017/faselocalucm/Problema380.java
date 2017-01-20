package adabyron2017.faselocalucm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problema380 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;
		while (true) {
			int l = Integer.parseInt(in.readLine());
			if (l == 0) {
				break;
			}
			StringTokenizer arr = new StringTokenizer(in.readLine());

			for (int i = 0; i < l; i++) {
				total += Integer.parseInt(arr.nextToken());
			}
			System.out.println(total);
			total = 0;
		}

	}

}

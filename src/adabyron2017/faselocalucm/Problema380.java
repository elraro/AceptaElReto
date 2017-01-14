package adabyron2017.faselocalucm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema380 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int l;
		String[] arr;
		int i;
		int total = 0;
		while (true) {
			l = Integer.parseInt(in.readLine());
			if (l == 0) {
				break;
			}
			arr = in.readLine().split(" ");
			for (i = 0; i < l; i++) {
				total += Integer.parseInt(arr[i]);
			}
			System.out.println(total);
			total = 0;
		}

	}

}

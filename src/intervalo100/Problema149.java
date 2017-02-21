package intervalo100;

import java.util.Scanner;

public class Problema149 {

	static Scanner in = new Scanner(System.in);

	public static boolean putoBugAsqueroso() {
		int n;
		try {
			n = in.nextInt();
		} catch (Exception e) {
			return false;
		}

		long y, z = 0;
		for (int j = 0; j < n; j++) {
			y = in.nextLong();
			if (y > z)
				z = y;
		}
		System.out.printf("%d\n", z);
		return true;

	}

	public static void main(String args[]) {
		while (putoBugAsqueroso());
	}

}
package intervalo100;

import java.util.Scanner;

public class Problema149 {
	
	static StringBuilder sb = new StringBuilder();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long vel = 0, velocidad = 0;
		long casos;
		while (sc.hasNextInt()) {
			casos = sc.nextInt();
			for (long i = 0; i < casos; i++) {
				velocidad = sc.nextInt();
				if (velocidad > vel)
					vel = velocidad;
			}
			sb.append(velocidad).append("\n");
			vel = 0;
		}
		System.out.print(sb.toString());
	}
}
package intervalo100;

import java.util.Scanner;

public class Problema149 {

	// public static void main(String[] args) throws Exception {
	// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	// boolean finished = false;
	// int c;
	// String strAux;
	// int toros;
	// while (!finished && (c = in.read()) != -1) {
	// // numero de toros
	// strAux = "" + ((char) c);
	// while ((c = in.read()) != -1 && c != 32) {
	// strAux = "" + ((char) c);
	// }
	// int z = 0;
	// toros = Integer.parseInt(strAux);
	// System.out.println("toros:" + toros);
	// for (int i = 0; i < toros; i++) {
	// strAux = "";
	// while ((c = in.read()) != -1) {
	// System.out.println("char: " + (char) c);
	// if (c == 32 || c == 10 || c == -1)
	// break;
	// strAux = strAux + ((char) c);
	// }
	// System.out.println(strAux);
	// if (Integer.parseInt(strAux) > z)
	// z = Integer.parseInt(strAux);
	// }
	// System.out.println("mayor: " + z);
	// if (c == -1)
	// finished = true;
	// }

	public static void main(String[] args) {
		boolean seguir = true;
		Scanner sc = new Scanner(System.in);
		long vel = 0, velocidad = 0;
		long casos;
		while (seguir) {
			if (sc.hasNext()) {
				casos = sc.nextInt();
				for (long i = 0; i < casos; i++) {
					velocidad = sc.nextInt();
					if (velocidad > vel)
						vel = velocidad;
				}
				System.out.println(velocidad);
				vel = 0;
			} else
				break;
		}
	}
}

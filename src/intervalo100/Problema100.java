package intervalo100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problema100 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int repeticiones = Integer.parseInt(in.readLine());
		char[] nArray;
		int iteracciones;
		String numero;
		int ascendente;
		int descendente;
		for (int i = 0; i < repeticiones; i++) {
			iteracciones = 0;
			numero = in.readLine();
			while (!numero.equals("6174")) {
				for (int l = numero.length(); l < 4; l++) {
					numero += "0";
				}
				nArray = numero.toCharArray();
				Arrays.sort(nArray); // ascendente
				ascendente = Integer.parseInt(String.valueOf(nArray));
				descendente = Integer.parseInt(new StringBuilder(String.valueOf(nArray)).reverse().toString()); // descendente
				descendente -= ascendente;
				numero = String.valueOf(descendente);
				iteracciones++;
				if (iteracciones == 8) {
					break;
				}
			}
			System.out.println(iteracciones);
		}
	}
}
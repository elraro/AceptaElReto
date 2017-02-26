package intervalo100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problema105 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	final static String MARTES = "MARTES";
	final static String MIERCOLES = "MIERCOLES";
	final static String JUEVES = "JUEVES";
	final static String VIERNES = "VIERNES";
	final static String SABADO = "SABADO";
	final static String DOMINGO = "DOMINGO";
	static String line;
	static float value = 0;
	static float bigger = 0;
	static String biggerDay;
	static float smaller = Float.MAX_VALUE;
	static String smallerDay;
	static float mean = 0;
	static int counter = 0;

	public static void main(String[] args) throws IOException {
		while ((line = in.readLine()) != null) {
			value = Float.parseFloat(line);
			if (value == -1)
				break;
			mean += value;
			if (value > bigger) {
				bigger = value;
				switch (counter) {
				case 0:
					biggerDay = MARTES;
					break;
				case 1:
					biggerDay = MIERCOLES;
					break;
				case 2:
					biggerDay = JUEVES;
					break;
				case 3:
					biggerDay = VIERNES;
					break;
				case 4:
					biggerDay = SABADO;
					break;
				case 5:
					biggerDay = DOMINGO;
				}
			}
			if (value < smaller) {
				smaller = value;
				switch (counter) {
				case 0:
					smallerDay = MARTES;
					break;
				case 1:
					smallerDay = MIERCOLES;
					break;
				case 2:
					smallerDay = JUEVES;
					break;
				case 3:
					smallerDay = VIERNES;
					break;
				case 4:
					smallerDay = SABADO;
					break;
				case 5:
					smallerDay = DOMINGO;
				}
			}
			counter++;
			if (counter == 6) {
				counter = 0;
				mean /= 6;
				if (bigger == smaller) {
					sb.append("EMPATE\n");
				} else {
					sb.append(biggerDay).append(" ").append(smallerDay).append(" ");
					if (value > mean) {
						sb.append("SI\n");
					} else {
						sb.append("NO\n");
					}
				}

				bigger = 0;
				smaller = Float.MAX_VALUE;
				mean = 0;
			}

		}
		System.out.print(sb.toString());
	}
}

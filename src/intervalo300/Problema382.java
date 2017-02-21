package intervalo300;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problema382 {
	
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static int l;
	static int longitudMetro;
	static int inicioMetro;
	static int distanciaAntena;
	static int radioAntena;
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, Exception {
		l = Integer.parseInt(in.readLine());
		for (int i = 0; i < l; i++) {
			inicioMetro = 0;
			st = new StringTokenizer(in.readLine());
			longitudMetro = Integer.parseInt(st.nextToken());
			st.nextToken(); // las antenas
			st = new StringTokenizer(in.readLine());
			while (st.hasMoreTokens()) {
				distanciaAntena = Integer.parseInt(st.nextToken());
				radioAntena = Integer.parseInt(st.nextToken());
				if (distanciaAntena - radioAntena <= inicioMetro) {
					if (distanciaAntena + radioAntena > inicioMetro)
						inicioMetro = distanciaAntena + radioAntena;
				}
			}
			if (inicioMetro >= longitudMetro) {
				sb.append("SI\n");
			} else {
				sb.append("NO\n");
			}
		}
		System.out.print(sb.toString());
	}
}
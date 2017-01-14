package adabyron2017.faselocalucm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema382 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(in.readLine());
		String[] line;
		int longitudMetro;
		int antenas;
		int inicioMetro;
		int distanciaAntena;
		int radioAntena;
		for(int i=0; i < l; i++) {
			inicioMetro = 0;
			line = in.readLine().split(" ");
			longitudMetro = Integer.parseInt(line[0]);
			antenas = Integer.parseInt(line[1]);
			line = in.readLine().split(" ");
			for(int j = 0; j < antenas; j++) {
				distanciaAntena = Integer.parseInt(line[j*2]);
				radioAntena = Integer.parseInt(line[j*2+1]);
//				System.out.println("Distancia antena: " + distanciaAntena);
//				System.out.println("Radio antena: " + radioAntena);
//				System.out.println("Inicio: " + inicioMetro);
				if (distanciaAntena-radioAntena <= inicioMetro) {
					if (distanciaAntena+radioAntena > inicioMetro)
						inicioMetro = distanciaAntena + radioAntena;
				}
			}
			if (inicioMetro >= longitudMetro) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}
		}
	}
}

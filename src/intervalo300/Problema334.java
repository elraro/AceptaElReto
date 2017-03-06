package intervalo300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema334 {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	// nombres pueblos
	static final String GALO = "GALO\n";
	static final String ROMANO = "ROMANO\n";
	static final String GODO = "GODO\n";
	static final String GRIEGO = "GRIEGO\n";
	static final String NORMANDO = "NORMANDO\n";
	static final String BRETON = "BRETON\n";
	static final String HISPANO = "HISPANO\n";
	static final String INDIO = "INDIO\n";
	static final String PICTO = "PICTO\n";
	static final String MULATO = "MULATO\n";
	static final String PLUS_ULTRA = "PLUS ULTRA\n";
	// terminaciones
	static final String MAC = "MAC";
	static final String IX = "IX";
	static final String US = "US";
	static final String UM = "UM";
	static final String IC = "IC";
	static final String AS = "AS";
	static final String AF = "AF";
	static final String IS = "IS";
	static final String OS = "OS";
	static final String AX = "AX";
	static final String EZ = "EZ";
	static final String A = "A";
	// variables
	static String line;
	static int c;

	public static void main(String[] args) throws IOException {
		c = Integer.parseInt(in.readLine());
		for (int i = 0; i < c; i++) {
			line = in.readLine();
			if (line.startsWith(MAC)) {
				if (line.endsWith(IX))
					sb.append(MULATO);
				else if (line.endsWith(US) || line.endsWith(UM))
					sb.append(MULATO);
				else if (line.endsWith(IC))
					sb.append(MULATO);
				else if (line.endsWith(AS))
					sb.append(MULATO);
				else if (line.endsWith(AF))
					sb.append(MULATO);
				else if (line.endsWith(IS) || line.endsWith(OS) || line.endsWith(AX))
					sb.append(MULATO);
				else if (line.endsWith(EZ))
					sb.append(MULATO);
				else if (line.endsWith(A))
					sb.append(MULATO);
				else
					sb.append(PICTO);
			} else {
				if (line.endsWith(IX))
					sb.append(GALO);
				else if (line.endsWith(US) || line.endsWith(UM))
					sb.append(ROMANO);
				else if (line.endsWith(IC))
					sb.append(GODO);
				else if (line.endsWith(AS))
					sb.append(GRIEGO);
				else if (line.endsWith(AF))
					sb.append(NORMANDO);
				else if (line.endsWith(IS) || line.endsWith(OS) || line.endsWith(AX))
					sb.append(BRETON);
				else if (line.endsWith(EZ))
					sb.append(HISPANO);
				else if (line.endsWith(A))
					sb.append(INDIO);
				else
					sb.append(PLUS_ULTRA);
			}
		}
		System.out.print(sb.toString());
	}
}
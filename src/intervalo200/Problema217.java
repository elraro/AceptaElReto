package intervalo200;

public class Problema217 {

	static StringBuilder out = new StringBuilder(10000);
	static int in;
	static int pre = 10;
	static final String DERECHA = "DERECHA\n";
	static final String IZQUIERDA = "IZQUIERDA\n";

	public static void main(String[] args) throws Exception {
		while (!((in = System.in.read()) == 48 && pre == 10)) {
			if (in == 10) {
				if ((pre & 1) == 0) {
					out.append(DERECHA);
				} else {
					out.append(IZQUIERDA);
				}
			}
			if (in != 13) {
				pre = in;
			}
		}
		System.out.print(out.toString());
	}
}

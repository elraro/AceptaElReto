package intervalo200.p50;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problema256 {

	public static void main(String[] args) throws Exception {
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("Entrada256.txt")));
		while (in.ready()) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			char[] v1 = st.nextToken().toCharArray();
			char[] v2 = st.nextToken().toCharArray();
			char[] v3 = st.nextToken().toCharArray();

			st = null;
		}
	}
}
package intervalo300;

import java.io.IOException;
import java.io.InputStream;

public class Problema362 {

	static StringBuilder sb = new StringBuilder();
	static InputReader in = new InputReader(System.in);
	static final int DIAPUTANAVIDAD = 25;
	static final int MESPUTANAVIDAD = 12;
	static final String SI = "SI\n";
	static final String NO = "NO\n";
	static int d;
	static int m;

	public static void main(String[] args) throws Exception {

		int n = in.readInt();

		for (int i = 0; i < n; i++) {
			if (in.readInt() == DIAPUTANAVIDAD) {
				if (in.readInt() == MESPUTANAVIDAD) {
					sb.append(SI);
				} else {
					sb.append(NO);
				}
			} else {
				in.readInt();
				sb.append(NO);
			}
		}
		System.out.print(sb.toString());
	}

	// FAST IO
	static class InputReader {
		InputStream stream;
		byte[] buf = new byte[1024];
		int curChar;
		int numChars;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		public int read() throws IOException {
			if (curChar >= numChars) {
				curChar = 0;
				numChars = stream.read(buf);
				if (numChars <= 0) {
					return -1;
				}
			}
			return buf[curChar++];
		}

		public int readInt() throws IOException {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res;
		}

		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
	}
}
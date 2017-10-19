package intervalo400;

import java.io.IOException;
import java.io.InputStream;

public class Problema410 {

	static StringBuilder sb = new StringBuilder();
	static InputReader in = new InputReader(System.in);
	static int[] number;
	static int[] checked;
	static int l;
	static int p;
	static int p_next;

	public static void main(String[] args) throws Exception {

		int n = in.readInt();

		BUCLE: for (int i = 0; i < n; i++) {
			number = in.readLineIntArray();
			l = number.length;
			checked = new int[l];
			p = 0;
			checked[0] = 1;
			p_next = (p + number[0]) % l;
			while (p != p_next && number[p_next] != 0 && p_next != 0 && checked[p_next] != 1) {
				p = p_next;
				checked[p] = 1;
				p_next = (p + number[p]) % l;
			}
			if (p_next != 0) {
				sb.append("NORMALES\n");
				continue BUCLE;
			} else {
				for (int j = 0; j < l; j++) {
					if (checked[j] == 0) {
						sb.append("NORMALES\n");
						continue BUCLE;
					}
				}
				sb.append("SALTARINES\n");
			}
		}
		System.gc();
		System.out.print(sb.toString());
	}

	// FAST IO
	static class InputReader {
		InputStream stream;
		byte[] buf = new byte[1024];
		int curChar;
		int numChars;
		//SpaceCharFilter filter;

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
		
		public boolean isNewLineChar(int c) {
			return c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int[] readLineIntArray() throws IOException {
			int[] buf = new int[64]; // line length
			int cnt = 0, c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			while (!isNewLineChar(c)) {
				buf[cnt++] = (int) (c - '0');
				c = read();
			}
			int[] r = new int[cnt];
			System.arraycopy(buf, 0, r, 0, cnt);
			return r;
		}
	}
}
package intervalo100;

import java.io.IOException;

public class Problema116 {

	static final char[][] h = new char[][] { new char[] {},
			new char[] { 'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', '.', '\n' },
			new char[] { 'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', '.', '\n', 'H', 'o', 'l', 'a', ' ', 'm', 'u',
					'n', 'd', 'o', '.', '\n' },
			new char[] { 'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', '.', '\n', 'H', 'o', 'l', 'a', ' ', 'm', 'u',
					'n', 'd', 'o', '.', '\n', 'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', '.', '\n' },
			new char[] { 'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', '.', '\n', 'H', 'o', 'l', 'a', ' ', 'm', 'u',
					'n', 'd', 'o', '.', '\n', 'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', '.', '\n', 'H', 'o',
					'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', '.', '\n' },
			new char[] { 'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', '.', '\n', 'H', 'o', 'l', 'a', ' ', 'm', 'u',
					'n', 'd', 'o', '.', '\n', 'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', '.', '\n', 'H', 'o',
					'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o', '.', '\n', 'H', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o',
					'.', '\n' } };

	public static void main(String[] args) throws IOException {
		int j = System.in.read() - 48;
		System.out.print(h[j]);
	}
}
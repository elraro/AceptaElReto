package intervalo200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Problema291 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static final String SALTO = "\n";
	static final String ESPACIO = " ";
	static final String FINAL = "----\n";

	static int c;
	static int l;
	static int c2;
	static String line;
	static String word;
	static LinkedList<Integer> tree;
	static TreeMap<String, LinkedList<Integer>> data;
	static Iterator<Integer> itr;

	public static void main(String[] args) throws IOException {
		while ((line = in.readLine()) != null) {
			c = Integer.parseInt(line);
			if (c == 0)
				break;
			data = new TreeMap<String, LinkedList<Integer>>();
			for (int i = 1; i <= c; i++) {
				st = new StringTokenizer(in.readLine(), " ");
				while (st.hasMoreTokens()) {
					word = st.nextToken().toLowerCase();
					if (word.length() > 2) {
						if (data.containsKey(word)) {
							if (data.get(word).getLast() != i)
								data.get(word).add(i);
						} else {
							tree = new LinkedList<Integer>();
							tree.add(i);
							data.put(word, tree);
						}
					}
				}
			}
			for (Entry<String, LinkedList<Integer>> entry : data.entrySet()) {
				sb.append(entry.getKey()).append(ESPACIO);
				itr = entry.getValue().iterator();
				l = entry.getValue().size();
				c2 = 0;
				while (itr.hasNext()) {
					c2++;
					sb.append(itr.next());
					if (c2 != l)
						sb.append(ESPACIO);
					else
						sb.append(SALTO);
				}
			}
			sb.append(FINAL);
		}
		System.out.print(sb.toString());
	}
}

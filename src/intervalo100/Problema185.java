package intervalo100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Problema185 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static final String SALTO = "\n";
	static final String SPACE = " ";
	static final String YES = "SI:";
	static String line;
	static int c;
	static final int LIKE = 1;
	static final int DISLIKE = -1;
	static int v;
	static String foodName;
	static TreeMap<String, Integer> foods;
	static ArrayList<String> set;
	static int t;

	public static void main(String[] args) throws IOException {
		while ((line = in.readLine()) != null) {
			c = Integer.parseInt(line);
			if (c == 0)
				break;
			foods = new TreeMap<String, Integer>();
			for (int i = 0; i < c; i++) {
				line = in.readLine();
				st = new StringTokenizer(line, SPACE);
				if (st.nextToken().equals(YES)) // or startWith ?
					v = LIKE;
				else
					v = DISLIKE;
				t = st.countTokens() - 1; // or equals("FIN") ?
				for (int j = 0; j < t; j++) {
					foodName = st.nextToken();
					if (foods.containsKey(foodName)) {
						if (foods.get(foodName) < 0 && v == LIKE) {
							foods.put(foodName, LIKE);
						}
					} else
						foods.put(foodName, v);
				}
			}
			c = 0;
			set = new ArrayList<String>();
			for (Entry<String, Integer> f : foods.entrySet()) {
				if (f.getValue() < 0) {
					set.add(f.getKey());
					c++;
				}
			}
			for (String f : set) {
				sb.append(f);
				c--;
				if (c != 0)
					sb.append(SPACE);
			}
			sb.append(SALTO);
		}
		System.out.print(sb.toString());
	}
}
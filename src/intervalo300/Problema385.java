package intervalo300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problema385 {

	static int ancho;
	static int alto;
	static String[] li;
	static int l;
	static char[][] lab;
	static Pos inicio;
	static Pos fin;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		l = Integer.parseInt(in.readLine());
		for (int i = 0; i < l; i++) {
			li = in.readLine().split(" ");
			List<Pos> camaras = new ArrayList<Pos>();
			ancho = Integer.parseInt(li[0]);
			alto = Integer.parseInt(li[1]);
			lab = new char[ancho][alto];
			for (int j = 0; j < alto; j++) {
				String li2 = in.readLine();
				for (int k = 0; k < ancho; k++) {
					char c = li2.charAt(k);
					if (c == '#') {
						lab[k][j] = 'C';
						continue;
					}
					lab[k][j] = c;
					if (c == 'E') {
						inicio = new Pos(k, j, 0);
						continue;
					}
					if (c == 'P') {
						fin = new Pos(k, j, 0);
						continue;
					}
					int t = Character.getNumericValue(c);
					if (t > 0 && t <= 9) {
						camaras.add(new Pos(k, j, t));
					}
				}
			}

			for (Pos p : camaras) {
				// System.out.println(p.toString());
				p.n(lab);
				p.s(lab, alto);
				p.e(lab);
				p.o(lab, ancho);
			}

//			for (int n = 0; n < lab.length; n++) {
//				System.out.println(Arrays.toString(lab[n]));
//			}
//
//			System.out.println("-----------");

			camaras.clear(); // nuse
			
//			System.out.println(inicio);
//			System.out.println(fin);

			// Vamos a resolver
			List<Cell> path = findShortestPath(lab, inicio, fin);
			if (path == null) {
				System.out.println("NO");
				continue;
			}
			System.out.println(path.size());

//			for (int n = 0; n < lab.length; n++) {
//				System.out.println(Arrays.toString(lab[n]));
//			}
		}

	}

	private static List<Cell> findShortestPath(char[][] maze, Pos inicio, Pos fin) {
		int[][] levelMatrix = new int[maze.length][maze[0].length];
		for (int i = 0; i < maze.length; ++i)
			for (int j = 0; j < maze[0].length; ++j) {
				levelMatrix[i][j] = (maze[i][j] != '.') ? -1 : 0;
			}
		levelMatrix[inicio.x][inicio.y] = 0;
		levelMatrix[fin.x][fin.y] = 0;
		
		
		
		LinkedList<Cell> queue = new LinkedList<Cell>();
		Cell start = new Cell(inicio.x, inicio.y); // TODO inicio
		Cell end = new Cell(fin.x, fin.y); // TODO FIN
		
		for (int n = 0; n < levelMatrix.length; n++) {
			System.out.println(Arrays.toString(levelMatrix[n]));
		}
		System.out.println("-----------");
		
		queue.add(start);
		levelMatrix[start.row][start.col] = 1;
		while (!queue.isEmpty()) {
			Cell cell = queue.poll();
			if (cell == end)
				break;
			int level = levelMatrix[cell.row][cell.col];
			Cell[] nextCells = new Cell[4];
			nextCells[3] = new Cell(cell.row, cell.col - 1);
			nextCells[2] = new Cell(cell.row - 1, cell.col);
			nextCells[1] = new Cell(cell.row, cell.col + 1);
			nextCells[0] = new Cell(cell.row + 1, cell.col);

			for (Cell nextCell : nextCells) {
				if (nextCell.row < 0 || nextCell.col < 0)
					continue;
				if (nextCell.row == maze.length || nextCell.col == maze[0].length)
					continue;
				if (levelMatrix[nextCell.row][nextCell.col] == 0) {
					queue.add(nextCell);
					levelMatrix[nextCell.row][nextCell.col] = level + 1;
				}
			}
		}
		if (levelMatrix[end.row][end.col] == 0)
			return null;
		LinkedList<Cell> path = new LinkedList<Cell>();
		Cell cell = end;
		while (!cell.equals(start)) {
			path.push(cell);
			int level = levelMatrix[cell.row][cell.col];
			Cell[] nextCells = new Cell[4];
			nextCells[0] = new Cell(cell.row + 1, cell.col);
			nextCells[1] = new Cell(cell.row, cell.col + 1);
			nextCells[2] = new Cell(cell.row - 1, cell.col);
			nextCells[3] = new Cell(cell.row, cell.col - 1);
			for (Cell nextCell : nextCells) {
				if (nextCell.row < 0 || nextCell.col < 0)
					continue;
				if (nextCell.row == maze.length || nextCell.col == maze[0].length)
					continue;
				if (levelMatrix[nextCell.row][nextCell.col] == level - 1) {
					cell = nextCell;
					break;
				}
			}
		}
		return path;
	}

	private static class Cell {
		public int row;
		public int col;

		public Cell(int row, int column) {
			this.row = row;
			this.col = column;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if ((obj == null) || (obj.getClass() != this.getClass()))
				return false;
			Cell cell = (Cell) obj;
			if (row == cell.row && col == cell.col)
				return true;
			return false;
		}
	}
}

class Pos {
	int x; // ancho
	int y; // alto
	int k;

	Pos(int x, int y, int k) {
		this.x = x;
		this.y = y;
		this.k = k;
	}

	public void n(char[][] lab) {
		int i = 1;
		for (int j = k - 1; j >= 0; j--) {
			if (y - i >= 0 && lab[x][y - i] == '.') {
				lab[x][y - i] = 'C';
				i++;
			} else {
				return;
			}

		}
	}

	public void s(char[][] lab, int alto) {
		int i = 1;
		for (int j = k - 1; j >= 0; j--) {
			if (y + i < alto && lab[x][y + i] == '.') {
				lab[x][y + i] = 'C';
				i++;
			} else {
				return;
			}

		}
	}

	public void e(char[][] lab) {
		int i = 1;
		for (int j = k - 1; j >= 0; j--) {
			if (x - i >= 0 && lab[x - i][y] == '.') {
				lab[x - i][y] = 'C';
				i++;
			} else {
				return;
			}

		}
	}

	public void o(char[][] lab, int ancho) {
		int i = 1;
		for (int j = k - 1; j >= 0; j--) {
			if (x + i < ancho && lab[x + i][y] == '.') {
				lab[x + i][y] = 'C';
				i++;
			} else {
				return;
			}

		}
	}
}

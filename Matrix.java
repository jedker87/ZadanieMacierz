import java.util.Random;

public class Matrix {

	private double tablica2D[][];
	private int row;
	private int cols;

	public Matrix(int row, int cols) {

		this.row = row;
		this.cols = cols;
		tablica2D = new double[row][cols];
		for (int i = 0; i < tablica2D.length; i++) {
			for (int j = 0; j < tablica2D.length; j++) {
				tablica2D[i][j] = 0;

			}
		}
	}

	public void set(int i, int j, double value) {
		int a = i;
		int b = j;
		tablica2D[a][b] = value;

	}

	public double get(int i, int j) {

		double get = tablica2D[i][j];
		return get;
	}

	public void fillWithRandomNumbers() {
		Random r = new Random();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				tablica2D[i][j] = r.nextInt();
			}

		}
	}

	public double findSecondMax() {
		double max = tablica2D[0][0];
		double max2 = 0;
		double findSecondMax = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				if (tablica2D[i][j] > max) {
					max = tablica2D[i][j];
				} else {
					if (tablica2D[i][j] > max2 || max2 < max) {
						max2 = tablica2D[i][j];
					}
				}

			}
		}

		findSecondMax = max2;
		return findSecondMax;
	}

	public double findSecondMin() {
		double min = tablica2D[0][0];
		double min2 = tablica2D[0][0];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				if (tablica2D[i][j] < min) {
					min = tablica2D[i][j];
				}
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				if (tablica2D[i][j] < min2 && tablica2D[i][j] != min) {
					min2 = tablica2D[i][j];
				}
			}
		}
		return min2;
	}

	public double findSumOnDiagonal() {
		double sum = 0;
		double findSumOnDiagonal = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == j || i == j - row - 1) {
					sum = sum + tablica2D[i][j];
				}
			}
		}

		findSumOnDiagonal = sum;
		return findSumOnDiagonal;

	}

	public String toString() {
		String tmp = "";

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < cols; j++) {
				tmp += tablica2D[i][j] + " ";
			}
			tmp += "\n";
		}
		return tmp;
	}

}

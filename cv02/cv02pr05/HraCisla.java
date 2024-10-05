package cv02pr05;

import java.util.Arrays;

public class HraCisla {
	public int[][] hraciPole = { { 7, 2, 4 }, { 5, 0, 6 }, { 8, 3, 1 } };

	private int[] najdiNulu(int[][] hraciPole) throws Exception {
		for (int i = 0; i < hraciPole.length; i++) {
			for (int j = 0; j < hraciPole[i].length; j++) {
				if (hraciPole[i][j] == 0) {
					return new int[] { i, j }; // Return row and column as an array
				}
			}
		}
		throw new Exception("nula je pryc!");
	}

	private boolean muzuSeSemPohnout(int row, int col, int[][] hraciPole) {
		return row >= 0 && row < hraciPole.length && col >= 0 && col < hraciPole[0].length;
	}

	public void posun(Smer smer) {
		int[] souradniceNuly = null;
		int[][] vyherniPole = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		try {
			souradniceNuly = najdiNulu(this.hraciPole);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int novyRadek = souradniceNuly[0];
		int novySloupec = souradniceNuly[1];

		switch (smer) {
		case NAHORU:
			novyRadek -= 1;
			break;
		case DOLU:
			novyRadek += 1;
			break;
		case DOLEVA:
			novySloupec -= 1;
			break;
		case DOPRAVA:
			novySloupec += 1;
			break;
		}

		if (muzuSeSemPohnout(novyRadek, novySloupec, this.hraciPole)) {
			// Prohozeni souradnic
			this.hraciPole[souradniceNuly[0]][souradniceNuly[1]] = this.hraciPole[novyRadek][novySloupec];
			this.hraciPole[novyRadek][novySloupec] = 0;
			if (Arrays.deepEquals(hraciPole, vyherniPole)) {
				System.out.println("GRATULUJI K VYHRE!");
			}
		} else {
			System.out.println("Nelze provest pohyb timto smerem.");
		}
	}

	@Override
	public String toString() {
		return Arrays.deepToString(this.hraciPole);
	}
}
package cv03pr02;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class HraCisla {
	public int[][] hraciPole = { { 7, 2, 4 }, { 5, 0, 6 }, { 8, 3, 1 } };
	private Set<String> historie = new LinkedHashSet<>();

	public HraCisla() {
		// inicialni stav chci mit take zaznamenan v historii
		zapisDoHistorie(this.hraciPole);
	}

	private int[] najdiNulu(int[][] hraciPole) throws Exception {
		for (int i = 0; i < hraciPole.length; i++) {
			for (int j = 0; j < hraciPole[i].length; j++) {
				if (hraciPole[i][j] == 0) {
					return new int[] { i, j };
				}
			}
		}
		throw new Exception("nula je pryc!");
	}

	private boolean muzuSeSemPohnout(int row, int col, int[][] hraciPole) {
		return row >= 0 && row < hraciPole.length && col >= 0 && col < hraciPole[0].length;
	}

	public void zapisDoHistorie(int[][] soucasnyStav) {
		String stavJakoString = Arrays.deepToString(soucasnyStav);
		if (!historie.add(stavJakoString)) { // kontroluji, jestli uz v historii existuje tento stav
			historie.remove(stavJakoString);
			historie.add(stavJakoString);
		}
	}

	public void posun(Smer smer) {
		int[] souradniceNuly = null;
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
			int[][] vyherniPole = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
			this.hraciPole[souradniceNuly[0]][souradniceNuly[1]] = this.hraciPole[novyRadek][novySloupec];
			this.hraciPole[novyRadek][novySloupec] = 0;
			zapisDoHistorie(this.hraciPole);

			if (Arrays.deepEquals(this.hraciPole, vyherniPole)) {
				System.out.println("GRATULUJI K VYHRE!");
			}
		} else {
			System.out.println("Nelze provest pohyb timto smerem.");
		}
	}

	public void vypisHistorii() {
		System.out.println("Historie : " + historie);
	}

	@Override
	public String toString() {
		return Arrays.deepToString(this.hraciPole);
	}
}
package cv03pr01;

import java.util.ArrayList;

public class Platno {
	@SuppressWarnings("unused")
	private int delka;
	@SuppressWarnings("unused")
	private int vyska;

	private ArrayList<Tvar> tvary = new ArrayList<Tvar>();

	public Platno(int delka, int vyska) {
		this.delka = delka;
		this.vyska = vyska;
	}

	public void pridej(Tvar t) {
		tvary.add(t);
	}

	public void vytvorRastr() {
		for (Tvar tvar : tvary) {
			tvar.vykresli();
		}
	}
}

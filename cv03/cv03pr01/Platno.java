package cv03pr01;

import java.util.ArrayList;

public class Platno {
	@SuppressWarnings("unused")
	private int x;
	@SuppressWarnings("unused")
	private int y;

	private ArrayList<Tvar> tvary = new ArrayList<Tvar>();

	public Platno(int x, int y) {
		this.x = x;
		this.y = y;
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

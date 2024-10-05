package cv03pr01;

import java.util.ArrayList;

public class Sloucenina extends Tvar {
	private ArrayList<Tvar> tvary = new ArrayList<Tvar>();

	public Sloucenina(int x, int y) {
		super(x, y);
	}

	public void pridej(Tvar t) {
		tvary.add(t);
	}

	public void vykresli() {
		for (Tvar tvar : tvary) {
			tvar.vykresli();
		}
	}
}

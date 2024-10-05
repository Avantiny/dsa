package cv02pr01;

import java.util.Vector;

public class Mapa {
	private Vector<Auto> auta = new Vector<Auto>();

	private void validateIndex(int index) {
		if (index < 0 || index >= auta.size()) {
			throw new IndexOutOfBoundsException("Index out of range: " + index);
		}
	}

	public void addAuto(Auto auto) {
		auta.add(auto);
	}

	public Auto getAuto(int index) {
		validateIndex(index);
		return auta.get(index);
	}

	public void removeAuto(int index) {
		validateIndex(index);
		auta.remove(index);
	}

	public int getPocetAut() {
		return auta.size();
	}

	public void vypisVsechnaAuta() {
		for (Auto auto : auta) {
			System.out.println(auto);
		}
	}
}

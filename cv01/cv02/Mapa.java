package cv02;

import java.util.List;

public class Mapa {
	public List<Auto> auta;

	public Mapa(List<Auto> auta) {
		this.auta = auta;
	}

	public void vypisAuta() {
		for (Auto auto : auta) {
			System.out.println(auto);
		}
	}
}

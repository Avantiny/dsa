package cv02;

import java.util.ArrayList;
import java.util.List;

public class Need4Speed {
	public static void main(String[] args) {
		List<Auto> autaList = new ArrayList<>();
		autaList.add(new Auto("Kara", 100, 200));
		autaList.add(new Auto("BrmBrm", 150, 250));
		autaList.add(new Auto("Jeduu", 200, 300));
		autaList.add(new Auto("Hyperfaro", 250, 350));

		Mapa mapa = new Mapa(autaList);
		mapa.vypisAuta();
	}
}
package cv02;

public class Paket {
	private Paket dalsi;

	public Paket getDalsi() {
		return dalsi;
	}

	public void setDalsi(Paket dalsi) {
		this.dalsi = dalsi;
	}
}

// UML Paket
//+-------------------------+
//|         Paket           |
//+-------------------------+
//| - dalsi: Paket          |
//+-------------------------+
//| + getDalsi(): Paket     |
//| + setDalsi(Paket): void |
//+-------------------------+
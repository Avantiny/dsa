package cv03cv04;

public class Paket {
	public Paket dalsi;

	public Paket(Paket paket) {
		this.dalsi = paket;
	}

	public Paket() {
		this.dalsi = null;
	}
}

package cv02;

public class Auto {
	public String nazev;
	public int x;
	public int y;

	public Auto(String nazev, int x, int y) {
		this.nazev = nazev;
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return nazev + " x:" + x + " y:" + y;
	}
}

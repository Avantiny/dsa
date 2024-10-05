package cv02pr01;

public class Auto {
	private int x;
	private int y;
	private String nazev;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
	}
	@Override
	public String toString() {
		return nazev + " x:" + x + " y:" + y;
	}
}
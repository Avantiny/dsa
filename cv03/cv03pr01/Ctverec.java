package cv03pr01;

public class Ctverec extends Tvar {
	private float delka;

	public Ctverec(int x, int y, float a) {
		super(x, y);
		this.delka = a;
	}

	@Override
	public void vykresli() {
		System.out.println("Kreslim ctverec: x: " + x + ", y: " + y + ", a:" + delka);
	};
}

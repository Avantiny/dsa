package cv03pr01;

public class Kruh extends Tvar {
	private float polomer;

	public Kruh(int x, int y, int r) {
		super(x, y);
		this.polomer = r;
	}

	@Override
	public void vykresli() {
		System.out.println("Kreslim kruh: x: " + x + ", y: " + y + ", r:" + polomer);
	}
}

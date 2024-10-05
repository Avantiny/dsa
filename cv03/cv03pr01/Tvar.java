package cv03pr01;

public abstract class Tvar {
	protected int x;
	protected int y;

	public Tvar(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract void vykresli();
}
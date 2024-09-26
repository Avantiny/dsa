package cv05;

public class Adresar {
	public Adresar ref1;
	public Adresar ref2;

	public Adresar(Adresar ref1, Adresar ref2) {
		this.ref1 = ref1;
		this.ref2 = ref2;
	}

	public Adresar(Adresar ref1) {
		this.ref1 = ref1;
		this.ref2 = null;
	}

	public Adresar() {
		this.ref1 = null;
		this.ref2 = null;
	}
}

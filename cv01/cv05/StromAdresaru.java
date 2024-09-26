package cv05;

public class StromAdresaru {
	public static void main(String[] args) {
		Adresar a5 = new Adresar();
		Adresar a4 = new Adresar();
		Adresar a3 = new Adresar();
		Adresar a2 = new Adresar(a3, a5);
		@SuppressWarnings("unused")
		Adresar a1 = new Adresar(a4, a2);
	}
}
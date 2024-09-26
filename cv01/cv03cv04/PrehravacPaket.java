package cv03cv04;

public class PrehravacPaket {
	public static void main(String[] args) {
		Paket p4 = new Paket();
		Paket p3 = new Paket(p4);
		Paket p2 = new Paket(p3);
		Paket p1 = new Paket(p2);

		// priklad 04
		p4.dalsi = p1;
	}
}
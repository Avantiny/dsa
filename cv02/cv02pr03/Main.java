package cv02pr03;

public class Main {
	public static void main(String[] args) {
		Adresar a5 = new Adresar(5);
		Adresar a3 = new Adresar(3);
		Adresar a4 = new Adresar(4);
		Adresar a2 = new Adresar(a5, a3, 2);
		Adresar a1 = new Adresar(a4, a2, 1);
		System.out.println(a1.toString());
	}
}

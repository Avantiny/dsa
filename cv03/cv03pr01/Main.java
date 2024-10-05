package cv03pr01;

public class Main {
	public static void main(String[] args) {
		Platno p = new Platno(1920, 1080);

		p.pridej(new Kruh(1, 2, 3));
		p.pridej(new Ctverec(2, 3, 4));

		Sloucenina s = new Sloucenina(5, 6);
		s.pridej(new Kruh(6, 8, 48932));
		s.pridej(new Ctverec(5, 6, 7));

		p.pridej(s);
		p.vytvorRastr();
	}
}

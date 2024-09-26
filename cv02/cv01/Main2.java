package cv01;

public class Main2 {
	public static void main(String[] args) {
		Mapa mapa = new Mapa();
		Auto a1 = new Auto();
		a1.setX(420);
		a1.setY(69);
		a1.setNazev("Speeedeeee");
		Auto a2 = new Auto();
		a2.setX(1337);
		a2.setY(911);
		a2.setNazev("Low rider");
		mapa.addAuto(a1);
		mapa.addAuto(a2);
		System.out.println("dej mi auticko: " + mapa.getAuto(1));
		mapa.removeAuto(1);
		System.out.println("melo by byt 1: " + mapa.getPocetAut());
		mapa.addAuto(a2);
		System.out.println("melo by byt 2: " + mapa.getPocetAut());
		System.out.println("Vypisuju auticka: ");
		mapa.vypisVsechnaAuta();
	}

}

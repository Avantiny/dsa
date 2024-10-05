package cv03pr02;

public class Main {
	public static void main(String[] args) {
		System.out
				.println("Zde zapisuji historii jako mnozinu, tudiz pri opakovani stejneho stavu prepisuji historii.");
		HraCisla hra = new HraCisla();
		System.out.println("Na zacatku:");
		System.out.println(hra);
		hra.posun(Smer.DOLU);
		System.out.println("Posun dolu:");
		System.out.println(hra);
		System.out.println("Doted jsem zapsal historii tak jak realne probehla.");
		hra.vypisHistorii();
		hra.posun(Smer.NAHORU);
		System.out.println(
				"Vracím se NAHORU a přepisuji historii. Pokud je vsechno spravne, mel bych videt uprostred druheho radku prvne 3 a potom 0");
		hra.vypisHistorii();
		System.out.println("Ted vykonam zakazany pohyb.");
		hra.posun(Smer.DOLU);
		System.out.println("Nejde mi to, budu podvadet.");
		int[][] skoroVyherniPole = { { 1, 0, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		hra.hraciPole = skoroVyherniPole;
		hra.posun(Smer.DOLEVA);
		hra.vypisHistorii();
	}
}

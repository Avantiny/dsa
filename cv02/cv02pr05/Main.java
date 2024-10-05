package cv02pr05;

public class Main {
	public static void main (String[] args) {
		HraCisla hra = new HraCisla();
		System.out.println("Na zacatku:");
		System.out.println(hra);
		hra.posun(Smer.DOLU);
		System.out.println("Posun dolu:");
		System.out.println(hra);
		System.out.println("Ted vykonam zakazany pohyb.");
		hra.posun(Smer.DOLU);
		System.out.println("Nejde mi to, budu podvadet.");
		int[][] skoroVyherniPole = { { 1, 0, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		hra.hraciPole = skoroVyherniPole;
		hra.posun(Smer.DOLEVA);
	}
}

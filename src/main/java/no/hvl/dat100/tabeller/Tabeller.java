package no.hvl.dat100.tabeller;

public class Tabeller {

	// a) Elisa
	public static void skrivUt(int[] tabell) {

        if (tabell == null) return;
        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i]);
            if (i < tabell.length - 1) System.out.print(" ");
        }
        System.out.println();
	}

	// b) Alissa
	public static String tilStreng(int[] tabell) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tabell.length; i++) {
            sb.append(tabell[i]);
            if (i<tabell.length-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();

		// TODO
		//throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
	}

	// c) Samsam
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d) Elisa
	public static boolean finnesTall(int[] tabell, int tall) {

        if (tabell == null) return false;
        for (int value : tabell) {
            if (value == tall) return true;
        }
        return false;
	}

	// e) Alissa
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f) Samsam
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g) Elisa
	public static boolean erSortert(int[] tabell) {
        if (tabell == null || tabell.length < 2) return true;
        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] < tabell[i - 1])
                return false;
        }
        return true;


	}

	// h) Alissa
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}

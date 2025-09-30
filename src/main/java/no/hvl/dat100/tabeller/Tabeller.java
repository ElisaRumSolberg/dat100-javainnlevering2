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

	}

	// c) Samsam
	public static int summer(int[] tabell) {

		if(tabell== null) return 0;
        int sum=0;
        for (int i: tabell){
            sum+=i;
        }
        return sum;
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
        for(int i = 0; i < tabell.length; i++){
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;


	}

	// f) Samsam
    public static int[] reverser(int [] tabell) {
        if (tabell == null) return null;
        int n =tabell.length;
        int[] rev = new int[n];
        for ( int i= 0; i<n; i++){
            rev[i]=tabell[n-1-i];
        }
        return rev;
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
        int n1=tabell1.length;
        int n2=tabell2.length;
        int[] out = new int[n1+n2];
        for(int i=0;i<n1;i++){
            out[i]=tabell1[i];
        }
        for(int j=0;j<n2;j++){
            out[n1+j]=tabell2[j];
        }
        return out;


	}
}

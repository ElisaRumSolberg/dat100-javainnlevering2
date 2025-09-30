package no.hvl.dat100.matriser;

public class Matriser {

	// a) Samsam
	public static void skrivUt(int[][] matrise) {
		for (int [] rad : matrise) {
            for (int tall : rad) {
                System.out.println(tall +  " " );
            }
System.out.println();
        }
	}

	// b Elisa
	public static String tilStreng(int[][] matrise) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matrise.length; i++) {
            int[] row = matrise[i];

            if (row == null) {
                sb.append("\n");
                continue;
            }


            for (int j = 0; j < row.length; j++) {
                sb.append(row[j]).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();

	}

	// c) Alissa
	public static int[][] skaler(int tall, int[][] matrise) {
        if(matrise==null) return null;
        int rows = matrise.length;
        if(rows==0) return new int[0][0];

        int cols = matrise[0].length;
        int[][] res = new int[rows][cols];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                res[i][j] = matrise[i][j]*tall;
            }
        }
        return res;
	
	}

	// d) Samsam
	public static boolean erLik(int[][] a, int[][] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) return false;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
	
	// e) Elisa
	public static int[][] speile(int[][] matrise) {
        if (matrise == null) return null;
        if (matrise.length == 0) return new int[0][0];

        int r = matrise.length;
        int c = matrise[0].length;

        int[][] res = new int[c][r];

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                res[j][i] = matrise[i][j];          // (i,j) -> (j,i)
            }
        }
        return res;

	
	}

	// f) Alissa
	public static int[][] multipliser(int[][] a, int[][] b) {
        if (a == null || b == null) throw new IllegalArgumentException(("Matriser kan ikke være null"));
        int r  = a.length;
        int k  =(r==0) ? 0 : a[0].length;
        int k2 =b.length;
        int c  =(k2==0) ? 0 : b[0].length;

        if(k!=k2){
            throw new IllegalArgumentException(("Uforenlige størrelse: a.kolonner ("+k+") !=b.rader("+k2+")"));
        }

        int[][] res = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int sum = 0;
                for (int t = 0; t < k; t++) {
                    sum += a[i][t]*b[t][j];
                }
                res[i][j]=sum;
            }
        }
        return res;

	
	}
}

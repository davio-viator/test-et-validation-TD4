import java.util.Arrays;

public class Matrice {

    private static String s ="";

    public static int[][] matrice(int m, int n, int a, int b) {
        // Déclarer la matrice vide de longueur m * n
        int[][] mat = new int[m][n];
        // Remplir la matrice case par case avec un random entre a et b
        for (int i = 0; i < m; i++){
            s+="[";
            for (int j = 0; j < n; j++){
                int x = a + (int)(Math.random() * ((b - a) + 1));
                mat[i][j] = a + (int)(Math.random() * ((b - a) + 1));
                s+= x+" ";
            }
            s+="]\n";
        }
        // Retour de la matrice complétée
        return mat;
    }


    public static void main(String[] args) throws Exception {
        int[][] mat = matrice(10,10,0,10);
        System.out.println(Arrays.deepToString(mat));
        System.out.println(s);
    }
}

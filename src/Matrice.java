import java.util.Arrays;

public class Matrice {

    public static int[][] matrice(int m, int n, int a, int b) {
        // Déclarer la matrice vide de longueur m * n
        int[][] mat = new int[m][n];
        // Remplir la matrice case par case avec un random entre a et b
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                mat[i][j] = a + (int)(Math.random() * ((b - a) + 1));
            }
        }
        // Retour de la matrice complétée
        return mat;
    }

    public static void main(String[] args) throws Exception {
        int[][] mat = matrice(3,5,1,1000);
        System.out.println(Arrays.deepToString(mat));
    }
}

import java.util.Arrays;

public class Triangle {

    public static int triangle(int a, int b, int c) {
        // Prendre les valeurs absolues car on ne peut avoir de longueur négative en géométrie
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        // Si une longeur est plus grande que la somme des deux autres alors ce n'est pas un triangle (si égal => triangle plat)
        if ((a > b+c) || (b > a+c) || (c > a+b)){
            return 4;
        }
        // Si les 3 longueurs sont égales alors c'est un triangle équilatéral
        if ((a == b) && (b == c)){
            return 2;
        }
        // Si seulement deux des longueurs sont égales alors c'est un triangle isocèle
        if (a == b || a == c || b == c){
            return 1;
        }
        // Si c'est un triangle mais pas isocèle ni équilatéral alors c'est un triangle scalène
        return 3;
    }

    public static void main(String[] args) throws Exception {
        int a = 8;
        int b = 4;
        int c = 4;
        System.out.println(triangle(a,b,c));
    }
}

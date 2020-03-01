import java.util.Arrays;

public class Triangle {

    public static int triangle(int a, int b, int c) {
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        // isosell
        if ((a == b) && (b == c)){
            return 2;
        }
        //equilateral
        if (a == b || a == c || b == c){
            return 1;
        }

        //pas un triangle
        if ((a > b+c) || (b > a+c) || (c > a+b)){
            return 4;
        }
        //quelqonque
        return 3;
    }

    public static void main(String[] args) throws Exception {
        int a = 7;
        int b = 3;
        int c = 4;
        System.out.println(triangle(a,b,c));
    }
}

public class Racine {

    // fonction demande deux double a et b
    public static double[] squareBetween_A_and_B(double a,double b){
        //on crée un tableau qui a la taille des valeurs entre a et b
        double[] values = new double[Math.abs((int)(b-a))+1];
        //on ajoute dans le tableau les valeurs des racines carré
        if(a<=b){
            for (int i = 0; i <= Math.abs(b-a) ; i++) {
                values[i] = Math.sqrt(a+i);
            }
        }else if(b<a){
            for (int i = 0; i <= Math.abs(b-a) ; i++) {
                values[i] = Math.sqrt(b+i);
            }
        }
        //on retourne le tableau qui contient les racines
        return values;
    }

    public static void main(String[] args){
        double a = 1;
        double b = 1;
        double[] t = squareBetween_A_and_B(a,b);
        for (double v : t) {
            System.out.println(v);
        }
    }

}
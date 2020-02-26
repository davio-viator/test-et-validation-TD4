public class Palindrome {



    public static int numberOfPalindromWords(String s){
        int nb = 0;
        //on decoupe le tableau pour ne recuperer que les mots
        if(s!=null){
            String[] words = s.split(" ");
            //on initialise le nombre de mot palindrome a zero

            //on initialise le fait que les mot soit palindrome ou non a false
            boolean b = false;
            //on verifie tout les mots du tableau
            for (String str :words) {
                str = str.toUpperCase();
                //on verifie tout les charactere du mots en pair
                for(int i = 0;i<str.length();i++){
                    //si les premiere et derniere lettre sont identique il met la valeur du boolean a true
                    if(str.charAt(i)==str.charAt(str.length()-1-i)) b = true;
                    // les les premiere et derniere lettre ne sont pas identique il met la valeur du booleen a false
                    else {
                        b=false;
                        break;
                    }
                }
                //on verifie si le boolean est vrai si il est vrai on increment le nombre de mot palindrome sinon il ne fait rien
                if(b){
                    nb++;
                }
            }
        }
        // on retourne le nombre de mot palindrome qu'il y avait dans le texte
        return nb;
    }


    public static void main(String[] args) {
        String s = "radar bateau tet";
        System.out.println(numberOfPalindromWords(s));
    }


}

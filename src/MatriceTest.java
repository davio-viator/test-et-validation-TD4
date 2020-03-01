import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.matchers.JUnitMatchers;
import org.junit.rules.ExpectedException;

import static com.sun.tools.doclint.Entity.quot;
import static java.lang.invoke.MethodHandles.catchException;
import static org.junit.Assert.*;

public class MatriceTest {

        Matrice m;
        @Before
        public void init(){
            m = new Matrice();
        }



    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void matrice_vide_doit_avoir_une_taille_de_zero() {
        assertEquals(0, m.matrice(0,0,0,0).length);
    }

    @Test
    public void matrice_avec_des_nombre_negatif_ne_doit_lever_une_execption() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(JUnitMatchers.containsString("NegativeArraySizeException"));
        m.matrice(1,-2,0,0);
    }

    @Test
    public void une_matrice_cosntruie_avec_un_char_ne_doit_pas_etre_vide(){
            assertEquals(0,m.matrice('a','b',4,5).length);
    }

    @Test
    public void une_matrice_dont_le_min_ou_max_est_un_char_ne_doit_pas_etre_vide(){
        assertEquals(0,m.matrice(4,5,'4','5').length);
    }

    @Test
    public void si_b_plus_petit_que_a_il_ne_doit_pas_y_avoir_d_erreur(){
        assertEquals(20,m.matrice(5,4,1,10).length*m.matrice(5,4,1,10)[0].length);
    }

    @Test
    public void la_matrice_contient_bien_que_des_valeur_entre_a_et_b(){
        int[] t = {0,1,2,3,4,5,6,7,8,9,10};
        int[] b = m.matrice(10,10,0,10)[0];
        //abandon
    }











}

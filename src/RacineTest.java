import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


public class RacineTest {

    @Test
    public void racine_1_element() throws Exception {
        double a = 1;
        double b = 1;
        double[] values = {1};
        assertArrayEquals(values, Racine.squareBetween_A_and_B(a, b),0.0001);
    }

    @Test
    public void racine_2_elements() throws Exception {
        double a = 1;
        double b = 2;
        double[] values = {1, Math.sqrt(2)};
        assertArrayEquals(values, Racine.squareBetween_A_and_B(a, b),0.0001);
    }

    @Test
    public void racine_3_elements() throws Exception {
        double a = 5;
        double b = 7;
        double[] values = {Math.sqrt(5), Math.sqrt(6), Math.sqrt(7)};
        assertArrayEquals(values, Racine.squareBetween_A_and_B(a, b),0.0001);
    }

    @Test
    public void racine_3_elements_avec_0() throws Exception {
        double a = 0;
        double b = 2;
        double[] values = {Math.sqrt(0), Math.sqrt(1), Math.sqrt(2)};
        assertArrayEquals(values, Racine.squareBetween_A_and_B(a, b),0.0001);
    }

    @Test
    public void racine_int_en_entree(){
        int x = 0;
        int y = 2;
        double[] values = {Math.sqrt(0), Math.sqrt(1), Math.sqrt(2)};
        assertArrayEquals(values, Racine.squareBetween_A_and_B(x, y),0.0001);
    }

    @Test
    public void racine_1_element_avec_negatif(){
        double a = -1;
        double b = -1;
        double[] values = {Math.sqrt(-1)};
        assertArrayEquals(values, Racine.squareBetween_A_and_B(a, b),0.0001);
    }

    @Test
    public void racine_b_plus_petit(){
        double a = 2;
        double b = 1;
        double[] values = {1, Math.sqrt(2)};
        assertArrayEquals(values, Racine.squareBetween_A_and_B(a, b),0.0001);
    }
}
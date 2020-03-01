import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    Triangle t;
    int type;
    @Before
    public void init(){
        t = new Triangle();

    }

    @Test
    public void a_et_b_egaux_c_different(){
        type = 2;
        assertEquals(type,t.triangle(4,4,5));
    }

    @Test
    public void a_et_c_egaux_b_different(){
        type = 2;
        assertEquals(type,t.triangle(4,2,4));
    }

    @Test
    public void b_et_c_egaux_a_different(){
        type = 2;
        assertEquals(type,t.triangle(3,4,4));
    }

    @Test
    public void a_b_et_c_egaux(){
        type = 1;
        assertEquals(type,t.triangle(4,4,4));
    }

    @Test
    public void a_b_et_c_different(){
        type = 3;
        assertEquals(type,t.triangle(2,3,4));
    }

    @Test void triangle_imposible(){
        type = 4;
        assertEquals(type,t.triangle(7,3,4));
    }

    @Test void triangle_valeur_negative(){
        type = 4;
        assertEquals(type,t.triangle(-2,3,4));
    }

    @Test void triangle_a_zero(){
        type = 4;
        assertEquals(type,t.triangle(0,0,0));
    }

    @Test void triangle_valeur_charactere(){
        type = 4;
        assertEquals(type,t.triangle('0','0','0'));
    }


}

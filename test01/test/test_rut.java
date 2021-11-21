package App;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.sql.*;

public class test_rut {
    @Test
    public void arrienda_menor_a_28(){

        boolean result = App.arrienda("Juan", 7, 2021);
        assertTrue(result,true);
    }

    public void arrienda28() {
        boolean result = App.arrienda("Jorge", 0, 2021);
        assertTrue(result,false);
    }

    public void arriendasuma28() {
        boolean result = App.arrienda("Francisco", 6, 2021);
        assertTrue(result,false);
    }

    public void inyeccionsql() {

    }
}
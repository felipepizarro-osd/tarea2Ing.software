package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_rut{
    @Test
    public void arrienda_menor_a_28(){

        boolean result = App.arrienda("Juan", 7, 2021);
        assertEquals(result, true);
    }
    @Test
    public void arrienda28() {
        boolean result = App.arrienda("Jorge", 0, 2021);
        assertEquals(result,false);
    }
    @Test
    public void arriendasuma28() {
        boolean result = App.arrienda("Francisco", 6, 2021);
        assertEquals(result,false);
    }

    public void inyeccionsql() {

    }
}
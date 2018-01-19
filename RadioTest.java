/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class RadioTest {
    public RadioTest() {
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Radio method, of class Radio.
     */
    @Test
    public void testRadio() {
        System.out.println("Radio");
    }

    /**
     * Test of frecAdelante method, of class Radio.
     */
    @Test
    public void testFrecAdelante() {
        System.out.println("frecAdelante");
        RadioI a = new Radio();
        String s = a.cambioFrecuencia();
        assertEquals("540",a.frecAdelante());
        assertEquals("550",a.frecAdelante());
    }

    /**
     * Test of frecAtras method, of class Radio.
     */
    @Test
    public void testFrecAtras() {
        System.out.println("frecAtras");
        RadioI a = new Radio();
        String s = a.cambioFrecuencia();
        assertEquals("530",a.frecAtras());
        assertEquals("540",a.frecAdelante());
        assertEquals("530",a.frecAtras());
    }

    /**
     * Test of prender method, of class Radio.
     */
    @Test
    public void testPrender() {
        System.out.println("prender");
    }

    /**
     * Test of apagar method, of class Radio.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
    }

    /**
     * Test of cambioFrecuencia method, of class Radio.
     */
    @Test
    public void testCambioFrecuencia() {
        System.out.println("cambioFrecuencia");
        RadioI a = new Radio();
        assertEquals("AM",a.cambioFrecuencia());
        assertEquals("FM",a.cambioFrecuencia());
    }

    public class RadioImpl extends Radio {
    }

    /**
     * Test of guardarEstacionActual method, of class Radio.
     */
    @Test
    public void testGuardarEstacionActual() {
        System.out.println("guardarEstacionActual");
    }

    /**
     * Test of obtenerEstacion method, of class Radio.
     */
    @Test
    public void testObtenerEstacion() {
        System.out.println("obtenerEstacion");
    }

    /**
     * Test of mostrarEstacion method, of class Radio.
     */
    @Test
    public void testMostrarEstacion() {
        System.out.println("mostrarEstacion");
    }

    /**
     * Test of estaPrendido method, of class Radio.
     */
    @Test
    public void testEstaPrendido() {
        System.out.println("estaPrendido");
    }

    /**
     * Test of obtenerEstado method, of class Radio.
     */
    @Test
    public void testObtenerEstado() {
        System.out.println("obtenerEstado");
      
    }

    
}

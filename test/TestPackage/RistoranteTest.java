/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;


import java.util.Vector;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import esercizio.pkg5.Ingrediente;
import esercizio.pkg5.Ordine;
import esercizio.pkg5.Ordine_Tavolo;
import esercizio.pkg5.Piatto;
import esercizio.pkg5.Ristorante;
import java.util.ArrayList;

/**
 *
 * @author juliet
 */
public class RistoranteTest {

    public RistoranteTest() {
    }

    /**
     * Test of printls method, of class Ristorante.
     */
    @Test
    public void testPrintls() {
        System.out.println("tipopiatti");
        String tipopiatto = "Primo";
        Piatto p1 = new Piatto("Pasta", "Primo");
        Piatto p2 = new Piatto("Pasta", "Secondo");
        Ristorante instance = new Ristorante();
        instance.addMenù(p1);
        instance.addMenù(p1);
        instance.addMenù(p2);
        Vector<Piatto> result = instance.printls(tipopiatto);
        assertEquals(2, result.size());
    }

    /**
     * Test of addMenù method, of class Ristorante.
     */
    @Test
    public void testAggiuntaPiatto() {
        System.out.println("AggiuntaPiatto");
        Piatto x = null;
        Ristorante instance = new Ristorante();
        instance.addMenù(x);
        assertEquals(1, instance.GetSizeMenù());
    }

    /**
     * Test of rmMenù method, of class Ristorante.
     */
    @Test
    public void testRimozionePiatto() {
        System.out.println("RimozionePiatto");
        Piatto x = null;
        Ristorante instance = new Ristorante();
        instance.addMenù(x);
        instance.addMenù(x);
        instance.rmMenù(x);
        assertEquals(1, instance.GetSizeMenù());
    }

    /**
     * Test of ImpMax method, of class Ristorante.
     */
    @Test
    public void testImportomax() {
        System.out.println("Importomax");
        Ingrediente i1 = new Ingrediente("Ragu", 1, 2);
        Piatto p1 = new Piatto("Pasta al ragu", "Primo");
        p1.addIng(i1);
        Ristorante instance = new Ristorante();
        Ordine_Tavolo o1 = new Ordine_Tavolo(1, "Luca");
        o1.addPiatto(p1);
        instance.addOrdine(o1);
        double expResult = 2.0;
        double result = instance.ImpMax();
        assertEquals(expResult, result,0.0);
    }

    /**
     * Test of IncassoGiornaliero method, of class Ristorante.
     */
    @Test
    public void testIncassoGiornaliero() {
        System.out.println("IncassoGiornaliero");
        Ingrediente i1 = new Ingrediente("Ragu", 1, 2);
        Piatto p1 = new Piatto("Pasta al ragu", "Primo");
        p1.addIng(i1);
        Ristorante instance = new Ristorante();
        Ordine_Tavolo o1 = new Ordine_Tavolo(1, "Luca");
        o1.addPiatto(p1);
        instance.addOrdine(o1);
        double expResult = 2.0;
        double result = instance.Incasso();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of AggiuntaOrdine method, of class Ristorante.
     */
    @Test
    public void testAggiuntaOrdine() {
        System.out.println("AggiuntaOrdine");
        Ordine x = null;
        Ristorante instance = new Ristorante();
        instance.addOrdine(x);
        assertEquals(1, instance.GetSizeOrdine());
    }

    /**
     * Test of rmOrdine method, of class Ristorante.
     */
    @Test
    public void testRimozioneOrdine() {
        System.out.println("RimozioneOrdine");
        Ordine x = null;
        Ristorante instance = new Ristorante();
        instance.addOrdine(x);
        instance.rmOrdine(x);
        instance.addOrdine(x);
        assertEquals(1, instance.GetSizeOrdine());
    }

    /**
     * Test of GetSizemenu method, of class Ristorante.
     */
    @Test
    public void testGetSizemenu() {
        System.out.println("GetSizemenu");
        Piatto x = null;
        Ristorante instance = new Ristorante();
        instance.addMenù(x);
        int expResult = 1;
        int result = instance.GetSizeMenù();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetSizeordine method, of class Ristorante.
     */
    @Test
    public void testGetSizeordine() {
        System.out.println("GetSizeordine");
        Ordine x = null;
        Ristorante instance = new Ristorante();
        instance.addOrdine(x);
        int expResult = 1;
        int result = instance.GetSizeOrdine();
        assertEquals(expResult, result);
    }

}
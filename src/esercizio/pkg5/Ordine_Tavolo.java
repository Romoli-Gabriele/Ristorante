/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.pkg5;

import static esercizio.pkg5.Ordine_Domicilio.costo_fisso;

/**
 *
 * @author gabbo
 */
public class Ordine_Tavolo extends Ordine{
    
    protected int nT;
    protected String nomeC;
    protected static double costo_fisso = 0;

    public Ordine_Tavolo(int nT, String nomeC) {
        super();
        this.nT = nT;
        this.nomeC = nomeC;
    }

    public int getnT() {
        return nT;
    }



    public String getNomeC() {
        return nomeC;
    }


    
  
}

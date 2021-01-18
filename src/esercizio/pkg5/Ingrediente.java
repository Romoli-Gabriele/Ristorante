/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.pkg5;

/**
 *
 * @author gabbo
 */
public class Ingrediente {

    protected String descrizione;
    protected double quantità;
    protected double prezzoU;
    
    public Ingrediente(String descrizione, double quantità, double prezzoU) {
        this.descrizione = descrizione;
        this.quantità = quantità;
        this.prezzoU = prezzoU;
    }


    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getQuantità() {
        return quantità;
    }

    public void setQuantità(double quantità) {
        this.quantità = quantità;
    }

    public double getPrezzoU() {
        return prezzoU;
    }

    public void setPrezzoU(double prezzoU) {
        this.prezzoU = prezzoU;
    }
}

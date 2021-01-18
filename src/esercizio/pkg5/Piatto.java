/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.pkg5;
import java.util.Vector;

/**
 *
 * @author gabbo
 */
public class Piatto {


    protected String nome;
    protected String tipo;
    protected Vector <Ingrediente> IngP;
    protected double prezzo;

        public Piatto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        double p = 0;
        IngP = new Vector <Ingrediente>();
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
        
public void addIng(Ingrediente I){
    IngP.addElement(I);
    double p = 0;
        for(int i = 0; i < IngP.size(); i++){
        p += IngP.get(i).getPrezzoU()*IngP.get(i).getPrezzoU();
        }
        prezzo = p;
}
    
public void rmIng(Ingrediente I){
    IngP.removeElement(I);
    double p = 0;
        for(int i = 0; i < IngP.size(); i++){
        p += IngP.get(i).getPrezzoU()*IngP.get(i).getPrezzoU();
        }
        prezzo = p;
    
    }

public void print(){
System.out.println("Nome: "+nome);
System.out.println("Prezzo: "+prezzo+"€");
}
}

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
public class Esercizio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ingrediente PenneRigate = new Ingrediente("penne rigate", 100, 0.5 );
        Ingrediente Ragu = new Ingrediente("ragù alla bolognese", 100, 2 );
        Ingrediente Gnocchi = new Ingrediente("Gnocchi di patate", 100, 0.5 );
        Piatto PastaAlRagù = new Piatto("Pasta Al Ragù", "primo");
        PastaAlRagù.addIng(Ragu);
        PastaAlRagù.addIng(PenneRigate);
        Piatto GnocchiAlRagù = new Piatto("Gnocchi Al Ragù", "primo");
        GnocchiAlRagù.addIng(Ragu);
        GnocchiAlRagù.addIng(Gnocchi);
        Ordine_Domicilio f = new Ordine_Domicilio("via vai",2020,11,0,12,30);
        f.addPiatto(PastaAlRagù);
        f.addPiatto(GnocchiAlRagù);
        System.out.println(PastaAlRagù.getPrezzo());
        System.out.println(GnocchiAlRagù.getPrezzo());
        System.out.println(f.Prezzo());
       
        
    }
    
}

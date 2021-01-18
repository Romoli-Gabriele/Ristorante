
package esercizio.pkg5;

import static esercizio.pkg5.Ordine_Domicilio.costo_fisso;
import java.util.Vector;

/**
 *
 * @author gabbo
 */
public class Ordine {

    protected static int numero = 0;
    protected Vector <Piatto> PO;
    
   
public Ordine() {
        
        PO = new Vector <Piatto>();
        numero++;
    }

    public Vector<Piatto> getPO() {
        return PO;
    }

    public void setPO(Vector<Piatto> PO) {
        this.PO = PO;
    }


public void addPiatto(Piatto P){
PO.add(P);

}

public void rmPiatto(Piatto P){
PO.remove(P);

}
public double Prezzo(){
    double tot = costo_fisso;
        for(int i = 0; i < PO.size(); i++){
        tot += PO.get(i).getPrezzo();
        }
        return tot;
    }

}

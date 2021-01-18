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
public class Ristorante {
    protected Vector <Piatto> Menù;
    protected Vector <Ordine> LS;

    public Ristorante() {
        Menù = new Vector <Piatto>();
        LS = new Vector <Ordine>();
    }
    
public void addMenù(Piatto P){
Menù.add(P);
}
public void rmMenù(Piatto P){
Menù.remove(P);
}

public void addOrdine(Ordine O){
LS.add(O);
}
public void rmOrdine(Ordine O){
LS.remove(O);

}
public double Incasso(){
    double Inc = 0;
    Ordine_Domicilio d;
    Ordine_Tavolo t;
    for(int i = 0; i < LS.size(); i++){
    if(LS.get(i) instanceof Ordine_Domicilio){
    d = (Ordine_Domicilio)LS.get(i);
    Inc += d.Prezzo();
    }else{
    t = (Ordine_Tavolo)LS.get(i);
    Inc += t.Prezzo();
    }
    }
    return Inc;
}
public double ImpMax(){
    Ordine Max = new Ordine();
    for(int i = 0; i < LS.size(); i++){
    if(LS.get(i).Prezzo() > Max.Prezzo()){

        Max = LS.get(i);
        }
}
        return Max.Prezzo();
}

public Vector<Piatto> printls(String tipo){
    Vector <Piatto> M = new Vector<Piatto>();
    Vector <Piatto> MT = new Vector<Piatto>();
for(int i =0; i < Menù.size();i++ ){
if(Menù.get(i).getTipo().equals(tipo)){
M.add(Menù.get(i));
}
}
 Piatto Min = new Piatto("//",tipo);  
 Min.setPrezzo(100000000);
 int i;
 for(int j=0; j < M.size();j++){
    for(i = 0; i < M.size(); i++){
    if(M.get(i).getPrezzo() < Min.getPrezzo()){
    
        Min = M.get(i);
        }
    
}
    Min.print();
    M.remove(i);
    MT.add(Min);
    

}
 return MT;
}
public int GetSizeMenù(){
return Menù.size();
}
public int GetSizeOrdine(){
return LS.size();
}
}

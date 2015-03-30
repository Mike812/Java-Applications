
package gui;
import java.awt.Color;
import root.*;

public class Feld extends javax.swing.JButton {
    
    private Brett brett;
    private Stein stein;
    private boolean istSchwarz;
    private int zeile;
    private int spalte;
    
    public Feld (Brett brett, boolean schwarz, int zeile, int spalte ){
        this.brett=brett;
        istSchwarz=schwarz;
        this.zeile=zeile;
        this.spalte=spalte;
    }
    
     public void setStein (Stein stein, boolean geschlagen){
        setStein(stein, false, geschlagen);
    }
    
    public void setStein(Stein stein, boolean init, boolean geschlagen){
        if(!init && stein.getClass().getCanonicalName().equals("root.Einfach") && (zeile == 0 || zeile == 9)){
            stein = new Dame (this, stein.getSchwarz());
        }
        this.stein=stein;
        stein.setFeld(this, geschlagen);
        setForeground(stein.getSchwarz() ? Color.BLACK : Color.WHITE);
        this.setFont(new java.awt.Font("Dialog", 1, 36));
        setText(stein.getSymbol());
    }
    
   public Brett getBrett(){
       return brett;
   }
   
   public Stein getStein(){
       return stein;
   }
   public void wegStein(){
       stein=null;
       brett.merkeBeginn();
       setText("");
   }
   
   public int getZeile(){
       return zeile;
   }
   
   public int getSpalte(){
       return spalte; 
   }
   
}

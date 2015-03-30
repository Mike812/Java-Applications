
package root;
import gui.*;

public class Dame extends Stein{
    
    public Dame (Feld feld, boolean istSchwarz){
        super(feld, istSchwarz);
    }
    
    public boolean istOk(Feld feld) {
        
        int dx=feld.getSpalte() - getFeld().getSpalte();
        int dy=feld.getZeile() - getFeld().getZeile();
        
        if (Math.abs(dx) != Math.abs(dy)){
            return false;
        } else if (Math.abs(dx) == 0){
            return false;
        } 
            
        return true;    
      
    }
    
    public String getSymbol(){
        return "\u25c9";
    }
}

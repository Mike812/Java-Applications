package root;

import gui.*;

public abstract class Stein {

    private Feld feld;
    private boolean istSchwarz;

    public Stein(Feld feld, boolean schwarz) {
        this.feld = feld;
        istSchwarz = schwarz;
    }

    public void setFeld(Feld feld, boolean geschlagen) {
        this.feld = feld;
        feld.getBrett().merkeEnde(this, geschlagen);
        
    }

    public boolean getSchwarz() {
        return istSchwarz;
    }

    public Feld getFeld() {
        return feld;
    }

    public abstract boolean istOk(Feld feld);
    
    public abstract String getSymbol();
}

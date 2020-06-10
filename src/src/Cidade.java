
package src;

import java.util.LinkedList;
import java.util.List;


public class Cidade {
    private List<Local> locais = new LinkedList<Local>();
    
    public void addLocal(Local local) {
        locais.add(local);
    }
    
    public Local getLocal(int i) {
        return locais.get(i);
    }

    int calculaMenorCusto(Local pontoPartida, Local pontoDestino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

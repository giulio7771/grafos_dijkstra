package src;

import java.util.LinkedList;
import java.util.List;

public class Caminho {
    private List<Rua> historico = new LinkedList<Rua>();
    private int custoAcumulado = 0;
    private Local localCorrente;
    
    public void addRua(Rua rua) {
        this.historico.add(rua);
        this.localCorrente = rua.getLocalDestino();
    }

    public int getCustoAcumulado() {
        return custoAcumulado;
    }

    public void setCustoAcumulado(int custoAcumulado) {
        this.custoAcumulado = custoAcumulado;
    }
    
    public void somaCustoAcumulado(int custo) {
        this.custoAcumulado += custo;
    }
    
}

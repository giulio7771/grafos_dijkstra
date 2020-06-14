package src;

import java.util.LinkedList;
import java.util.List;

class Local {
    private int nome;
    private Integer custo = Integer.MAX_VALUE;
    
    private List<Rua> ruas = new LinkedList<Rua>(); 

    public Local(int nome) {
        this.nome = nome;
    }
    
    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }
    
    public void addRua(Rua rua) {
        this.ruas.add(rua);
    }
    
    public List<Rua> getRuas() {
        return this.ruas;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    void somaCusto(int custo) {
        this.custo += custo;
    }
}

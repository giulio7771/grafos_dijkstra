package src;

import java.util.LinkedList;
import java.util.List;

class Local {
    private int nome;
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
    
}

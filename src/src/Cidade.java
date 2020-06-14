package src;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Cidade {

    private final List<Local> locais = new LinkedList<>();
    private final List<Integer> idLocaisVisitados = new LinkedList<>();

    public void addLocal(Local local) {
        this.locais.add(local);
    }

    public Local getLocal(int i) {
        return this.locais.get(i - 1);
    }

    int calculaMenorCusto(Local pontoPartida, Local pontoDestino) {
        pontoPartida.setCusto(0);
        expandirNo(pontoDestino);

        return 0;
    }

    private List<Local> expandirNo(Local no) {
        List<Rua> ruas = this.filtrarRuasNaoVisitadas(no.getRuas());
        List<Local> nosExpandidos = new LinkedList<>();
        for (Iterator<Rua> iterator = ruas.iterator(); iterator.hasNext();) {
            Rua ruaCorrente = iterator.next();
            Local noDestino = ruaCorrente.getLocalDestino();
            int custoNovaRota = ruaCorrente.getTempo() + no.getCusto();
            if (custoNovaRota < noDestino.getCusto()) {
                noDestino.setCusto(custoNovaRota);
                nosExpandidos.add(noDestino);
            }
        }
        this.idLocaisVisitados.add(no.getNome());
        return nosExpandidos;
    }

    public void addIdLocalVisitado(int id) {
        this.idLocaisVisitados.add(id);
    }

    public boolean isLocalVisitado(int id) {
        for (Iterator<Integer> it = idLocaisVisitados.iterator(); it.hasNext();) {
            Integer idCorrente = it.next();
            if (idCorrente == id) {
                return true;
            }
        }
        return false;
    }

    //overload
    public boolean isLocalVisitado(Local local) {
        for (Iterator<Integer> it = idLocaisVisitados.iterator(); it.hasNext();) {
            Integer idCorrente = it.next();
            if (idCorrente == local.getNome()) {
                return true;
            }
        }
        return false;
    }

    public List<Rua> filtrarRuasNaoVisitadas(List<Rua> ruas) {
        List<Rua> ruasFiltradas = new LinkedList<>();
        for (Iterator<Rua> iterator = ruas.iterator(); iterator.hasNext();) {
            Rua ruaAtual = iterator.next();
            if (!isLocalVisitado(ruaAtual.getLocalDestino())) {
                ruasFiltradas.add(ruaAtual);
            }
        }
        return ruasFiltradas;
    }
}

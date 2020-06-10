
package src;

public class Rua {
    private Local localPartida;
    private Local localDestino;
    private int tempo;

    public Rua(Local localPartida, Local localDestino, int tempo) {
        this.localPartida = localPartida;
        this.localDestino = localDestino;
        this.tempo = tempo;
    }


    public Local getLocalPartida() {
        return localPartida;
    }

    public void setLocalPartida(Local localPartida) {
        this.localPartida = localPartida;
    }

    public Local getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(Local localDestino) {
        this.localDestino = localDestino;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
}

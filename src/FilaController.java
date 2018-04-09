public class FilaController {

    private int lugarFila;
    private int quantidadeEspera;
    private int prioridade;

    public FilaController(){}

    public FilaController(int lugarFila, int quantidadeEspera, int prioridade){
        this.lugarFila = lugarFila;
        this.quantidadeEspera = quantidadeEspera;
        this.prioridade = prioridade;
    }

    public int getLugarFila() {
        return lugarFila;
    }

    public void setLugarFila(int lugarFila) {
        this.lugarFila = lugarFila;
    }

    public int getQuantidadeEspera() {
        return quantidadeEspera;
    }

    public void setQuantidadeEspera(int quantidadeEspera) {
        this.quantidadeEspera = quantidadeEspera;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}

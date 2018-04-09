import java.time.LocalDate;
import java.time.LocalTime;
//Classe UsuarioModel
//Classe responsavel por criar o Objeto Usuario

public class UsuarioModel {

    private String tipoUsuario;
    private String senha;
    private String servico;
    private String subServico;
    private LocalTime mediaEspera;
    private LocalTime horaEntrada;
    private LocalTime horaSaida;
    private LocalDate dia;
    private int lugarFila;
    private int quantidadeEspera;
    private int prioridade;
    private String status;

    public UsuarioModel() {

    }

    public UsuarioModel(String tipoUsuario, String senha,String servico, String subServico, LocalTime mediaEspera,
                        LocalTime horaEntrada, LocalTime horaSaida, LocalDate dia, int lugarFila,
                        int quantidadeEspera, int prioridade, String status){

        this.tipoUsuario = tipoUsuario;
        this.senha = senha;
        this.servico = servico;
        this.subServico = subServico;
        this.mediaEspera = mediaEspera;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.dia = dia;
        this.lugarFila = lugarFila;
        this.quantidadeEspera = quantidadeEspera;
        this.prioridade = prioridade;
        this.status = status;

    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getSubServico() {
        return subServico;
    }

    public void setSubServico(String subServico) {
        this.subServico = subServico;
    }

    public LocalTime getMediaEspera() {
        return mediaEspera;
    }

    public void setMediaEspera(LocalTime mediaEspera) {
        this.mediaEspera = mediaEspera;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

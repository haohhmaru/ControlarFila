import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
//Classe Horario model

public class HorarioModel extends UsuarioModel {

    private LocalTime horaAtual = LocalTime.now();
    private LocalTime horaEntrada = LocalTime.now();
    private LocalTime horaSaida = LocalTime.now();
    private LocalDate dia = LocalDate.now();
    private Duration mediaAtendimento;


    public HorarioModel(){}

    public HorarioModel(LocalTime horaAtual, LocalTime horaEntrada, LocalTime horaSaida, LocalDate dia, Duration mediaAtendimento){
        this.horaAtual = horaAtual;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.dia = dia;
        this.mediaAtendimento = mediaAtendimento;
    }

    public LocalTime getHoraAtual() {
        return horaAtual;
    }

    public void setHoraAtual(LocalTime horaAtual) {
        this.horaAtual = horaAtual;
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

    public Duration getMediaAtendimento() {
        return mediaAtendimento;
    }

    public void setMediaAtendimento(LocalTime horaEntrada, LocalTime horaSaida) {
        this.mediaAtendimento = Duration.between(horaEntrada, horaSaida);
    }
}

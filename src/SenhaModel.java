public class SenhaModel {

    private int senha = 100;
    private String tipoUsuario;
    private String tipoServico;
    private String subServico;

    public SenhaModel(){}

    public SenhaModel(String tipoUsuario, String tipoServico, String subServico){
        this.tipoUsuario = tipoUsuario;
        this.tipoServico = tipoUsuario;
        this.subServico = subServico;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha++;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoServico(){
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String getSubServico(){
        return subServico;
    }

    public void setSubServico(String subServico) {
        this.subServico = subServico;
    }

    public String GerarSenha(){
        return getTipoUsuario()+getTipoServico()+getSubServico()+String.valueOf(getSenha());
    }

}

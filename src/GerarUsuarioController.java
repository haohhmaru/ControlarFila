public class GerarUsuarioController {

    private UsuarioModel usuarioModel = new UsuarioModel();
    private HorarioModel horarioModel = new HorarioModel();
    private SenhaModel senhaModel = new SenhaModel();
    private String tipoAtendimento;
    private String tipoUsuario;

    public GerarUsuarioController(){}

    public GerarUsuarioController(UsuarioModel usuarioModel, HorarioModel horarioModel, SenhaModel senhaModel){
        this.usuarioModel = usuarioModel;
        this.horarioModel = horarioModel;
        this.senhaModel = senhaModel;
    }

    public UsuarioModel getUsuarioModel() {
        return usuarioModel;
    }

    public void setUsuarioModel(UsuarioModel usuarioModel) {
        this.usuarioModel = usuarioModel;
    }

    public HorarioModel getHorarioModel() {
        return horarioModel;
    }

    public void setHorarioModel(HorarioModel horarioModel) {
        this.horarioModel = horarioModel;
    }

    public SenhaModel getSenhaModel() {
        return senhaModel;
    }

    public void setSenhaModel(SenhaModel senhaModel) {
        this.senhaModel = senhaModel;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    private void usuarioModel() {
        usuarioModel.setTipoUsuario(getTipoUsuario());
        usuarioModel.setTipoAtendimento(getTipoAtendimento());


    }
}

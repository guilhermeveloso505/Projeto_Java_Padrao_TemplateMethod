package templatemethod;

public abstract class Atendimento {

    private int protocolo;
    protected String solicitante;
    private String descricao;

    public int getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(int protocolo) {
        this.protocolo = protocolo;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public final String realizarAtendimento() {
        return receberChamado() + " | " +
                diagnosticarProblema() + " | " +
                resolverProblema();
    }

    public String receberChamado() {
        return "Chamado recebido de " + this.solicitante;
    }

    public abstract String diagnosticarProblema();

    public abstract String resolverProblema();

    public abstract String getTipo();

    public String getInfo() {
        return getTipo() + "{" +
                "protocolo=" + this.protocolo +
                ", solicitante='" + this.solicitante + '\'' +
                ", descricao='" + this.descricao + '\'' +
                '}';
    }
}
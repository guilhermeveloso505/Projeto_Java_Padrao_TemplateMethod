package templatemethod;

public class AtendimentoRede extends Atendimento {

    public String diagnosticarProblema() {
        return "Diagnóstico: Falha na conexão de rede";
    }

    public String resolverProblema() {
        return "Solução: Reconfiguração da rede";
    }

    public String getTipo() {
        return "Atendimento Rede";
    }
}

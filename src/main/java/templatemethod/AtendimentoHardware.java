package templatemethod;

public class AtendimentoHardware extends Atendimento {

    public String diagnosticarProblema() {
        return "Diagnóstico: Falha nos componentes físicos";
    }

    public String resolverProblema() {
        return "Solução: Manutenção ou substituição de peças";
    }

    public String getTipo() {
        return "Atendimento Hardware";
    }
}
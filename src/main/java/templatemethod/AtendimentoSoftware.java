package templatemethod;

public class AtendimentoSoftware extends Atendimento {

    public String diagnosticarProblema() {
        return "Diagnóstico: Erro ou falha no sistema";
    }

    public String resolverProblema() {
        return "Solução: Correção ou reinstalação do software";
    }

    public String getTipo() {
        return "Atendimento Software";
    }
}
package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoSoftwareTest {

    @Test
    void deveRetornarDiagnosticoSoftware() {
        AtendimentoSoftware atendimento = new AtendimentoSoftware();

        assertEquals("Diagnóstico: Erro ou falha no sistema",
                atendimento.diagnosticarProblema());
    }

    @Test
    void deveRetornarSolucaoSoftware() {
        AtendimentoSoftware atendimento = new AtendimentoSoftware();

        assertEquals("Solução: Correção ou reinstalação do software",
                atendimento.resolverProblema());
    }

    @Test
    void deveRetornarInformacoes() {
        AtendimentoSoftware atendimento = new AtendimentoSoftware();

        atendimento.setProtocolo(102);
        atendimento.setSolicitante("Pedro");
        atendimento.setDescricao("Erro ao abrir o sistema");

        assertEquals("Atendimento Software{protocolo=102, solicitante='Pedro', descricao='Erro ao abrir o sistema'}",
                atendimento.getInfo());
    }

    @Test
    void deveRealizarAtendimento() {
        AtendimentoSoftware atendimento = new AtendimentoSoftware();

        atendimento.setSolicitante("Pedro");

        assertEquals("Chamado recebido de Pedro | Diagnóstico: Erro ou falha no sistema | Solução: Correção ou reinstalação do software",
                atendimento.realizarAtendimento());
    }
}
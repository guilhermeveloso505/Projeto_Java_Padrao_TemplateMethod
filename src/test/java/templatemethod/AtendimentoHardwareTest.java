package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoHardwareTest {

    @Test
    void deveRetornarDiagnosticoHardware() {
        AtendimentoHardware atendimento = new AtendimentoHardware();

        assertEquals("Diagnóstico: Falha nos componentes físicos",
                atendimento.diagnosticarProblema());
    }

    @Test
    void deveRetornarSolucaoHardware() {
        AtendimentoHardware atendimento = new AtendimentoHardware();

        assertEquals("Solução: Manutenção ou substituição de peças",
                atendimento.resolverProblema());
    }

    @Test
    void deveRetornarInformacoes() {
        AtendimentoHardware atendimento = new AtendimentoHardware();

        atendimento.setProtocolo(101);
        atendimento.setSolicitante("Pedro");
        atendimento.setDescricao("Computador não liga");

        assertEquals("Atendimento Hardware{protocolo=101, solicitante='Pedro', descricao='Computador não liga'}",
                atendimento.getInfo());
    }

    @Test
    void deveRealizarAtendimento() {
        AtendimentoHardware atendimento = new AtendimentoHardware();

        atendimento.setSolicitante("Pedro");

        assertEquals("Chamado recebido de Pedro | Diagnóstico: Falha nos componentes físicos | Solução: Manutenção ou substituição de peças",
                atendimento.realizarAtendimento());
    }
}
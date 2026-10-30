package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoRedeTest {

    @Test
    void deveRetornarDiagnosticoRede() {
        AtendimentoRede atendimento = new AtendimentoRede();

        assertEquals("Diagnóstico: Falha na conexão de rede",
                atendimento.diagnosticarProblema());
    }

    @Test
    void deveRetornarSolucaoRede() {
        AtendimentoRede atendimento = new AtendimentoRede();

        assertEquals("Solução: Reconfiguração da rede",
                atendimento.resolverProblema());
    }

    @Test
    void deveRetornarInformacoes() {
        AtendimentoRede atendimento = new AtendimentoRede();

        atendimento.setProtocolo(103);
        atendimento.setSolicitante("Pedro");
        atendimento.setDescricao("Sem conexão com a internet");

        assertEquals("Atendimento Rede{protocolo=103, solicitante='Pedro', descricao='Sem conexão com a internet'}",
                atendimento.getInfo());
    }

    @Test
    void deveRealizarAtendimento() {
        AtendimentoRede atendimento = new AtendimentoRede();

        atendimento.setSolicitante("Pedro");

        assertEquals("Chamado recebido de Pedro | Diagnóstico: Falha na conexão de rede | Solução: Reconfiguração da rede",
                atendimento.realizarAtendimento());
    }
}
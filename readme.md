# Padrão de Projeto Template Method

## Sobre o projeto

Projeto desenvolvido em Java para praticar o padrão de projeto **Template Method**, utilizando como exemplo um sistema de suporte técnico que realiza atendimentos de diferentes categorias, como problemas de hardware, software e rede.

## Funcionalidades

- Recebimento de chamados técnicos.
- Diagnóstico de problemas de hardware.
- Diagnóstico de problemas de software.
- Diagnóstico de problemas de rede.
- Aplicação de soluções específicas para cada tipo de atendimento.
- Execução de um fluxo padronizado de atendimento.
- Armazenamento das informações dos chamados.

## Estrutura do projeto

- Atendimento: classe abstrata que define os atributos, métodos comuns e o fluxo principal de atendimento.
- AtendimentoHardware: realiza diagnósticos e soluções relacionados a componentes físicos.
- AtendimentoSoftware: realiza diagnósticos e soluções relacionados a erros e falhas em sistemas.
- AtendimentoRede: realiza diagnósticos e soluções relacionados à conexão e infraestrutura de rede.
- AtendimentoHardwareTest: realiza testes unitários dos atendimentos de hardware.
- AtendimentoSoftwareTest: realiza testes unitários dos atendimentos de software.
- AtendimentoRedeTest: realiza testes unitários dos atendimentos de rede.

## Padrão de projeto

O padrão **Template Method** define a estrutura de um algoritmo em uma classe abstrata, permitindo que suas subclasses implementem etapas específicas sem modificar a sequência principal de execução.

Neste projeto, a classe `Atendimento` estabelece o fluxo de atendimento por meio do método `realizarAtendimento()`, enquanto as subclasses implementam seus próprios métodos de diagnóstico e resolução de problemas.

## Autor

Guilherme Veloso Luciano
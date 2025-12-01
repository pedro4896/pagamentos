# Documentação do uso da IA na Questão 3 (Adapter)

## Prompts utilizados

1. "Crie uma implementação em Java para a Questão 3 da Lista Avaliativa II utilizando o padrão Adapter, adaptando os sistemas de pagamento MPay e PPay."
2. "Adicione uma classe PayPalAdapter que permita integrar a API MPay com a nova API PayPal."

## O que a IA gerou

- Estrutura das interfaces `MPay` e `PPay`
- Implementação das classes de `MPay` e `PPay`
- Implementação do `PaymentAdapter` para adaptar MPay para PPay
- Classe `Main.java` para testar a adaptação entre as duas APIs de pagamento

## Ajustes manuais feitos

- A IA forneceu a estrutura básica das interfaces, mas foi necessário ajustar:
    - A implementação do método `processPayment` no `PayPalAdapter` para garantir que ele chamasse corretamente o método `makePayment` do `MPay`.
    - Melhorei a formatação da saída no terminal para tornar mais claro o que estava sendo feito em cada etapa do pagamento.

## Porque os ajustes foram necessários

Os ajustes ajudaram a garantir que a integração entre MPay e PayPal fosse feita corretamente e de forma compreensível.

Essas melhorias tornaram o código mais robusto e alinhado com os requisitos da atividade.

# Uso de IA nesta questão

## Ferramenta
Claude (Anthropic), no modo Cowork.

## Prompt utilizado
> Faça o passo a passo dessa atividade avaliativa cumprindo cada requisito pedido nela

Anexo enviado junto com o prompt: `Lista Avaliativa I.pdf` (enunciado).

## Passo a passo (tutorial) sugerido pela IA para esta questão

| Passo | O que fazer | Commit correspondente |
|---|---|---|
| 1 | Identificar os papéis do Factory Method no enunciado e desenhar o diagrama de classes. | `Passo 1` |
| 2 | Criar o **Produto**: interface `Inimigo` com `atacar(Jogador)`, e a classe `Jogador`. | `Passo 2` |
| 3 | Criar os **Produtos concretos**: `AnimalMutante` e `Cangaceiro`. | `Passo 3` |
| 4 | Criar o **Criador** abstrato `Localizacao`, com o *factory method* `criarInimigo()` e a operação `receberJogador(Jogador)`, que usa o inimigo criado sem saber a classe concreta. | `Passo 4` |
| 5 | Criar os **Criadores concretos** `Amazonia` e `Sertao`, que sobrescrevem `criarInimigo()`. | `Passo 5` |
| 6 | Escrever a simulação (`Main`): o jogador passa pelas localizações e é atacado. | `Passo 6` |
| 7 | Mostrar a extensão futura (Rio de Janeiro / criminosos) **sem alterar** nenhuma classe existente. | `Passo 7` |

## Ajustes feitos sobre o que a IA sugeriu
Cada ajuste está num commit que começa com **"Ajuste:"**, com o motivo na mensagem. Resumo:

1. **Nome da localização via `getClass().getSimpleName()`** — imprimia "Sertao"/"Amazonia" (sem acento) e
   amarrava o texto do jogo ao nome da classe Java. Passou a ser um nome informado no construtor.
2. **Mensagem de chegada** — "chegou em Rio de Janeiro" ficou incorreto em português; trocado por
   "entrou na fase: <nome>", que serve para qualquer localização.

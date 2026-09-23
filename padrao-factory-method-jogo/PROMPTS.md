# Uso de IA nesta questão

## Prompt utilizado

Ferramenta: Claude (Anthropic). Anexo: `Lista Avaliativa I.pdf` (enunciado).

> Contexto: jogo de ação em Java, ambientado em localizações brasileiras. Cada localização tem inimigos
> próprios: Amazônia com animais mutantes e Sertão com cangaceiros; no futuro, Rio de Janeiro com
> criminosos. Independentemente da localização, os inimigos sempre atacam o jogador que passa pela região,
> e para o jogador só importa que haverá inimigos para enfrentar.
>
> Objetivo: modelar e implementar essa situação com o padrão Factory Method, produzindo diagrama de
> classes, código e simulação, com os artefatos tão simples quanto possível. O código do jogo que usa os
> inimigos não pode instanciar classes concretas de inimigo, e acrescentar uma nova localização não pode
> exigir alteração nas classes já existentes.
>
> Não me dê a solução pronta. Me dê um passo a passo (tutorial) incremental para eu implementar, seguindo
> estas condições:
> 1. comece pela identificação dos papéis do padrão (produto, produtos concretos, criador, criadores
>    concretos) e pelo diagrama de classes, antes de qualquer código;
> 2. cada etapa deve deixar o projeto compilando, para virar um commit isolado, indicando quais arquivos
>    são criados ou alterados;
> 3. explique onde fica o factory method, por que ele é abstrato e por que o código comum da superclasse
>    não precisa saber qual inimigo foi criado;
> 4. termine com uma etapa que acrescente a localização futura (Rio de Janeiro) e mostre quais classes
>    existentes precisaram ou não ser modificadas.

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

# Uso de IA nesta questão

## Ferramenta
Claude (Anthropic), no modo Cowork.

## Prompt utilizado
> Faça o passo a passo dessa atividade avaliativa cumprindo cada requisito pedido nela

Anexos enviados junto com o prompt: `Lista Avaliativa I.pdf` (enunciado) e `src.zip` (código inicial).

## Passo a passo (tutorial) sugerido pela IA para esta questão

| Passo | O que fazer | Commit correspondente |
|---|---|---|
| 1 | Criar, **dentro do modelo de busca**, a interface `QueryFilter` com o método `boolean shouldNotify(String query)` (a *Strategy*). | `Passo 1` |
| 2 | Mudar o registro de observador para `addQueryObserver(QueryObserver, QueryFilter)` e guardar o par observador+filtro. | `Passo 2` |
| 3 | Na notificação, perguntar ao filtro de cada observador se ele quer aquela consulta antes de chamar `onQuery`. | `Passo 3` |
| 4 | No `Snooper`, registrar dois observadores: "Oh Yes!" (contém *friend*, sem diferenciar maiúsculas) e "So long" (mais de 60 caracteres). | `Passo 4` |
| 5 | Compilar, rodar e comparar com a saída de exemplo do enunciado. | `Ajuste` (commits seguintes) |

## Ajustes feitos sobre o que a IA sugeriu
Cada ajuste tem um commit próprio começando com **"Ajuste:"**, e a mensagem explica
(1) por que a sugestão original não servia totalmente e (2) por que o ajuste melhora a solução.
Resumo:

1. **Caminho do arquivo** — o `Main` procura `data/Hamlet.txt`, mas o arquivo veio na raiz. Ao rodar, dava
   `FileNotFoundException` e nenhuma saída. Movemos o arquivo para `data/` (em vez de mudar o código),
   pois é a estrutura que o próprio código inicial documenta.
2. **Filtros como classes nomeadas** — a primeira versão usava lambdas anônimas dentro do `Snooper`.
   Extraímos `FriendFilter` e `LongQueryFilter` para deixar explícito que são *estratégias concretas*
   intercambiáveis (facilita a arguição e o reuso), e o limite de 60 virou parâmetro.

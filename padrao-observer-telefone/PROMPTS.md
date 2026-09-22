# Uso de IA nesta questão

## Ferramenta
Claude (Anthropic), no modo Cowork.

## Prompt utilizado
> Faça o passo a passo dessa atividade avaliativa cumprindo cada requisito pedido nela

Anexos enviados junto com o prompt: `Lista Avaliativa I.pdf` (enunciado) e `src.zip` (código inicial).

## Passo a passo (tutorial) sugerido pela IA para esta questão

| Passo | O que fazer | Commit correspondente |
|---|---|---|
| 1 | Criar a interface `PhoneObserver` com `onDigitAdded(int digit)`. | `Passo 1` |
| 2 | No `PhoneModel`, manter uma lista de observadores, oferecer `addObserver(...)` e notificar todos dentro de `addDigit`. | `Passo 2` |
| 3 | Na `Screen`, registrar dois observadores: um imprime o último dígito; outro, quando o número completa 12 dígitos, imprime "Agora discando <número>...". | `Passo 3` |
| 4 | Compilar, rodar e comparar com a saída do enunciado. | `Ajuste` (commits seguintes) |

## Ajustes feitos sobre o que a IA sugeriu
Cada ajuste tem um commit próprio começando com **"Ajuste:"**, explicando por que a sugestão não
servia totalmente e por que o ajuste melhora a solução. Resumo:

1. **Dígitos inválidos e texto em inglês no KeyPad** — `MAX_DIGIT = 12` sorteava 10 e 11, que não são dígitos
   de telefone; e a saída esperada é "Pressionando: X", não "Pressing: X".
2. **Número fixo para reproduzir a saída do enunciado** — com dígitos aleatórios nunca sairia
   `081999887766`. Foi criado `KeyPad.dial(String)`; a simulação aleatória continua existindo.
3. **Encapsulamento da lista de dígitos** — `getDigits()` devolvia a lista interna; qualquer observador
   poderia alterá-la. Passou a devolver uma visão somente-leitura.

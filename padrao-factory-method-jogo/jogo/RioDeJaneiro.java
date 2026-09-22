/**
 * Criador concreto: no Rio de Janeiro os inimigos sao criminosos.
 * Adicionado sem alterar nenhuma classe existente (so o Main, para incluir a fase).
 */
public class RioDeJaneiro extends Localizacao {
    public RioDeJaneiro() {
        super("Rio de Janeiro");
    }

    @Override
    protected Inimigo criarInimigo() {
        return new Criminoso();
    }
}

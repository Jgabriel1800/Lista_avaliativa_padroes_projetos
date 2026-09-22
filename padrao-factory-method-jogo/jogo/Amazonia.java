/**
 * Criador concreto: na Amazonia os inimigos sao animais mutantes.
 */
public class Amazonia extends Localizacao {
    public Amazonia() {
        super("Amazônia");
    }

    @Override
    protected Inimigo criarInimigo() {
        return new AnimalMutante();
    }
}

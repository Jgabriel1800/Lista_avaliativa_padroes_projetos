/**
 * Criador concreto: no Sertao os inimigos sao cangaceiros.
 */
public class Sertao extends Localizacao {
    public Sertao() {
        super("Sertão");
    }

    @Override
    protected Inimigo criarInimigo() {
        return new Cangaceiro();
    }
}

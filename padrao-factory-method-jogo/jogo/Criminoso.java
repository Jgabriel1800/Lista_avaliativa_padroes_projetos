/**
 * Produto concreto: inimigo do Rio de Janeiro (fase futura).
 */
public class Criminoso implements Inimigo {
    @Override
    public void atacar(Jogador jogador) {
        System.out.println("  Um criminoso aparece no beco e ataca " + jogador.getNome() + "!");
    }
}

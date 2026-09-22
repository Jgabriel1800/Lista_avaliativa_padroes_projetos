/**
 * Produto concreto: inimigo da Amazonia.
 */
public class AnimalMutante implements Inimigo {
    @Override
    public void atacar(Jogador jogador) {
        System.out.println("  Um animal mutante salta da mata e ataca " + jogador.getNome() + "!");
    }
}

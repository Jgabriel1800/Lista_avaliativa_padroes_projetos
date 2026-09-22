/**
 * Produto concreto: inimigo do Sertao.
 */
public class Cangaceiro implements Inimigo {
    @Override
    public void atacar(Jogador jogador) {
        System.out.println("  Um cangaceiro surge na caatinga e ataca " + jogador.getNome() + "!");
    }
}

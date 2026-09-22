/**
 * Simulacao: o jogador atravessa as fases do jogo e e atacado
 * pelos inimigos de cada localizacao.
 */
public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Jogador 1");

        // Para o jogador tanto faz a localizacao: todas sao tratadas como Localizacao
        Localizacao[] fases = { new Amazonia(), new Sertao(), new RioDeJaneiro() };

        for (Localizacao fase : fases) {
            fase.receberJogador(jogador);
        }
    }
}

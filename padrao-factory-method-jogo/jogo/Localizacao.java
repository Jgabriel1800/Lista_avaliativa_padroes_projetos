/**
 * Criador do Factory Method.
 * Define o que acontece quando o jogador chega (receberJogador),
 * mas deixa para as subclasses decidir QUAL inimigo criar (criarInimigo).
 */
public abstract class Localizacao {
    private final String nome;

    protected Localizacao(String nome) {
        this.nome = nome;
    }

    // Factory method: cada localizacao concreta decide o tipo de inimigo
    protected abstract Inimigo criarInimigo();

    public void receberJogador(Jogador jogador) {
        System.out.println(jogador.getNome() + " entrou na fase: " + nome);
        Inimigo inimigo = criarInimigo(); // nao sabe (nem precisa saber) a classe concreta
        inimigo.atacar(jogador);          // garantia: sempre ha um inimigo para enfrentar
    }
}

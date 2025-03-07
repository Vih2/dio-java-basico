public class Gato {
    String nome = "";
    String cor = "";
    String raca = "";
    Double peso = 0.0;

    public Gato(String nome, Double peso, String raca, String cor) {
        this.nome = nome;
        this.peso = peso;
        this.raca = raca;
        this.cor = cor;

    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", raca='" + raca + '\'' +
                ", peso=" + peso +
                '}';
    }
}

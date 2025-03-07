

public class App {
    public static void main(String[] args) throws Exception {
       Pessoa bruna = new Pessoa("joana" , 21, "preta");
       System.out.println(bruna.cor);
       System.out.println(bruna.idade);
       System.out.println(bruna.nome);
       Gato gato = new Gato("Luna", 2.5, "SRD", "preta");
        System.out.println(gato.toString());
        System.out.println(gato.nome + "\n" + gato.peso + "\n" + gato.raca + "\n" + gato.cor);

    }
}


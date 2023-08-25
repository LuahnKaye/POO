public class Palestrante {
    String nome;
    String telefone;
    String eMail;

    Palestrante(String nome, String telefone, String eMail) {
        this.nome = nome;
        this.telefone = telefone;
        this.eMail = eMail;
    }

    void proporEvento(String nomeEvento) {
        System.out.println("O palestrante " + nome + " propôs o evento: " + nomeEvento);
    }
}
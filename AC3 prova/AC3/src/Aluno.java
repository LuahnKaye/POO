
public class Aluno {
    String nome;
    String curso;
    String matricula;

    Aluno(String nome, String curso, String matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    void informacoes() {
        System.out.println("O Aluno " + this.nome + "do curso: " + this.curso + "tem a matricula: " + this.matricula);
    }
}

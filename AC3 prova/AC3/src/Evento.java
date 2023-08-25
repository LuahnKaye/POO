class Evento {
    String nome, data, local;
    int numMaxPart;
    Aluno aluno;
    Palestrante Palestrante;

    Evento(String nome, String data , String local , int numMaxPart){
        this.nome = nome;
        this.data = data;        
        this.local = local; 
        this.numMaxPart = numMaxPart;
    }
    void incluiAluno(Aluno al){
        this.aluno = al;
    }
    void incluiPalestrante(Palestrante pa){
        this.Palestrante = pa;
    }
    void exibeFut (String data){
        this.data = data;
    }
}
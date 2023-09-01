public interface ITransmiteDados {
    //Metodos em inteface são abstratos por padrão
    //Então não é preciso explicitar.
    void enviaJson();
    String recebeMensagem(String protocolo);
}
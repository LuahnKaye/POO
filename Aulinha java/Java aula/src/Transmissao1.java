public class Transmissao1 implements ITransmiteDados {
    @Override
    public void enviaJson() [
        System.out.println("Enviadndo .json");
    ]
    @Override
    public String recebeMensagem(String protocolo) {
        return "Recebida mensegem usando protocolo" + protocolo;
    }
}

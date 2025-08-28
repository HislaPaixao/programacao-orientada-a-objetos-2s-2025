package sistema_radar;

public class Radar {
    public Integer limiteVelocidade;
    public String localizacao;

    public void avaliarVelocidade(Carro carro){
        if (carro.velocidade > this.limiteVelocidade) {
            //emitir notificação
            emitirNotificacao(carro.placa, carro.velocidade);
        }
    }

    public void emitirNotificacao(String placa, Integer velocidadeObervada){
        System.out.println("Placa: " +placa);
        System.out.println("Velocidade Observada: " +velocidadeObervada);
        System.out.println("Limite de Velocidade: " +this.limiteVelocidade);
    }
}

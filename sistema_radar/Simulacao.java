package sistema_radar;

public class Simulacao {
    public static void main(String[] args){
        System.out.println("Simulação");

        Carro fuscarosa = new Carro("ACLR5633","itamar", 1980, 0);  //new Carro é método construtor
        //fuscarosa.ano = 1980;
        //fuscarosa.modelo = "itamar";
        //fuscarosa.placa = "ACLR5633";
        //fuscarosa.velocidade = 0;

        Radar radar = new Radar(60, "samambaia");
        //radar.limiteVelocidade = 60;
        //radar.localizacao = "Samambaia";

        radar.avaliarVelocidade(fuscarosa);

        fuscarosa.acelerar();
        fuscarosa.acelerar();
        fuscarosa.acelerar();
        fuscarosa.acelerar();
        fuscarosa.acelerar();
        fuscarosa.acelerar();
        fuscarosa.acelerar();

        fuscarosa.setVelocidade(-60);

        radar.avaliarVelocidade(fuscarosa);

        fuscarosa.frear();

        radar.avaliarVelocidade(fuscarosa);
    }
}
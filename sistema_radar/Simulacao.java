package sistema_radar;

public class Simulacao {
    public static void main(String[] args){
        System.out.println("Simulação");

        Carro fuscarosa = new Carro(); 
        fuscarosa.ano = 1980;
        fuscarosa.modelo = "itamar";
        fuscarosa.placa = "ACLR5633";
        fuscarosa.velocidade = 0;

        Radar radar = new Radar();
        radar.limiteVelocidade = 60;
        radar.localizacao = "Samambaia";

        radar.avaliarVelocidade(fuscarosa);

        fuscarosa.acelerar();
        fuscarosa.acelerar();
        fuscarosa.acelerar();
        fuscarosa.acelerar();
        fuscarosa.acelerar();
        fuscarosa.acelerar();
        fuscarosa.acelerar();

        radar.avaliarVelocidade(fuscarosa);

        fuscarosa.frear();

        radar.avaliarVelocidade(fuscarosa);
    }


}

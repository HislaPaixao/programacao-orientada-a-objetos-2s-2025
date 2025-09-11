package sistema_iptu;

public class Chacara extends Imovel{
   
    private Boolean pussuiPocoArtesiano;


    public Chacara(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiElevador, Boolean pussuiPocoArtesiano) {
        super(municipio, areaM2, vagas);
    }

    public Boolean getPussuiPocoArtesiano() {
        return this.pussuiPocoArtesiano;
    }

    public void setPussuiPocoArtesiano(Boolean pussuiPocoArtesiano) {
        this.pussuiPocoArtesiano = pussuiPocoArtesiano;
    }

}

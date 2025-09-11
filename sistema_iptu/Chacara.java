package sistema_iptu;

public class Chacara {
    private Municipio municipio;
    private Double areaM2;
    private Integer vagas;
    private Boolean possuiElevador;
    private Boolean pussuiPocoArtesiano;

    public Double calcularIPTU(){
        return this.areaM2 * this.municipio.getPrecoM2();
    } 


    public Chacara(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiElevador, Boolean pussuiPocoArtesiano) {
        this.municipio = municipio;
        this.areaM2 = areaM2;
        this.vagas = vagas;
        this.possuiElevador = possuiElevador;
        this.pussuiPocoArtesiano = pussuiPocoArtesiano;
    }

    public Municipio getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Double getAreaM2() {
        return this.areaM2;
    }

    public void setAreaM2(Double areaM2) {
        this.areaM2 = areaM2;
    }

    public Integer getVagas() {
        return this.vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public Boolean isPossuiElevador() {
        return this.possuiElevador;
    }

    public Boolean getPossuiElevador() {
        return this.possuiElevador;
    }

    public void setPossuiElevador(Boolean possuiElevador) {
        this.possuiElevador = possuiElevador;
    }

    public Boolean isPussuiPocoArtesiano() {
        return this.pussuiPocoArtesiano;
    }

    public Boolean getPussuiPocoArtesiano() {
        return this.pussuiPocoArtesiano;
    }

    public void setPussuiPocoArtesiano(Boolean pussuiPocoArtesiano) {
        this.pussuiPocoArtesiano = pussuiPocoArtesiano;
    }

}

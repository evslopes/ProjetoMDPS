package br.edu.infnet.mdps.mdps.model.domain;

public class Acompanhante extends Usuario{

    private Integer idCia;
    private Gestante gestante;

    public Acompanhante() {
    }

    public Integer getIdCia() {
        return idCia;
    }

    public void setIdCia(Integer idCia) {
        this.idCia = idCia;
    }

    public Gestante getGestante() {
        return gestante;
    }

    public void setGestante(Gestante gestante) {
        this.gestante = gestante;
    }
}

package br.edu.infnet.mdps.mdps.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gestante extends Usuario{
    private Integer idGestante;
    private Date DPP; //Data Provável do Parto
    private List<Doula> Doulandas = new ArrayList<>();

    public Gestante() {
    }

    public Integer getIdGestante() {
        return idGestante;
    }

    public void setIdGestante(Integer idGestante) {
        this.idGestante = idGestante;
    }

    public Date getDPP() {
        return DPP;
    }

    public void setDPP(Date DPP) {
        this.DPP = DPP;
    }

    public List<Doula> getDoulandas() {
        return Doulandas;
    }

    public void setDoulandas(List<Doula> doulandas) {
        Doulandas = doulandas;
    }
}

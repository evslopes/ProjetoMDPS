package br.edu.infnet.mdps.mdps.model.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Gestante{

    @Id
    @Column(name = "idGestante", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGestante;
    private Date DPP; //Data Provável do Parto

    @ManyToOne
    @JoinColumn(name = "idDoula")
    private Doula Doula;

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

    public br.edu.infnet.mdps.mdps.model.domain.Doula getDoula() {
        return Doula;
    }

    public void setDoula(br.edu.infnet.mdps.mdps.model.domain.Doula doula) {
        Doula = doula;
    }
}

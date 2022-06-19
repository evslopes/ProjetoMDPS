package br.edu.infnet.mdps.mdps.model.domain;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Gestante extends Usuario{
    @Id
    @Column(name = "idGestante", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGestante;
    private Integer IGG; // Idade Gestacional Gestante
    private Date DPP; //Data Provável do Parto

    @ManyToOne
    @JoinColumn(name = "idDoula")
    private Doula Doula;

    @OneToOne
    @JoinColumn(name = "endereco_id_gestante")
    private Endereco endereco;


    public Gestante() {
    }

    public void atualizarIGG(int idade){
        int novaIGG = getIGG() + idade;
        setIGG(novaIGG);
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

    public Integer getIGG() {
        return IGG;
    }

    public void setIGG(Integer IGG) {
        this.IGG = IGG;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

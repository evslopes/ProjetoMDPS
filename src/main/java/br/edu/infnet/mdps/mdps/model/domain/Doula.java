package br.edu.infnet.mdps.mdps.model.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Doula{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDoula;
    @OneToOne
    @JoinColumn(name = "idEndereco")
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "idGestante")
    private List<Gestante> Doulandas = new ArrayList<>();

    public Doula() {
    }

    public Integer getIdDoula() {
        return idDoula;
    }

    public void setIdDoula(Integer idDoula) {
        this.idDoula = idDoula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Gestante> getDoulandas() {
        return Doulandas;
    }

    public void setDoulandas(List<Gestante> doulandas) {
        Doulandas = doulandas;
    }
}

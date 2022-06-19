package br.edu.infnet.mdps.mdps.model.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Doula extends Usuario{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDoula;

    private String especializacao;

    private boolean disponibilidade;

    @OneToOne
    @JoinColumn(name = "idEndereco")
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "idGestante")
    private List<Gestante> Doulandas = new ArrayList<>();

    public Doula() {
    }

    private boolean disponibilizarAtendimento(){
        return true;
    }

    private void listarGestantes(){
        getDoulandas();
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

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}

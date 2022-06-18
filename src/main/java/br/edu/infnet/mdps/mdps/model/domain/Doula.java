package br.edu.infnet.mdps.mdps.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Doula extends Usuario{
    private Integer idDoula;
    private Endereco endereco;
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

package br.edu.infnet.mdps.mdps.model.domain;

import javax.persistence.*;

@Entity
public class Endereco {
    @Id
    @Column(name = "idGestante", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEndereco;
    private String CEP;
    private String rua;
    private String bairro;
    private String cidade;
    private String UF;

    @OneToOne
    private Usuario usuario;

    public Integer getidEndereco() {
        return idEndereco;
    }

    public void setidEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}



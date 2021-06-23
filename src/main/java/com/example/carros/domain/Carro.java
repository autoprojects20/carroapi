package com.example.carros.domain;

public class Carro {
    private long id;
    private String datavistoria;
    private String navio;
    private String numeroembarque;
    private String bl;
    private String modeloveiculo;
    private String chassi;

    public Carro(long id, String datavistoria, String navio, String numeroembarque, String bl, String modeloveiculo, String chassi) {
        this.id = id;
        this.datavistoria = datavistoria;
        this.navio = navio;
        this.numeroembarque = numeroembarque;
        this.bl = bl;
        this.modeloveiculo = modeloveiculo;
        this.chassi = chassi;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNavio() {
        return navio;
    }

    public void setNavio(String navio) {
        this.navio = navio;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getModeloveiculo() {
        return modeloveiculo;
    }

    public void setModeloveiculo(String modeloveiculo) {
        this.modeloveiculo = modeloveiculo;
    }

    public String getBl() {
        return bl;
    }

    public void setBl(String bl) {
        this.bl = bl;
    }

    public String getNumeroembarque() {
        return numeroembarque;
    }

    public void setNumeroembarque(String numeroembarque) {
        this.numeroembarque = numeroembarque;
    }

    public String getDatavistoria() {
        return datavistoria;
    }

    public void setDatavistoria(String datavistoria) {
        this.datavistoria = datavistoria;
    }
}

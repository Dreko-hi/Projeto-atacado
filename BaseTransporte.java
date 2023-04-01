package br.com.atacado.dominio;

import java.time.LocalDate;

public abstract class BaseTransporte {

    protected int codigoVeiculo;

    protected String descricao;

    protected LocalDate dataDeInclusao;

    public int getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public void setCodigoVeiculo(int codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInclusao() {
        return dataDeInclusao;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataDeInclusao = dataInclusao;
    }

    public BaseTransporte(int codigoVeiculo, String descricao, LocalDate dataInclusao) {
        this.codigoVeiculo = codigoVeiculo;
        this.descricao = descricao;
        this.dataDeInclusao = dataInclusao;

    }

    public abstract void Imprime();

}

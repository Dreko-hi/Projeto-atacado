package br.com.atacado.dominio;

import java.time.LocalDate;

public class Veiculo extends BaseTransporte {

    private int codigoFrota;

    private String placa;

    public int getCodigoFrota() {
        return codigoFrota;
    }

    public void setCodigoFrota(int codigoFrota) {
        this.codigoFrota = codigoFrota;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Veiculo(int codigoVeiculo, String descricao, LocalDate dataDeInclusao, int codigoFrota, String placa) {
        super(codigoVeiculo, descricao, dataDeInclusao);
        this.codigoFrota = codigoFrota;
        this.placa = placa;

    }

    @Override
    public void Imprime() {
        System.out.println("-- Detalhes veiculo & frota --");
        System.out.println("Código do veículo: " + this.codigoVeiculo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Código da frota: " + this.codigoFrota);
        System.out.println("Placa: " + this.placa);

    }

    @Override
    public String toString() {
        return "Veiculo [" +
                "codigoVeiculo= " + codigoVeiculo +
                ", descricao= " + descricao +
                ", dataDeInclusao= " + dataDeInclusao +
                ", codigoFrota= " + codigoFrota +
                ", placa= " + placa
                + "]";

    }

}
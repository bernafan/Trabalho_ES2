/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bernardo
 */
public class Material {
    private String nome;
    private String descricao;
    private double valorUnitario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    public String toString() {
        String texto = "Nome: " + getNome() + "\nDescrição: " + getDescricao() + "\nValor: " + getValorUnitario();
        texto += "\n-----------------------------";
        return texto;
    }
}

package cursoPooUdemy.exemplo2.model;

import java.util.Date;

import cursoPooUdemy.exemplo2.utils.DataUtil;

public class Movimentacao {

    //#region Atributos
    private String descricao;
    private Date data;
    private Double valor;

    //#endregion

    //#region Construtores
    public Movimentacao(String descricao, Double valor) {
        this.descricao = descricao;
        this.data = new Date();
        this.valor = valor;
    }

    //#endregion

    //#region Getters e Setters
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getData() {
        return data;
    }
    
    public Double getValor() {
        return valor;
    }
//    nao usamos o setData e nem o setValor, pois não queremos que alguem mude esses dados, sempre que quisermos proteger algum dados nao usamos o Set

    //#endregion

    //#region Metodos

    @Override //Override serve para sobre-escrever um metodo ,no caso estou sobre-escrevendo o toString que é um metodo primitivo do java
    public String toString(){
        // Descrição - Data e Hora - Valor
        String dataFormatada = DataUtil.conveterDateParaDataEHora(this.data);
        return this.getDescricao() + "\n" + dataFormatada + " - R$" + this.getValor();
    }

    //#endregion
}


//    Extrato bancario é composto por movimentações bancárias.
    // Ter algo que possa se a movimentação
    //ter uma lista de movimentações
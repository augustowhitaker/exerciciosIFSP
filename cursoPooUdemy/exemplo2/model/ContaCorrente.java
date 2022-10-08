package cursoPooUdemy.exemplo2.model;

import java.util.Date;

import cursoPooUdemy.exemplo2.utils.DataUtil;

// Perceba abaixo que Aqui trabalhamos com herença, para isso usamos a palavra reservada extends que significa "estendendo / herdando"
public class ContaCorrente extends ContaBancaria{

    //Perceba abaixo que, Precisamos criar um construtor para ContaCorrente,pois  ContaBancaria tem construtores e precisamos "puxar" eles, pois vamos herdar seus dados
    public ContaCorrente(String agencia, String conta, Integer digito, Double saldoInicial) {
        // A diferença é que criou-se o construtor só que ao invés dele colocar em suas propriedades,ele chama o metodo super, super significa que está passando de pai para filho,que aqui no caso é ContaBancaria
        // pai ContaBancaria
        // filho ContaCorrente e ContaPoupança
        super(agencia, conta, digito, saldoInicial);//aqui por baixo ele cria uma conta bancaria
        
    }

    @Override
    public void imprimirExtrato() {
        
        System.out.println("******************************************");
        System.out.println("***************** Extrato Bancario *************************");
        System.out.println("******************************************");
        System.out.println();

        System.out.println("Gerado em:" + DataUtil.conveterDateParaDataEHora(new Date()));
        System.out.println();

        for (Movimentacao movimentacao : this.movimentacoes) {  
            System.out.println(movimentacao);
            System.out.println();
        }

        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");
    }

}

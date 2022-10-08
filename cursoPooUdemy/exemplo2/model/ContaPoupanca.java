package cursoPooUdemy.exemplo2.model;

import java.util.Date;

import cursoPooUdemy.exemplo2.utils.DataUtil;

// Herdando conta bancaria como em conta corrente
public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String agencia, String conta, Integer digito, Double saldoInicial) {
        super(agencia, conta, digito, saldoInicial);
       
    }

    @Override
    public void imprimirExtrato() {
         
        System.out.println("******************************************");
        System.out.println("***************** Extrato Poupança *************************");
        System.out.println("******************************************");
        System.out.println();

        System.out.println("Gerado em:" + DataUtil.conveterDateParaDataEHora(new Date()));
        System.out.println();

        // estamos usando o for each
        for (Movimentacao movimentacao : this.movimentacoes) {  
            System.out.println(movimentacao);
            System.out.println();
        }

        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("******************************************");
    }
        
}
    


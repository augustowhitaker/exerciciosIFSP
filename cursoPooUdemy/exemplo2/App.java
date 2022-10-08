package cursoPooUdemy.exemplo2;
 
// import cursoPooUdemy.exemplo2.model.ContaBancaria;
import cursoPooUdemy.exemplo2.model.ContaCorrente;
import cursoPooUdemy.exemplo2.model.ContaPoupanca;
// import cursoPooUdemy.exemplo2.model.Movimentacao;
import cursoPooUdemy.exemplo2.utils.DataUtil;

public class App {
    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();

        ContaCorrente conta = new ContaCorrente("0001", "7542", 5, 100.0);


        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

         conta.Sacar(150.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        ContaPoupanca conta2 = new ContaPoupanca("0001", "7543", 6, 170.0);

        conta2.transferir(60.0, conta);
        System.out.println("Saldo conta destino de R$" + conta2.getSaldo());
        System.out.println();

        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        // DataUtil util = new DataUtil(); sem o static temos que instanciar como nesse exemplo
    //    var formatado = util.conveterDateParaDataEHora(conta2.getDataAbertura()); 

        var formatado = DataUtil.conveterDateParaDataEHora(conta2.getDataAbertura());//com static nao precisamos instanciar.  DataUtil = nome da classe, converterDAteParaDtaEHora = nome do metodo
       System.out.println(formatado);
        
    //    Conta corrente
       conta.imprimirExtrato();
       System.out.println();
       System.out.println();

    //    Conta pupança
       conta2.imprimirExtrato();
        

        // ContaBancaria conta3 = new ContaBancaria("0001","75542",5,100.0); se vc descomentar e olhar em PROBLEMS verá que aparecera o erro que não é possivel instanciar ContaBancaria, isso porque usamos o abstract em nossa classe ContaBancaria
        
        
        
    //Porque que que funciona tranferir de uma conta  corrente para uma conta poupança?
    // Resposta: Porque em nosso (metodo/função) tranferir está dentro de ContaBancaria, e ContaCorrente e ContaPoupanca sao heranças de ContaBancaria
    }
}

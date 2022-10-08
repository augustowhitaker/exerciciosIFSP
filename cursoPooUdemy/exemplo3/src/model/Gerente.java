package cursoPooUdemy.exemplo3.src.model;

import cursoPooUdemy.exemplo3.src.interfaces.ICamareira;
import cursoPooUdemy.exemplo3.src.interfaces.IRecepcionista;

public class Gerente extends Pessoa implements ICamareira, IRecepcionista{

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
       
    }

    @Override
    public void atenderOTelefone() {
        System.out.println("Sou o gerente sei atender o telefone mais ou menos");
        System.out.println();
        
    }

    @Override
    public void falarIngles() {
        System.out.println("Sou o gerente sei falar muito bem o inglês");
        System.out.println();
        
    }

    @Override
    public void arrumaACama() {
        System.out.println("Sou o gerente e não sei muito bem arrumar a cama");
        System.out.println();
        
    }

    @Override
    public void limparQuarto() {
        System.out.println("Sou o gerente sei limpar o quarto mais ou menos");
        System.out.println();
        
    }
    
}

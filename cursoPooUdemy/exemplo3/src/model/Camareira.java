package cursoPooUdemy.exemplo3.src.model;

import cursoPooUdemy.exemplo3.src.interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira{

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        
    }

    @Override
    public void arrumaACama() {
        System.out.println("Sou a camareira e sei muito bem arrumar a cama");
        System.out.println();
        
    }

    @Override
    public void limparQuarto() {
        System.out.println("Sou a camareira e sei muito bem limpar o quarto");
        System.out.println();
        
    }
    
}

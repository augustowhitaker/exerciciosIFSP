package cursoPooUdemy.exemplo3.src.model;

import cursoPooUdemy.exemplo3.src.interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista{

    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        
    }

    @Override
    public void atenderOTelefone() {
        System.out.println("Sou a Recepcionistas e sei atender o telefone");
        System.out.println();
        
    }

    @Override
    public void falarIngles() {
        System.out.println("Sou a Recepcionistas e sei falar inglês");
        System.out.println();
        
    }
    
}

package exercicioIFSP;

public class Cliente extends Pessoa {
    protected int codigo;
    
    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    @Override
    public String imprimirDados() {
        
        return "O nome do cliente eh " + this.nome + ", seu codigo eh " + Integer.toString(this.codigo) + " e sua data de nascimento eh " + nascimento.getDataNascimento();
    }

    


}

package exercicioIFSP;

public class Funcionario extends Pessoa{

    protected float salario;

    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    @Override
    public String imprimirDados() {
        
        return "O nome do funcionario eh " + this.nome + ", seu salario eh " +Float.toString(this.salario) + ", e sua data de nascimento eh " + nascimento.getDataNascimento();
    }

    public float calculaImposto(){
        return (float) (this.salario * 0.03);
    }
        
}

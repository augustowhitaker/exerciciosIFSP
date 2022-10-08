package exercicioIFSP;

public class Gerente extends Funcionario{

    protected String area;

    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public String imprimirDados() {
        
        return "O nome do gerente eh " + this.nome + ", seu salario eh " + Float.toString(this.salario) + " e sua area eh " + this.area + " e sua data de nascimento eh " + nascimento.getDataNascimento();
    }

    @Override
    public float calculaImposto() {
        
        return (float) (this.salario * 0.05);
    }

    
}

package Faculdade.Exercicios.exercicioPraticoHerancaoPolimorfismo;

public class Funcionario extends Pessoa{

    protected Double salario;
    
    public Funcionario(String nome, int nascimento, Double salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    
    public Double calculoImposto(){
        
        return salario * (3F / 100);
    }
    
    @Override
    public void imprimeDados() {
        System.out.println("Nome " + this.nome + " nascimento" + this.nascimento + "Salario " + salario);
        
    }
}

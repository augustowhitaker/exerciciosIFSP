package Faculdade.Exercicios.exercicioPraticoHerancaoPolimorfismo;

public class Gerente extends Funcionario {
    
    protected String area;

    public Gerente(String nome, int nascimento, Double salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
        
    }

        @Override
        public Double calculoImposto() {
            
           return salario * (5F / 100);
        }
}

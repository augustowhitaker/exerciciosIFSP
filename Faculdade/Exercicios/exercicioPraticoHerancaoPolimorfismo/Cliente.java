package Faculdade.Exercicios.exercicioPraticoHerancaoPolimorfismo;

public class Cliente extends Pessoa{
    
    private Integer cod;    


    public Cliente(String nome, int nascimento, Integer cod) {
        super(nome, nascimento);
        this.cod = cod;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + this.nome + "Nascimento " + this.nascimento + " Codigo " + cod);
        
    }     
    
}

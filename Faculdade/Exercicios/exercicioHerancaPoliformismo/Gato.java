package Faculdade.Exercicios.exercicioHerancaPoliformismo;

public class Gato extends Animal{

    public Gato(String nome, int idade/*String ,som */ ) {
        super(nome, idade/*, som */);
        
        
    }
    @Override
    public void som(){
        System.out.println("Meoww");
    }
        
}

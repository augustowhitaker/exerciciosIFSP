package Faculdade.Exercicios.exercicioHerancaPoliformismo;

public class Cachorro extends Animal{


    public Cachorro(String nome, int idade/* , String som*/) {
        super(nome, idade/* , som*/);
       
    }
    
    @Override
    public void som(){
        System.out.println("Au Au");
    }
}

package Faculdade.Exercicios.exercicioHerancaPoliformismo;

public abstract class Animal {

    public String nome;
    public int idade;
    // public String som;


    public Animal(String nome, int idade/*, String som */) {
        this.nome = nome;
        this.idade = idade;
        //this.som = som;
    }
  public abstract void som();

}

package Faculdade.Exercicios.exercicioPraticoHerancaoPolimorfismo;

public abstract class Pessoa {
    
    protected String nome;
    protected int nascimento;


    public Pessoa(String nome, int nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNascimento() {
        return nascimento;
    }
    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public abstract void imprimeDados();
}

package Faculdade.Exercicios.exercicioPraticoHerancaoPolimorfismo;

import java.util.ArrayList;
    


public class CadastroPessoas {

    static int qtdAtual = 0;
    static ArrayList<Pessoa> pessoaList = new ArrayList<Pessoa>();
    public static void main(String[] args) {
        
    
    System.out.println("Cadastrando ....");
    cadastraPessoa(new Cliente("Fia", 2020, 12));
    System.out.println("Cliente 1");
    imprimeCadastro();   
    
    cadastraPessoa(new Funcionario("Ginger", 2022, 700.00));
    System.out.println("\n Funcionario 1");
    imprimeCadastro();

    cadastraPessoa(new Gerente("Downy", 2017, 1000.0, "Supervisor"));

    System.out.println("\nGerente 1");
    } 

    public static void cadastraPessoa(Pessoa pessoa){
        pessoaList.add(pessoa);
        qtdAtual++;
    }

    public static void imprimeCadastro(){
        for(Pessoa pessoas: pessoaList){
            pessoas.imprimeDados();
        }
    }

    public static void exibirImposto(){
        pessoaList.forEach(pessoa -> {
            Funcionario func = (Funcionario)pessoa;

            System.out.println(func);
        });
    }
}

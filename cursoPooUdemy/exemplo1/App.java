package cursoPooUdemy.exemplo1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Embaixo esta instanciando a classe, criando um objeto
        // Pessoa pessoa1 = new Pessoa();
        // pessoa1.setNome("Fia");
        // pessoa1.setIdade(30);
        // System.out.printf(pessoa1.getNome()+ "\n" +pessoa1.getIdade());
        // System.out.println("\n");


        Carro carro1 = new Carro();//construtor padrao
        Carro novoCarro = new Carro("Fiat", 2020, "Branca");//construtor personalizado

        System.out.println("Digite ano ");
        int ano = sc.nextInt();
        sc.nextLine();//limpando o buffer
        System.out.println("Digite modelo ");
        String mod = sc.nextLine();
        System.out.println("Digite cor ");
        String cor = sc.nextLine();

        carro1.setModelo(mod);
        carro1.setAno(ano);
        carro1.setCor(cor);
        
        carro1.Formato();
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());
        System.out.println(carro1.getCor());

        carro1.Formato();
        System.out.println(novoCarro.getModelo());
        System.out.println(novoCarro.getAno());
        System.out.println(novoCarro.getCor());

        sc.close();
    }
}
